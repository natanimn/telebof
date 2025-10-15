package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Describes an inline message sent by a Web App on behalf of a user.
 * @param inlineMessageId Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record SentWebAppMessage(
        @SerializedName("inline_message_id") String inlineMessageId
) {}