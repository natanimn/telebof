package io.github.natanimn.types.business;

import io.github.natanimn.types.media_and_service.Sticker;
import java.util.Objects;

/**
 * Contains information about the start page settings of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BusinessIntro{
    /**
     * Title text of the business intro
     */
    public String title;

    /**
     * Message text of the business intro
     */
    public String message;

    /**
     * Sticker of the business intro
     */
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
