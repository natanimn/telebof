package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.media_and_service.Location;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a {@link InlineQuery result} of an inline query that was chosen by the user and sent to their chat partner.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.7
 */
public class ChosenInlineResult {
    /**
     * The unique identifier for the result that was chosen
     */
    public String result_id;

    /**
     * The user that chose the result
     */
    public User from;

    /**
     * Sender location, only for bots that require user location
     */
    public Location location;

    /**
     * Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message.
     * Will be also received in callback queries and can be used to edit the message.
     */
    public String inline_message_id;

    /**
     * The query that was used to obtain the result
     */
    public String query;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChosenInlineResult that = (ChosenInlineResult) object;
        return  Objects.equals(result_id, that.result_id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(location, that.location) &&
                Objects.equals(inline_message_id, that.inline_message_id) &&
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
