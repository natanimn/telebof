package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes an inline message sent by a guest bot.
 * @author Natanim
 * @since 2.0.0
 */
@Getter
public class SentGuestMessage {
    /**
     * Identifier of the sent inline message
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

}
