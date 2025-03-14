package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatBoostUpdated implements Serializable {
    public Chat chat;
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
