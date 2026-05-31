package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Describes an inline message sent by a guest bot.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class SentGuestMessage {
    /**
     * Identifier of the sent inline message
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

    public String getInlineMessageId() {
        return inlineMessageId;
    }
}
