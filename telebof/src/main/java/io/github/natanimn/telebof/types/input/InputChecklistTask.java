package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object represents a task to add to a checklist.
 * @param id Unique identifier of the task; must be positive and unique among all task identifiers currently present in the checklist
 * @param text Text of the task; 1-100 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the text.
 * @param textEntities Optional. List of special entities that appear in the text, which can be specified instead of parse_mode. Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are allowed.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public record InputChecklistTask(
        Integer id,
        String text,
        @SerializedName("parse_mode") ParseMode parseMode,
        @SerializedName("text_entities") MessageEntity[] textEntities
) implements Serializable {

    /**
     * Creates a new InputChecklistTask builder
     * @param id Unique identifier of the task; must be positive and unique among all task identifiers currently present in the checklist
     * @param text Text of the task; 1-100 characters after entities parsing
     */
    public static InputChecklistTaskBuilder builder(int id, String text) {
        return new InputChecklistTaskBuilder(id, text);
    }

    /**
     * Builder class for InputChecklistTask
     */
    public static class InputChecklistTaskBuilder {
        private final int id;
        private final String text;
        private ParseMode parseMode;
        private MessageEntity[] textEntities;

        public InputChecklistTaskBuilder(int id, String text) {
            this.id = id;
            this.text = text;
        }

        public InputChecklistTaskBuilder parseMode(ParseMode parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputChecklistTaskBuilder textEntities(MessageEntity[] textEntities) {
            this.textEntities = textEntities;
            return this;
        }

        public InputChecklistTask build() {
            return new InputChecklistTask(id, text, parseMode, textEntities);
        }
    }
}