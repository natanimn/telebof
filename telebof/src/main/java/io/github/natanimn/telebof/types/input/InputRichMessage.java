package io.github.natanimn.telebof.types.input;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a rich message to be sent. Exactly one of the fields html or markdown must be used.
 * @author Natanim
 * @since 2.1
 */
public class InputRichMessage implements Serializable {
    private String html;
    private String markdown;

    @SerializedName("is_rtl")
    private Boolean isRtl;

    @SerializedName("skip_entity_detection")
    private Boolean skipEntityDetection;

    private InputRichMessage(String text, boolean isHtml){
        if (isHtml)
            this.html = text;
        else
            this.markdown = text;
    }

    /**
     * Required
     * @param text Content of the rich message to send described using HTML formatting. See <a href="https://core.telegram.org/bots/api#rich-message-formatting-options">rich message formatting options</a> for more details.
     * @return {@link InputRichMessage}
     */
    public static InputRichMessage ofHtml(String text){
        return new InputRichMessage(text, true);
    }

    /**
     * Required
     * @param text Content of the rich message to send described using Markdown formatting. See <a href="https://core.telegram.org/bots/api#rich-message-formatting-options">rich message formatting options</a> for more details.
     * @return {@link InputRichMessage}
     */
    public static InputRichMessage ofMarkdown(String text){
        return new InputRichMessage(text, false);
    }

    /**
     * Optional
     * @param isRtl Pass True if the rich message must be shown right-to-left
     * @return {@link InputRichMessage}
     */
    public InputRichMessage setIsRtl(Boolean isRtl){
        this.isRtl = isRtl;
        return this;
    }

    /**
     * Optional
     * @param skipEntityDetection Pass True to skip automatic detection of entities (e.g., URLs, email addresses, username mentions,
     *                            hashtags, cashtags, bot commands, or phone numbers) in the text
     * @return {@link InputRichMessage}
     */
    public InputRichMessage setSkipEntityDetection(Boolean skipEntityDetection){
        this.skipEntityDetection = skipEntityDetection;
        return this;
    }

}
