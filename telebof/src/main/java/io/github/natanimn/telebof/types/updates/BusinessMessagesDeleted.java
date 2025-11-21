package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * This object is received when messages are deleted from a connected business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessMessagesDeleted implements TelegramUpdate {
    /**
     * Unique identifier of the business connection
     */
    @SerializedName("business_connection_id")
    private String businessConnectionId;

    /**
     * Information about a chat in the business account. The bot may not have access to the chat or the corresponding user.
     */
    private Chat chat;

    /**
     * The list of identifiers of deleted messages in the chat of the business account
     */
    @SerializedName("message_ids")
    private List<Integer> messageIds;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Chat getChat() {
        return chat;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessMessagesDeleted that = (BusinessMessagesDeleted) object;
        return Objects.equals(businessConnectionId, that.businessConnectionId) &&
                Objects.equals(chat, that.chat) &&
                Objects.equals(messageIds, that.messageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessConnectionId, chat, messageIds);
    }

    @Override
    public String toString() {
        return "BusinessMessagesDeleted{" +
                "businessConnectionId='" + businessConnectionId + '\'' +
                ", chat=" + chat +
                ", messageIds=" + messageIds +
                '}';
    }
}