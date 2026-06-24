package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichText;

/**
 * A custom emoji.
 * @author Natanim
 * @since 2.1
 */
public class RichTextCustomEmoji implements RichText {
    /**
     * Type of the rich text, always “custom_emoji”
     */
    private final String type = "custom_emoji";

    /**
     * Unique identifier of the custom emoji. Use getCustomEmojiStickers to get full information about the sticker.
     */
    @SerializedName("custom_emoji_id")
    private final String customEmojiId;

    /**
     * Alternative emoji for the custom emoji
     */
    @SerializedName("alternative_text")
    private final String alternativeText;

    public RichTextCustomEmoji(String customEmojiId, String alternativeText){
        this.customEmojiId = customEmojiId;
        this.alternativeText = alternativeText;
    }
}
