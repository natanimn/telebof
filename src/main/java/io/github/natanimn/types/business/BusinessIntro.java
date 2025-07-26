package io.github.natanimn.types.business;

import io.github.natanimn.types.media_and_service.Sticker;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class BusinessIntro implements Serializable {
    public String title, message;
    public Sticker sticker;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessIntro that = (BusinessIntro) object;
        return Objects.equals(title, that.title) &&
                Objects.equals(message, that.message) &&
                Objects.equals(sticker, that.sticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, message, sticker);
    }
}
