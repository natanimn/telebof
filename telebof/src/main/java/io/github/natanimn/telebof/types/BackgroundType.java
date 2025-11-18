package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.BackgroundTypeType;
import io.github.natanimn.telebof.types.media_and_service.Document;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes the type of background.
 *
 * @param type Type of the background
 * @param themeName Name of the chat theme, which is usually an emoji
 * @param fill The background fill that is combined with the pattern
 * @param darkThemeDimming Dimming of the background in dark themes, as a percentage; 0-100
 * @param intensity Intensity of the pattern when it is shown above the filled background; 0-100
 * @param document Document with the pattern
 * @param isBlurred True, if the wallpaper is downscaled to fit in a 450x450 square and then box-blurred with radius 12
 * @param isMoving True, if the background moves slightly when the device is tilted
 * @param isInverted True, if the background fill must be applied only to the pattern itself. All other pixels are black in this case. For dark themes only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record BackgroundType(
        BackgroundTypeType type,
        @SerializedName("theme_name") String themeName,
        BackgroundFill fill,
        @SerializedName("dark_theme_dimming") Integer darkThemeDimming,
        Integer intensity,
        Document document,
        @SerializedName("is_blurred") Boolean isBlurred,
        @SerializedName("is_moving") Boolean isMoving,
        @SerializedName("is_inverted") Boolean isInverted
) {}