package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * This class is used to print the model to files. It handles printing of a components and their
 * subcomponents. It is only in charge of printing the model to files and no transformations.
 * Package visibility because only for internal use.
 */
class ModelPrinter {
    private static final String ERROR_MESSAGE = "Error while prettyprinting";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    /**
     * Prints the model to the given directory. A model is a set of components.
     *
     * @param path The path to the directory where the model should be printed.
     * @param components The components to print.
     */
    public void prettyprint(Path path, Iterable<Component> components) {
        printComponents(path, components);
        cleanFolders(path);
    }

    /**
     * Clean the empty folders of the given path.
     *
     * @param path The path to clean.
     */
    private void cleanFolders(Path path) {
        try {
            SimpleFileVisitorExtension visitor = new SimpleFileVisitorExtension();
            Files.walkFileTree(path, visitor);
            Path endPath = visitor.currentPath.getParent();
            MoveTree walk = new MoveTree(endPath, Path.of(path.toString() + "/refactored"));
            Files.walkFileTree(endPath, walk);
            cleanEmptyFolders(path);
        } catch (IOException e) {
            logger.atWarning().withCause(e).log("Error while cleaning folders");
        }
    }
    /**
     * Prints the components to the given directory.
     *
     * @param path The path to the directory where the model should be printed.
     * @param components The components to print.
     */
    private void printComponents(Path path, Iterable<Component> components) {
        for (Component component : components) {
            component.prettyprint(path);
        }
    }
    /**
     * Clean the empty folders of the given path.
     *
     * @param path The path to clean.
     * @throws IOException if an error occurs while cleaning the folder.
     */
    private void cleanEmptyFolders(Path path) throws IOException {
        try (Stream<Path> paths = Files.walk(path)) {
            paths.sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .filter(File::isDirectory)
                    .filter(this::isEmptyDirectory)
                    .forEach(File::delete);
        }
    }

    /**
     * Checks if a given file is an empty directory.
     *
     * @return boolean if the given file is an empty directory.
     */
    private boolean isEmptyDirectory(File directory) {

        try (Stream<Path> paths = Files.list(directory.toPath())) {
            return paths.findFirst().isEmpty();
        } catch (IOException e) {
            logger.atWarning().withCause(e).log("Error while checking emptines of directory ");
            return false;
        }
    }
    /** This defines a class to find the depthest folder with a single child-folder. */
    private static final class SimpleFileVisitorExtension extends SimpleFileVisitor<Path> {
        private Path currentPath;

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {
            currentPath = dir;
            return dir.toFile().listFiles().length == 1
                    ? FileVisitResult.CONTINUE
                    : FileVisitResult.TERMINATE;
        }
    }
    /** This class is used to move a tree of files to a new location. */
    private static final class MoveTree implements FileVisitor<Path> {
        Path moveFrom;
        Path moveTo;
        FileTime time = null;

        public MoveTree(Path moveFrom, Path moveTo) {
            this.moveFrom = moveFrom;
            this.moveTo = moveTo;
        }

        public void moveSubTree(Path moveFrom, Path moveTo) throws IOException {
            try {
                Files.copy(
                        moveFrom,
                        moveTo,
                        StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);
                Files.delete(moveFrom);
            } catch (IOException e) {
                logger.atWarning().withCause(e).log(ERROR_MESSAGE);
            }
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            Path newdir = moveTo.resolve(moveFrom.relativize(dir));
            try {
                Files.setLastModifiedTime(newdir, time);
                Files.delete(dir);
            } catch (IOException e) {
                logger.atWarning().withCause(e).log(ERROR_MESSAGE);
            }

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {
            Path newdir = moveTo.resolve(moveFrom.relativize(dir));
            try {
                Files.copy(
                        dir,
                        newdir,
                        StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);
                time = Files.getLastModifiedTime(dir);
            } catch (IOException e) {
                logger.atWarning().withCause(e).log(ERROR_MESSAGE);
                return FileVisitResult.SKIP_SUBTREE;
            }

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            moveSubTree(file, moveTo.resolve(moveFrom.relativize(file)));
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }
    }
}
