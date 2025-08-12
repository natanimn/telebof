package io.github.natanimn.types.media_and_service;

import io.github.natanimn.enums.BackgroundTypeType;

/**
 * This object describes the type of a background.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class BackgroundType {
    /**
     * Type of the background
     */
    public BackgroundTypeType type;

    /**
     * Name of the chat theme, which is usually an emoji
     */
    public String theme_name;

    /**
     * The background fill that is combined with the pattern
     */
    public BackgroundFill fill;

    /**
     * Dimming of the background in dark themes, as a percentage; 0-100
     */
    public Integer dark_theme_dimming;

    /**
     * Intensity of the pattern when it is shown above the filled background; 0-100
     */
    public Integer intensity;

    /**
     * Document with the pattern
     */
    public Document document;

    /**
     * True, if the wallpaper is downscaled to fit in a 450x450 square and then box-blurred with radius 12
     */
    public Boolean is_blurred;

    /**
     * True, if the background moves slightly when the device is tilted
     */
    public Boolean is_moving;

    /**
     * True, if the background fill must be applied only to the pattern itself. All other pixels are black in this case.
     * For dark themes only
     */
    public Boolean is_inverted;
}
