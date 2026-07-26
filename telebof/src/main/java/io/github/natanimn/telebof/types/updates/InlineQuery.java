package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import lombok.Getter;

/**
 * This object represents an incoming inline query.
 * When the user sends an empty query, your bot could return some default or trending results.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class InlineQuery implements TelegramUpdate, JsonFormatter {
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

}