package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ChosenInlineResult implements Serializable {
    public String result_id;
    public User from;
    public Location location;
    public String inline_message_id, query;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChosenInlineResult that = (ChosenInlineResult) object;
        return Objects.equals(result_id, that.result_id) && Objects.equals(from, that.from) &&
                Objects.equals(location, that.location) && Objects.equals(inline_message_id, that.inline_message_id) &&
                Objects.equals(query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result_id, from, location, inline_message_id, query);
    }

    @Override
    public String toString() {
        return "ChosenInlineResult{" +
                "result_id='" + result_id + '\'' +
                ", from=" + from +
                ", location=" + location +
                ", inline_message_id='" + inline_message_id + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}
