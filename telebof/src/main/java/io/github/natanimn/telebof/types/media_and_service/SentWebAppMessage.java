package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes an inline message sent by a Web App on behalf of a user.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class SentWebAppMessage {
    /**
     * Optional.
     * Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message.
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

}