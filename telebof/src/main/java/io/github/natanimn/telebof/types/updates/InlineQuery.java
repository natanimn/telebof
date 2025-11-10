package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents an incoming inline query.
 * When the user sends an empty query, your bot could return some default or trending results.
 * @param id Unique identifier for this query
 * @param from Sender
 * @param query Text of the query (up to 256 characters)
 * @param offset Offset of the results to be returned, can be controlled by the bot
 * @param chatType Type of the chat from which the inline query was sent. Can be either "sender" for a private chat with the inline query sender, "private", "group", "supergroup", or "channel". The chat type should be always known for requests sent from official clients and most third-party clients, unless the request was sent from a secret chat
 * @param location Sender location, only for bots that request user location
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InlineQuery(
        String id,
        User from,
        String query,
        String offset,
        @SerializedName("chat_type") ChatType chatType,
        Location location
) implements TelegramUpdate {}