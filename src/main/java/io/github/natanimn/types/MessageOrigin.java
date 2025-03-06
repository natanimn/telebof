package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class MessageOrigin implements Serializable {
    public String type;
    public Integer date;
    public User sender_user;
    public String sender_user_name;
    public Chat sender_chat;
    public String author_signature;
    public Integer message_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageOrigin that = (MessageOrigin) object;
        return Objects.equals(type, that.type) && Objects.equals(date, that.date) && Objects.equals(sender_user, that.sender_user) &&
                Objects.equals(sender_user_name, that.sender_user_name) && Objects.equals(sender_chat, that.sender_chat) &&
                Objects.equals(author_signature, that.author_signature) && Objects.equals(message_id, that.message_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, sender_user, sender_user_name, sender_chat, author_signature, message_id);
    }
}
