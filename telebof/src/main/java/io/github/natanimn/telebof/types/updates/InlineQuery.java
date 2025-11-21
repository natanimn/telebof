package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * This object represents an incoming inline query.
 * When the user sends an empty query, your bot could return some default or trending results.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQuery implements TelegramUpdate {
    /**
     * Unique identifier for this query
     */
    private String id;

    /**
     * Sender
     */
    private User from;

    /**
     * Text of the query (up to 256 characters)
     */
    private String query;

    /**
     * Offset of the results to be returned, can be controlled by the bot
     */
    private String offset;

    /**
     * Type of the chat from which the inline query was sent. Can be either "sender" for a private chat with the inline query sender, "private", "group", "supergroup", or "channel". The chat type should be always known for requests sent from official clients and most third-party clients, unless the request was sent from a secret chat
     */
    @SerializedName("chat_type")
    private ChatType chatType;

    /**
     * Sender location, only for bots that request user location
     */
    private Location location;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getQuery() {
        return query;
    }

    public String getOffset() {
        return offset;
    }

    public ChatType getChatType() {
        return chatType;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineQuery that = (InlineQuery) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(query, that.query) &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(chatType, that.chatType) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, query, offset, chatType, location);
    }

    @Override
    public String toString() {
        return "InlineQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", query='" + query + '\'' +
                ", offset='" + offset + '\'' +
                ", chatType=" + chatType +
                ", location=" + location +
                '}';
    }
}