package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.ChatBoostSource;
import io.github.natanimn.types.chat_and_user.Chat;

import java.io.Serializable;
import java.util.Objects;

/**
 * This object represents a boost removed from a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ChatBoostRemoved implements Serializable {
    /**
     * Chat which was boosted
     */
    public Chat chat;

    /**
     * Unique identifier of the boost
     */
    public String boost_id;

    /**
     * Point in time (Unix timestamp) when the boost was removed
     */
    public Integer removed_date;

    /**
     * Source of the removed boost
     */
    public ChatBoostSource source;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostRemoved that = (ChatBoostRemoved) object;
        return Objects.equals(chat, that.chat) &&
                Objects.equals(boost_id, that.boost_id) &&
                Objects.equals(removed_date, that.removed_date) &&
                Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, boost_id, removed_date, source);
    }

    @Override
    public String toString() {
        return "ChatBoostRemoved{" +
                "chat=" + chat +
                ", boost_id='" + boost_id + '\'' +
                ", removed_date=" + removed_date +
                ", source=" + source +
                '}';
    }
}
