package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object contains information about one answer option in a poll to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputPollOption implements Serializable {
    private String text;

    @SerializedName("text_parse_mode")
    private ParseMode textParseMode;

    @SerializedName("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Required
     * @param text Option text, 1-100 characters
     */
    public InputPollOption(String text) {
        this.text = text;
    }

    /**
     * Optional.
     * @param textParseMode Mode for parsing entities in the text
     */
    public InputPollOption setTextParseMode(ParseMode textParseMode) {
        this.textParseMode = textParseMode;
        return this;
    }

    /**
     * Optional.
     * @param textEntities A JSON-serialized list of special entities that appear in the poll option text. It can be specified instead of textParseMode
     */
    public InputPollOption setTextEntities(MessageEntity[] textEntities) {
        this.textEntities = List.of(textEntities);
        return this;
    }
}