package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a rich message to be sent as the result of an inline query.
 * @author Natanim
 * @since 2.1
 */
public class InputRichMessageContent implements InputMessageContent{

    @SerializedName("rich_message")
    private final InputRichMessage richMessage;

    /**
     * Required
     * @param richMessage The message to be sent
     */
    public InputRichMessageContent(InputRichMessage richMessage) {
        this.richMessage = richMessage;
    }
}
