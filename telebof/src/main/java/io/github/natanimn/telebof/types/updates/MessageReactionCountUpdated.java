package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.ReactionCount;
import lombok.Getter;

import java.util.List;

/**
 * This object represents reaction changes on a message with anonymous reactions.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class MessageReactionCountUpdated implements TelegramUpdate, JsonFormatter {
    /**
     * The chat containing the message
     */
    private Chat chat;

    /**
     * Unique message identifier inside the chat
     */
    @SerializedName("message_id")
    private int messageId;

    /**
     * Date of the change in Unix time
     */
    private int date;

    /**
     * List of reactions that are present on the message
     */
    private List<ReactionCount> reactions;
}