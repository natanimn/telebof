package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.Serializable;

/**
 * This object represents a task to add to a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class InputChecklistTask implements Serializable {
    private Integer id;
    private String text;
    private ParseMode parse_mode;
    private MessageEntity[] text_entities;
    /**
     * Required
     * @param id Unique identifier of the task; must be positive and unique among all task identifiers currently present in the checklist
     * @param text Text of the task; 1-100 characters after entities parsing
     */
    public InputChecklistTask(int id, String text){
        this.id = id;
        this.text = text;

    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the text.
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask parseMode(ParseMode parseMode){
        this.parse_mode = parseMode;
        return this;
    }

    /**
     * Optional
     * @param textEntities ist of special entities that appear in the text, which can be specified instead of parse_mode.
     *                      Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are allowed.
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask textEntities(MessageEntity[] textEntities){
        this.text_entities = textEntities;
        return this;
    }
}