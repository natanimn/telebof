package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class PassportElementErrorUnspecified extends PassportElementError {
    private String element_hash;
    public PassportElementErrorUnspecified(String source, String type, String elementHash, String message) {
        super(source, type, message);
        this.element_hash = elementHash;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PassportElementErrorUnspecified that = (PassportElementErrorUnspecified) object;
        return Objects.equals(element_hash, that.element_hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element_hash);
    }
}
