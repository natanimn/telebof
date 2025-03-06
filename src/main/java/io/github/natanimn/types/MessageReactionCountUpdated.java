package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class MessageReactionCountUpdated implements Serializable {
    public Chat chat;
    public int message_id;
    public int date;
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
