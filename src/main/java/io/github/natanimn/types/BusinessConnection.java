package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class BusinessConnection implements Serializable{
    public String id;
    public User user;
    public Long user_Chat_id;
    public Integer date;
    public Boolean can_reply, is_enabled;

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