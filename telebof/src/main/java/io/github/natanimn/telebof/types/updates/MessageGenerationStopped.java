package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import lombok.Getter;

/**
 * This object describes an update about a user stopping message generation.
 * @author Natanim
 * @since 2.3
 */
@Getter
public class MessageGenerationStopped implements TelegramUpdate{
    /**
     * Chat in which the message is generated
     */
    private Chat chat;

    /**
     * Optional. Unique identifier of the message thread in which the message is generated
     */
    @SerializedName("message_thread_id")
    private Integer messageThreadId;

    /**
     * Unique identifier of the message draft which was stopped
     */
    @SerializedName("draft_id")
    private Integer draftId;
}
