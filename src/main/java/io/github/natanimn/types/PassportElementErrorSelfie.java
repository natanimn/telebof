package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PassportElementErrorSelfie extends PassportElementError {
    public PassportElementErrorSelfie(String source, String type, String fileHash, String message) {
        super(source, type, fileHash, message);
    }
}
