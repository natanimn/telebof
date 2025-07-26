package io.github.natanimn.types.input;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.types.media_and_service.MessageEntity;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InputTextMessageContent implements Serializable {
    private String message_text, parse_mode;
    private List<MessageEntity> entities;
    private Boolean disable_web_page_preview;
    private LinkPreviewOptions link_preview_options;

    public InputTextMessageContent(String text) {
        this.message_text = text;
    }

    public InputTextMessageContent parseMode(@NotNull ParseMode parseMode) {
        this.parse_mode = parseMode.name().toLowerCase();
        return this;
    }

    public InputTextMessageContent entities(MessageEntity[] entities) {
        this.entities = List.of(entities);
        return this;
    }

    @Deprecated(since = "v1.5.0")
    public InputTextMessageContent disableWebPagePreview(boolean disableWebPagePreview) {
        this.disable_web_page_preview = disableWebPagePreview;
        return this;
    }

    public InputTextMessageContent linkPreviewOptions(LinkPreviewOptions linkPreviewOptions){
        this.link_preview_options = linkPreviewOptions;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InputTextMessageContent that = (InputTextMessageContent) object;
        return Objects.equals(message_text, that.message_text) && Objects.equals(parse_mode, that.parse_mode) &&
                Objects.equals(entities, that.entities) &&
                Objects.equals(disable_web_page_preview, that.disable_web_page_preview) &&
                Objects.equals(link_preview_options, that.link_preview_options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_text, parse_mode, entities, disable_web_page_preview, link_preview_options);
    }
}
