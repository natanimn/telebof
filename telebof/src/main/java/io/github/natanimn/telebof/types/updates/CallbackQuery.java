package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot, the field message will be present.
 * If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present.
 * Exactly one of the fields data or game_short_name will be present.
 * @param id Unique identifier for this query
 * @param inlineMessageId Identifier of the message sent via the bot in inline mode, that originated the query.
 * @param chatInstance Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent. Useful for high scores in games.
 * @param data Data associated with the callback button. Be aware that the message originated the query can contain no callback buttons with this data.
 * @param gameShortName Short name of a Game to be returned, serves as the unique identifier for the game
 * @param from Sender
 * @param message Message sent by the bot with the callback button that originated the query
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record CallbackQuery(
        String id,
        @SerializedName("inline_message_id") String inlineMessageId,
        @SerializedName("chat_instance") String chatInstance,
        String data,
        @SerializedName("game_short_name") String gameShortName,
        User from,
        Message message
) implements TelegramUpdate {}