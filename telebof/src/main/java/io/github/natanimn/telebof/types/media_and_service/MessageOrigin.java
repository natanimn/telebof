package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.MessageOriginType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class describes the origin of a message
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class MessageOrigin implements Serializable {
    /**
     * Type of the message origin,
     */
    public MessageOriginType type;

    /**
     * Date the message was sent originally in Unix time
     */
    public Integer date;

    /**
     * User that sent the message originally
     */
    public User sender_user;

    /**
     * Name of the user that sent the message originally
     */
    public String sender_user_name;

    /**
     * Chat that sent the message originally
     */
    public Chat sender_chat;

    /**
     * For messages originally sent by an anonymous chat administrator, original message author signature, or
     * Signature of the original post author
     */
    public String author_signature;

    /**
     * Unique message identifier inside the chat
     */
    public Integer message_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageOrigin that = (MessageOrigin) object;
        return  Objects.equals(type, that.type) &&
                Objects.equals(date, that.date) &&
                Objects.equals(sender_user, that.sender_user) &&
                Objects.equals(sender_user_name, that.sender_user_name) &&
                Objects.equals(sender_chat, that.sender_chat) &&
                Objects.equals(author_signature, that.author_signature) &&
                Objects.equals(message_id, that.message_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, sender_user, sender_user_name, sender_chat, author_signature, message_id);
    }
}
