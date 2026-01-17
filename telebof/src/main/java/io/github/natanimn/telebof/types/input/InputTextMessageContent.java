package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputTextMessageContent implements InputMessageContent {
    @SerializedName("message_text")
    private String messageText;

    @SerializedName("parse_mode")
    private ParseMode parseMode;

    private List<MessageEntity> entities;

    @SerializedName("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    /**
     * Required
     * @param messageText Text of the message to be sent, 1-4096 characters
     */
    public InputTextMessageContent(String messageText) {
        this.messageText = messageText;
    }

    /**
     * @param parseMode Mode for parsing entities in the message text
     */
    public InputTextMessageContent setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * @param entities List of special entities that appear in message text, which can be specified instead of parseMode
     */
    public InputTextMessageContent setEntities(List<MessageEntity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * @param linkPreviewOptions Link preview generation options for the message
     */
    public InputTextMessageContent setLinkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
        this.linkPreviewOptions = linkPreviewOptions;
        return this;
    }
}