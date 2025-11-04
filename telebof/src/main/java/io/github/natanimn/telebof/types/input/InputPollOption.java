package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object contains information about one answer option in a poll to be sent.
 * @param text Option text, 1-100 characters
 * @param textParseMode Optional. Mode for parsing entities in the text
 * @param textEntities Optional. A JSON-serialized list of special entities that appear in the poll option text. It can be specified instead of textParseMode
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputPollOption(
        String text,
        @SerializedName("text_parse_mode") ParseMode textParseMode,
        @SerializedName("text_entities") MessageEntity[] textEntities
) implements Serializable {

    /**
     * Creates a new InputPollOption builder
     * @param text Option text, 1-100 characters
     */
    public static InputPollOptionBuilder builder(String text) {
        return new InputPollOptionBuilder(text);
    }

    /**
     * Builder class for InputPollOption
     */
    public static class InputPollOptionBuilder {
        private final String text;
        private ParseMode textParseMode;
        private MessageEntity[] textEntities;

        public InputPollOptionBuilder(String text) {
            this.text = text;
        }

        public InputPollOptionBuilder textParseMode(ParseMode textParseMode) {
            this.textParseMode = textParseMode;
            return this;
        }

        public InputPollOptionBuilder textEntities(MessageEntity[] textEntities) {
            this.textEntities = textEntities;
            return this;
        }

        public InputPollOption build() {
            return new InputPollOption(text, textParseMode, textEntities);
        }
    }
}