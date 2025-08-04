package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.chat_and_user.Chat;
import io.github.natanimn.types.media_and_service.ReactionType;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a change of a reaction on a message performed by a user.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class MessageReactionUpdated {
    /**
     * The chat containing the message the user reacted to
     */
    public Chat chat;

    /**
     * Unique identifier of the message inside the chat
     */
    public Integer message_id;

    /**
     * The user that changed the reaction, if the user isn't anonymous
     */
    public User user;

    /**
     * The chat on behalf of which the reaction was changed, if the user is anonymous
     */
    public Chat actor_chat;

    /**
     * Date of the change in Unix time
     */
    public int date;

    /**
     * Previous list of reaction types that were set by the user
     */
    public List<ReactionType> old_reaction;

    /**
     * New list of reaction types that have been set by the user
     */
    public List<ReactionType> new_reaction;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageReactionUpdated that = (MessageReactionUpdated) object;
        return  Objects.equals(message_id, that.message_id) &&
                date == that.date &&
                Objects.equals(chat, that.chat) &&
                Objects.equals(user, that.user) &&
                Objects.equals(actor_chat, that.actor_chat) &&
                Objects.equals(old_reaction, that.old_reaction) &&
                Objects.equals(new_reaction, that.new_reaction);
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
