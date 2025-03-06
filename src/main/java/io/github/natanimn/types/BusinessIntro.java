package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
