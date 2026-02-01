package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about the color scheme for a user's name, message replies and link previews based on a unique gift.
 * @author Natanim
 * @since 1.3.0
 * @version 1.3.0
 */
public class UniqueGiftColors {

    /**
     * Custom emoji identifier of the unique gift's model
     */
    @SerializedName("model_custom_emoji_id")
    private String modelCustomEmojiId;

    /**
     * Custom emoji identifier of the unique gift's symbol
     */
    @SerializedName("symbol_custom_emoji_id")
    private String symbolCustomEmojiId;

    /**
     * Main color used in light themes; RGB format
     */
    @SerializedName("light_theme_main_color")
    private Integer lightThemeMainColor;

    /**
     * List of 1-3 additional colors used in light themes; RGB format
     */
    @SerializedName("light_theme_other_colors")
    private List<Integer> lightThemeOtherColors;

    /**
     * Main color used in dark themes; RGB format
     */
    @SerializedName("dark_theme_main_color")
    private Integer darkThemeMainColor;

    /**
     * List of 1-3 additional colors used in dark themes; RGB format
     */
    @SerializedName("dark_theme_other_colors")
    private List<Integer> darkThemeOtherColors;

    public String getModelCustomEmojiId() {
        return modelCustomEmojiId;
    }

    public String getSymbolCustomEmojiId() {
        return symbolCustomEmojiId;
    }

    public Integer getLightThemeMainColor() {
        return lightThemeMainColor;
    }

    public List<Integer> getLightThemeOtherColors() {
        return lightThemeOtherColors;
    }

    public Integer getDarkThemeMainColor() {
        return darkThemeMainColor;
    }

    public List<Integer> getDarkThemeOtherColors() {
        return darkThemeOtherColors;
    }
}
