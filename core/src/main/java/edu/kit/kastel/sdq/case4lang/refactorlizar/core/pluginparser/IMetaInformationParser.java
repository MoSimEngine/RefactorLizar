package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.nio.file.Path;
import java.util.Optional;

public interface IMetaInformationParser {

    Optional<IMetaInformation> parse(Path file);
}
