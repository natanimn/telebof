package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Common field builder for InlineQueryResult those are media
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
@SuppressWarnings("unchecked")
class InlineQueryMediaResult<T> implements InlineQueryResult {
    private String type;
    private String id;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    @SerializedName("caption_entities")
    private List<MessageEntity> captionEntities;
    @SerializedName("input_message_content")
    private InputTextMessageContent inputMessageContent;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    T thisT = (T) this;

    /**
     * Required
     * @param type Type of the result
     * @param id Unique identifier for this result, 1-64 bytes
     */
    public InlineQueryMediaResult(String type, String id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Optional
     * @param inputMessageContent Content of the message to be sent instead of the media(photo, audio, voice, etc)
     * @return {@link T}
     */
    public T setInputMessageContent(InputTextMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return thisT;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link T}
     */
    public T setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return thisT;
    }

    /**
     * Optional
     * @param caption Caption of the photo to be sent, 0-1024 characters after entities parsing
     * @return {@link T}
     */
    public T setCaption(String caption) {
        this.caption = caption;
        return thisT;
    }

    /**
     * Optional
     * @param captionEntities List of special entities that appear in the caption, which can be specified instead of {@link #setParseMode}
     * @return {@link T}
     */
    public T setCaptionEntities(MessageEntity[] captionEntities) {
        this.captionEntities = List.of(captionEntities);
        return thisT;
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the caption
     * @return {@link T}
     */
    public T setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode.name().toLowerCase();
        return thisT;
    }
}