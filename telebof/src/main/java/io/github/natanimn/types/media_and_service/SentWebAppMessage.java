package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class SentWebAppMessage implements Serializable {
    public String inline_message_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SentWebAppMessage that = (SentWebAppMessage) object;
        return Objects.equals(inline_message_id, that.inline_message_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inline_message_id);
    }
}
