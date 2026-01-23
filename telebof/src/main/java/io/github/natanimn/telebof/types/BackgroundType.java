package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.BackgroundTypeType;
import io.github.natanimn.telebof.types.media_and_service.Document;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes the type of background.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BackgroundType {
    /**
     * Type of the background
     */
    BackgroundTypeType type;

    /**
     * Name of the chat theme, which is usually an emoji
     */
    @SerializedName("theme_name")
    private String themeName;

    /**
     * The background fill that is combined with the pattern
     */
    private BackgroundFill fill;

    /**
     * Dimming of the background in dark themes, as a percentage; 0-100
     */
    @SerializedName("dark_theme_dimming")
    private Integer darkThemeDimming;

    /**
     * Intensity of the pattern when it is shown above the filled background; 0-100
     */
    private Integer intensity;

    /**
     * Document with the pattern
     */
    private Document document;

    /**
     * True, if the wallpaper is downscaled to fit in a 450x450 square and then box-blurred with radius 12
     */
    @SerializedName("is_blurred")
    private Boolean isBlurred;

    /**
     * True, if the background moves slightly when the device is tilted
     */
    @SerializedName("is_moving")
    private Boolean isMoving;

    /**
     * True, if the background fill must be applied only to the pattern itself. All other pixels are black in this case. For dark themes only
     */
    @SerializedName("is_inverted")
    private Boolean isInverted;

    public BackgroundTypeType getType() {
        return type;
    }

    public String getThemeName() {
        return themeName;
    }

    public BackgroundFill getFill() {
        return fill;
    }

    public Integer getDarkThemeDimming() {
        return darkThemeDimming;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public Document getDocument() {
        return document;
    }

    public Boolean getIsBlurred() {
        return isBlurred;
    }

    public Boolean getIsMoving() {
        return isMoving;
    }

    public Boolean getIsInverted() {
        return isInverted;
    }
}