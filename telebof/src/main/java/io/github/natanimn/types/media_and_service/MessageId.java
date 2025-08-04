package io.github.natanimn.types.media_and_service;

import java.util.Objects;

/**
 * This class represents a unique message identifier.
 * @author Natanim
 * @since 3 March, 2025
 * @version 0.7
 */
public class MessageId {

    /**
     * Unique message identifier. In specific instances (e.g., message containing a video sent to a big chat),
     * the server might automatically schedule a message instead of sending it immediately.
     * In such cases, this field will be 0 and the relevant message will be unusable until it is actually sent
     */
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
