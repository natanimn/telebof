package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ChatBoostRemoved implements Serializable {
    public Chat chat;
    public String boost_id;
    public Integer removed_date;
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
