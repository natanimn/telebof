package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.Serializable;

/**
 * This object represents a task to add to a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
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
     * @param parse_mode Mode for parsing entities in the text.
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask parseMode(ParseMode parse_mode){
        this.parse_mode = parse_mode;
        return this;
    }

    /**
     * Optional
     * @param text_entities ist of special entities that appear in the text, which can be specified instead of parse_mode.
     *                      Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are allowed.
     * @return {@link InputChecklistTask}
     */
    public InputChecklistTask textEntities(MessageEntity[] text_entities){
        this.text_entities = text_entities;
        return this;
    }
}