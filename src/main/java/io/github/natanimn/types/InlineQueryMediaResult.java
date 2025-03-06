package io.github.natanimn.types;

import io.github.natanimn.enums.ParseMode;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unchecked")
class InlineQueryMediaResult<T>  implements Serializable, InlineQueryResult {
    public String type, id, caption, parse_mode, title;
    public List<MessageEntity> caption_entities;
    public InputTextMessageContent input_message_content;
    public InlineKeyboardMarkup reply_markup;
    T thisT = (T) this;
    public InlineQueryMediaResult(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public T title(String title) {
        this.title = title;
        return thisT;
    }
    public T inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return thisT;
    }

    public T replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return thisT;
    }

    public T caption(String caption) {
        this.caption = caption;
        return thisT;
    }


    public T captionEntities(MessageEntity[] captionEntities) {
        this.caption_entities = List.of(captionEntities);
        return thisT;
    }

    public T parseMode(@NotNull ParseMode parseMode) {
        this.parse_mode = parseMode.name().toLowerCase();
        return thisT;
    }

}
