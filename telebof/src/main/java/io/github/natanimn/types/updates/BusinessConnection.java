package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;

import java.io.Serializable;
import java.util.Objects;

/**
 * Describes the connection of the bot with a business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class BusinessConnection implements Serializable{
    /**
     * Unique identifier of the business connection
     */
    public String id;

    /**
     * Business account user that created the business connection
     */
    public User user;

    /**
     * Identifier of a private chat with the user who created the business connection
     */
    public Long user_Chat_id;

    /**
     * Date the connection was established in Unix time
     */
    public Integer date;

    /**
     * True, if the bot can send and edit messages in the private chats that had incoming messages in the last 24 hours
     */
    public Boolean can_reply;

    /**
     * True, if the connection is active
     */
    public Boolean is_enabled;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessConnection that = (BusinessConnection) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(user_Chat_id, that.user_Chat_id) &&
                Objects.equals(date, that.date) && Objects.equals(can_reply, that.can_reply) &&
                Objects.equals(is_enabled, that.is_enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, user_Chat_id, date, can_reply, is_enabled);
    }

    @Override
    public String toString() {
        return "BusinessConnection{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", user_Chat_id=" + user_Chat_id +
                ", date=" + date +
                ", can_reply=" + can_reply +
                ", is_enabled=" + is_enabled +
                '}';
    }
}