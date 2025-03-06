package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BusinessMessagesDeleted implements Serializable {
    public String business_connection_id;
    public Chat chat;
    public List<Integer> message_ids;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessMessagesDeleted that = (BusinessMessagesDeleted) object;
        return Objects.equals(business_connection_id, that.business_connection_id) &&
                Objects.equals(chat, that.chat) && Objects.equals(message_ids, that.message_ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(business_connection_id, chat, message_ids);
    }

    @Override
    public String toString() {
        return "BusinessMessagesDeleted{" +
                "business_connection_id='" + business_connection_id + '\'' +
                ", chat=" + chat +
                ", message_ids=" + message_ids +
                '}';
    }
}
