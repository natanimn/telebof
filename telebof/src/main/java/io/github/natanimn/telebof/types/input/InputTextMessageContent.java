package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 * @param messageText Text of the message to be sent, 1-4096 characters
 * @param parseMode Optional. Mode for parsing entities in the message text
 * @param entities Optional. List of special entities that appear in message text, which can be specified instead of parseMode
 * @param linkPreviewOptions Optional. Link preview generation options for the message
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputTextMessageContent(
        @SerializedName("message_text") String messageText,
        @SerializedName("parse_mode") ParseMode parseMode,
        List<MessageEntity> entities,
        @SerializedName("link_preview_options") LinkPreviewOptions linkPreviewOptions
) implements InputMessageContent {

    /**
     * Creates a new InputTextMessageContent builder
     * @param text Text of the message to be sent, 1-4096 characters
     */
    public static InputTextMessageContentBuilder builder(String text) {
        return new InputTextMessageContentBuilder(text);
    }

    /**
     * Builder class for InputTextMessageContent
     */
    public static class InputTextMessageContentBuilder {
        private final String messageText;
        private ParseMode parseMode;
        private List<MessageEntity> entities;
        private LinkPreviewOptions linkPreviewOptions;

        public InputTextMessageContentBuilder(String messageText) {
            this.messageText = messageText;
        }

        public InputTextMessageContentBuilder parseMode(ParseMode parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputTextMessageContentBuilder entities(List<MessageEntity> entities) {
            this.entities = entities;
            return this;
        }

        public InputTextMessageContentBuilder linkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
            this.linkPreviewOptions = linkPreviewOptions;
            return this;
        }

        public InputTextMessageContent build() {
            return new InputTextMessageContent(
                    messageText, parseMode, entities, linkPreviewOptions
            );
        }
    }
}