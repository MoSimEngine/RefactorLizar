package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * Finds all source files in a folder and its subfolders. Starts at the given folder and searches
 * recursively.
 */
public class SourceFolderFinder extends SimpleFileVisitor<Path> {

    private boolean ignoreTestFolder;

    public SourceFolderFinder(boolean ignoreTestFolder) {
        this.ignoreTestFolder = ignoreTestFolder;
    }
    /** A list of {@link Path}s to all source folders. */
    List<Path> srcFolders = new ArrayList<>();

    /**
     * Adds the given path to the list of source folders, if the dir is a source folder.
     *
     * @param dir the path to check.
     * @param attrs the attributes of the given path.
     * @return SKIP_SUBTREE if the given path is a source folder, otherwise CONTINUE.
     * @throws IOException if the visit fails.
     */
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        if (isSrcFolder(dir)) {
            srcFolders.add(dir);
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }
    /**
     * Checks if the given path is a source folder. A src folder is a folder that path contains
     * "src" and contains not "test".
     *
     * @param dir the path to check
     * @return true if the path is a source folder, false otherwise
     */
    private boolean isSrcFolder(Path dir) {
        return dir.getFileName() != null
                && (dir.getFileName().toString().equals("src")
                        || dir.getFileName().toString().equals("src-gen"))
                && (!ignoreTestFolder || !dir.toString().contains("test"));
    }

    /**
     * Returns a list of all source folders. A src folder is a folder that path contains "src" and
     * contains not "test".
     *
     * @return the list of source folders.
     */
    public List<Path> getSrcFolders() {
        return srcFolders;
    }
}
