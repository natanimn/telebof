package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;

import java.util.Objects;

/**
 * This class contains information about a paid media purchase.
 * @author Natanim
 * @since 17 April 2025
 * @version 0.7
 */

public class PaidMediaPurchased implements TelegramUpdate {
    /**
     * User who purchased the media
     */
    public User from;

    /**
     * Bot-specified paid media payload
     */
    public String paid_media_payload;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaidMediaPurchased that = (PaidMediaPurchased) o;
        return  Objects.equals(from, that.from) &&
                Objects.equals(paid_media_payload, that.paid_media_payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, paid_media_payload);
    }
}
