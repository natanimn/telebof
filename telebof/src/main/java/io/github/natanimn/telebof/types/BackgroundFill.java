package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.BackgroundFillType;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This object describes the way a background is filled based on the selected colors
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BackgroundFill {
    /**
     * Type of the background fill
     */
    private BackgroundFillType type;

    /**
     * The color of the background fill in the RGB24 format
     */
    private Integer color;

    /**
     * Top color of the gradient in the RGB24 format
     */
    @SerializedName("top_color")
    private Integer topColor;

    /**
     * Bottom color of the gradient in the RGB24 format
     */
    @SerializedName("bottom_color")
    private Integer bottomColor;

    /**
     * Clockwise rotation angle of the background fill in degrees; 0-359
     */
    @SerializedName("rotation_angle")
    private Integer rotationAngle;

    /**
     * A list of the 3 or 4 base colors that are used to generate the freeform gradient in the RGB24 format
     */
    private List<Integer> colors;

    public BackgroundFillType getType() {
        return type;
    }

    public Integer getColor() {
        return color;
    }

    public Integer getTopColor() {
        return topColor;
    }

    public Integer getBottomColor() {
        return bottomColor;
    }

    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public List<Integer> getColors() {
        return colors;
    }
}