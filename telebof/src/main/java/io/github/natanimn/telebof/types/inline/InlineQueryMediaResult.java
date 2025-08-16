package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * Common field builder for InlineQueryResult those are media
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
@SuppressWarnings("unchecked")
class InlineQueryMediaResult<T>  implements InlineQueryResult {
    public String type, id, caption, parse_mode;
    public List<MessageEntity> caption_entities;
    public InputTextMessageContent input_message_content;
    public InlineKeyboardMarkup reply_markup;

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
     * @param input_message_content Content of the message to be sent instead of the media(photo, audio, voice, etc)
     * @return {@link T}
     */
    public T inputMessageContent(InputTextMessageContent input_message_content) {
        this.input_message_content = input_message_content;
        return thisT;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link T}
     */
    public T replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return thisT;
    }

    /**
     * Optional
     * @param caption Caption of the photo to be sent, 0-1024 characters after entities parsing
     * @return {@link T}
     */
    public T caption(String caption) {
        this.caption = caption;
        return thisT;
    }


    /**
     * Optional
     * @param caption_entities List of special entities that appear in the caption, which can be specified instead of {@link #parseMode}
     * @return {@link T}
     */
    public T captionEntities(MessageEntity[] caption_entities) {
        this.caption_entities = List.of(caption_entities);
        return thisT;
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the caption
     * @return {@link T}
     */
    public T parseMode(ParseMode parse_mode) {
        this.parse_mode = parse_mode.name().toLowerCase();
        return thisT;
    }

}
