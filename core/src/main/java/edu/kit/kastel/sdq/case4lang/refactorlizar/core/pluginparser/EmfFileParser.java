/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.jar.Manifest;
import org.apache.commons.lang3.StringUtils;

public class EmfFileParser implements IMetaInformationParser {

    private static final String LAYER_NAME = "Layer";
    private static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Override
    public Optional<IMetaInformation> parse(Path file) {

        try {
            Manifest manifest = new Manifest(new FileInputStream(file.toFile()));
            String layer = parseLayer(manifest);
            String bundleName = parseBundleName(manifest);
            return Optional.of(new EmfFile(file, layer, bundleName));
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
            return Optional.empty();
        }
    }

    private String parseLayer(Manifest manifest) {
        return StringUtils.defaultString(
                manifest.getMainAttributes().getValue(LAYER_NAME), "UNKNOWN");
    }

    private String parseBundleName(Manifest manifest) {
        return manifest.getMainAttributes().getValue(BUNDLE_SYMBOLIC_NAME).replaceAll(";.*", "");
    }
}
