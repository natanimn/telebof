package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class MessageId {
    public Integer message_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageId messageId = (MessageId) object;
        return Objects.equals(message_id, messageId.message_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_id);
    }
}
