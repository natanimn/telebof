package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.BackgroundFillType;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This object describes the way a background is filled based on the selected colors
 *
 * @param type Type of the background fill
 * @param color The color of the background fill in the RGB24 format
 * @param topColor Top color of the gradient in the RGB24 format
 * @param bottomColor Bottom color of the gradient in the RGB24 format
 * @param rotationAngle Clockwise rotation angle of the background fill in degrees; 0-359
 * @param colors A list of the 3 or 4 base colors that are used to generate the freeform gradient in the RGB24 format
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record BackgroundFill(
        BackgroundFillType type,
        Integer color,
        @SerializedName("top_color") Integer topColor,
        @SerializedName("bottom_color") Integer bottomColor,
        @SerializedName("rotation_angle") Integer rotationAngle,
        List<Integer> colors
) {}