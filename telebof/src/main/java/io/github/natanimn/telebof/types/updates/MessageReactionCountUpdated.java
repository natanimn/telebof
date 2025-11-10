package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.media_and_service.ReactionCount;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents reaction changes on a message with anonymous reactions.
 * @param chat The chat containing the message
 * @param messageId Unique message identifier inside the chat
 * @param date Date of the change in Unix time
 * @param reactions List of reactions that are present on the message
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MessageReactionCountUpdated(
        Chat chat,
        @SerializedName("message_id") int messageId,
        int date,
        List<ReactionCount> reactions
) implements TelegramUpdate {}