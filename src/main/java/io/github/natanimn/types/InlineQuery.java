package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQuery {
    public String id;
    public User from;
    public String query, offset, chat_type;
    public Location location;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineQuery that = (InlineQuery) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(query, that.query) &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(chat_type, that.chat_type) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, query, offset, chat_type, location);
    }

    @Override
    public String toString() {
        return "InlineQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", query='" + query + '\'' +
                ", offset='" + offset + '\'' +
                ", chat_type='" + chat_type + '\'' +
                ", location=" + location +
                '}';
    }
}
