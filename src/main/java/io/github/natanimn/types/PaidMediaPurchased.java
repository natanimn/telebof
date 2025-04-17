package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  17 April 2025
 */

public class PaidMediaPurchased {
    public User from;
    public String paid_media_payload;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaidMediaPurchased that = (PaidMediaPurchased) o;
        return Objects.equals(from, that.from) && Objects.equals(paid_media_payload, that.paid_media_payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, paid_media_payload);
    }
}
