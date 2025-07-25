package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ChatBoostAdded implements Serializable{
    public Integer boost_count;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostAdded that = (ChatBoostAdded) object;
        return Objects.equals(boost_count, that.boost_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boost_count);
    }

    @Override
    public String toString() {
        return "ChatBoostAdded{" +
                "boost_count=" + boost_count +
                '}';
    }
}
