package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.Chat;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * This object is received when messages are deleted from a connected business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class BusinessMessagesDeleted implements TelegramUpdate {
    /**
     * Unique identifier of the business connection
     */
    public String business_connection_id;

    /**
     * Information about a chat in the business account. The bot may not have access to the chat or the corresponding user.
     */
    public Chat chat;

    /**
     * The list of identifiers of deleted messages in the chat of the business account
     */
    public List<Integer> message_ids;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessMessagesDeleted that = (BusinessMessagesDeleted) object;
        return  Objects.equals(business_connection_id, that.business_connection_id) &&
                Objects.equals(chat, that.chat) &&
                Objects.equals(message_ids, that.message_ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(business_connection_id, chat, message_ids);
    }

    @Override
    public String toString() {
        return "BusinessMessagesDeleted{" +
                "business_connection_id='" + business_connection_id + '\'' +
                ", chat=" + chat +
                ", message_ids=" + message_ids +
                '}';
    }
}
