package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
