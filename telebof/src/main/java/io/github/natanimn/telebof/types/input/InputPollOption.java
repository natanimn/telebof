package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * This object contains information about one answer option in a poll to be sent.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9.4
 */
public class InputPollOption implements Serializable {
    private String text;
    private ParseMode text_parse_mode;
    private List<MessageEntity> text_entities;

    /**
     * Required
     * @param text Option text, 1-100 characters
     */
    public InputPollOption(String text){
        this.text = text;
    }

    /**
     * Optional
     * @param text_parse_mode Mode for parsing entities in the text
     * @return {@link InputPollOption}
     */
    public InputPollOption textParseMode(ParseMode text_parse_mode){
        this.text_parse_mode = text_parse_mode;
        return this;
    }

    /**
     * Optional
     * @param text_entities  A JSON-serialized list of special entities that appear in the poll option text.
     *                      It can be specified instead of {@link #textParseMode(ParseMode)}
     * @return {@link InputPollOption}
     */
    public InputPollOption textEntities(MessageEntity[] text_entities){
        this.text_entities = List.of(text_entities);
        return this;
    }

}
