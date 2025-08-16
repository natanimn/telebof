package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputTextMessageContent implements InputMessageContent {
    private String message_text;
    private ParseMode parse_mode;
    private List<MessageEntity> entities;
    private LinkPreviewOptions link_preview_options;

    /**
     * Required
     * @param text Text of the message to be sent, 1-4096 characters
     */
    public InputTextMessageContent(String text) {
        this.message_text = text;
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the message text
     * @return {@link InputTextMessageContent}
     */
    public InputTextMessageContent parseMode(ParseMode parse_mode) {
        this.parse_mode = parse_mode;
        return this;
    }

    /**
     * Optional
     * @param entities  List of special entities that appear in message text, which can be specified instead of {@link #parseMode}
     * @return {@link InputTextMessageContent}
     */
    public InputTextMessageContent entities(MessageEntity[] entities) {
        this.entities = List.of(entities);
        return this;
    }

    /**
     * Optional
     * @param link_preview_options Link preview generation options for the message
     * @return {@link InputTextMessageContent}
     */
    public InputTextMessageContent linkPreviewOptions(LinkPreviewOptions link_preview_options){
        this.link_preview_options = link_preview_options;
        return this;
    }

}
