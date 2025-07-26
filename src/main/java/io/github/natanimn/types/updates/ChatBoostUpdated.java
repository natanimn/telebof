package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.Chat;
import io.github.natanimn.types.chat_and_user.ChatBoost;

import java.io.Serializable;
import java.util.Objects;

/**
 * This object represents a boost added to a chat or changed.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ChatBoostUpdated implements Serializable {
    /**
     * Chat which was boosted
     */
    public Chat chat;

    /**
     * Information about the chat boost
     */
    public ChatBoost boost;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostUpdated that = (ChatBoostUpdated) object;
        return Objects.equals(chat, that.chat) && Objects.equals(boost, that.boost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, boost);
    }

    @Override
    public String toString() {
        return "ChatBoostUpdated{" +
                "chat=" + chat +
                ", boost=" + boost +
                '}';
    }
}
