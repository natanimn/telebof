package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.media_and_service.ReactionCount;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This object represents reaction changes on a message with anonymous reactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class MessageReactionCountUpdated implements TelegramUpdate {
    /**
     * The chat containing the message
     */
    private Chat chat;

    /**
     * Unique message identifier inside the chat
     */
    @SerializedName("message_id")
    private int messageId;

    /**
     * Date of the change in Unix time
     */
    private int date;

    /**
     * List of reactions that are present on the message
     */
    private List<ReactionCount> reactions;

    public Chat getChat() {
        return chat;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getDate() {
        return date;
    }

    public List<ReactionCount> getReactions() {
        return reactions;
    }

    @Override
    public String toString() {
        return "MessageReactionCountUpdated{" +
                "chat=" + chat +
                ", messageId=" + messageId +
                ", date=" + date +
                ", reactions=" + reactions +
                '}';
    }
}