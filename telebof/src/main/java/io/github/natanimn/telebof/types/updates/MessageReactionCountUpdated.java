package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.media_and_service.ReactionCount;
import io.github.natanimn.telebof.types.chat_and_user.Chat;

import java.util.List;
import java.util.Objects;

/**
 * This object represents reaction changes on a message with anonymous reactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class MessageReactionCountUpdated implements TelegramUpdate {
    /**
     * The chat containing the message
     */
    public Chat chat;

    /**
     * Unique message identifier inside the chat
     */
    public int message_id;

    /**
     * Date of the change in Unix time
     */
    public int date;

    /**
     * List of reactions that are present on the message
     */
    public List<ReactionCount> reactions;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageReactionCountUpdated that = (MessageReactionCountUpdated) object;
        return message_id == that.message_id && date == that.date && Objects.equals(chat, that.chat) &&
                Objects.equals(reactions, that.reactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, message_id, date, reactions);
    }

    @Override
    public String toString() {
        return "MessageReactionCountUpdated{" +
                "chat=" + chat +
                ", message_id=" + message_id +
                ", date=" + date +
                ", reactions=" + reactions +
                '}';
    }
}
