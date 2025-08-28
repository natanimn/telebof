package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;

import java.util.Objects;

/**
 * This object represents an incoming inline query.
 * When the user sends an empty query, your bot could return some default or trending results.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class InlineQuery implements TelegramUpdate{
    /**
     * Unique identifier for this query
     */
    public String id;

    /**
     * Sender
     */
    public User from;

    /**
     * Text of the query (up to 256 characters)
     */
    public String query;

    /**
     * Offset of the results to be returned, can be controlled by the bot
     */
    public String offset;

    /**
     * Type of the chat from which the inline query was sent.
     * Can be either “sender” for a private chat with the inline query sender, “private”, “group”, “supergroup”, or “channel”.
     * The chat type should be always known for requests sent from official clients and most third-party clients, unless the request was sent from a secret chat
     */
    public ChatType chat_type;

    /**
     * Sender location, only for bots that request user location
     */
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
