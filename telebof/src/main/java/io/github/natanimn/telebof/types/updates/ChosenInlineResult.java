package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 * @param resultId The unique identifier for the result that was chosen
 * @param from The user that chose the result
 * @param location Sender location, only for bots that require user location
 * @param inlineMessageId Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
 * @param query The query that was used to obtain the result
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChosenInlineResult(
        @SerializedName("result_id") String resultId,
        User from,
        Location location,
        @SerializedName("inline_message_id") String inlineMessageId,
        String query
) implements TelegramUpdate {}