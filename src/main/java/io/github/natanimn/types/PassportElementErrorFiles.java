package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PassportElementErrorFiles extends PassportElementError {
    public PassportElementErrorFiles(String source, String type, String[] fileHashes, String message) {
        super(source, type, fileHashes, message);
    }
}
