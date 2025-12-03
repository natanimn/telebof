package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object represents a task to add to a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class InputChecklistTask implements Serializable {
    private final Integer id;
    private final String text;
    @SerializedName("parse_mode")
    private ParseMode parseMode;
    @SerializedName("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * @param id Unique identifier of the task; must be positive and unique among all task identifiers currently present in the checklist
     * @param text Text of the task; 1-100 characters after entities parsing
     */
    public InputChecklistTask(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    /**
     * Optional. Mode for parsing entities in the text.
     * @param parseMode Parse mode for text entities
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. List of special entities that appear in the text, which can be specified instead of parse_mode.
     * Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are allowed.
     * @param textEntities Array of message entities
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask setTextEntities(MessageEntity[] textEntities) {
        this.textEntities = List.of(textEntities);
        return this;
    }

}