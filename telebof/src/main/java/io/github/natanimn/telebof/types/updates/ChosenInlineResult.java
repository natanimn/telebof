package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import lombok.Getter;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 * @author Natanim Negash
 * @since 0.1
 * @version 1.3.0
 */
@Getter
public class ChosenInlineResult implements TelegramUpdate, JsonFormatter {
    /**
     * The unique identifier for the result that was chosen
     */
    @SerializedName("result_id")
    private String resultId;

    /**
     * The user that chose the result
     */
    private User from;

    /**
     * Sender location, only for bots that require user location
     */
    private Location location;

    /**
     * Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

    /**
     * The query that was used to obtain the result
     */
    private String query;

}