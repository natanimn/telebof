package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class MessageReactionUpdated implements Serializable {
    public Chat chat;
    public int message_id;
    public User user;
    public Chat actor_chat;
    public int date;
    public List<ReactionType> old_reaction;
    public List<ReactionType> new_reaction;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageReactionUpdated that = (MessageReactionUpdated) object;
        return message_id == that.message_id && date == that.date && Objects.equals(chat, that.chat) &&
                Objects.equals(user, that.user) && Objects.equals(actor_chat, that.actor_chat) &&
                Objects.equals(old_reaction, that.old_reaction) && Objects.equals(new_reaction, that.new_reaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, message_id, user, actor_chat, date, old_reaction, new_reaction);
    }

    @Override
    public String toString() {
        return "MessageReactionUpdated{" +
                "chat=" + chat +
                ", message_id=" + message_id +
                ", user=" + user +
                ", actor_chat=" + actor_chat +
                ", date=" + date +
                ", old_reaction=" + old_reaction +
                ", new_reaction=" + new_reaction +
                '}';
    }
}
