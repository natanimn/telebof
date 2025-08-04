package io.github.natanimn.types.input;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.media_and_service.MessageEntity;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputPollOption implements Serializable {
    private String text, text_parse_mode;
    private List<MessageEntity> text_entities;

    public InputPollOption(String text){
        this.text = text;
    }

    public InputPollOption textParseMode(@NotNull ParseMode text_parse_mode){
        this.text_parse_mode = text_parse_mode.name().toLowerCase();
        return this;
    }

    public InputPollOption textEntities(MessageEntity[] text_entities){
        this.text_entities = List.of(text_entities);
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InputPollOption that = (InputPollOption) object;
        return Objects.equals(text, that.text) &&
                Objects.equals(text_parse_mode, that.text_parse_mode) &&
                Objects.equals(text_entities, that.text_entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, text_parse_mode, text_entities);
    }
}
