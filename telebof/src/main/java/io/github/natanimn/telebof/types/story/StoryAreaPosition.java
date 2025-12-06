package io.github.natanimn.telebof.types.story;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the position of a clickable area within a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class StoryAreaPosition {
    /**
     * The abscissa of the area's center, as a percentage of the media width
     */
    @SerializedName("x_percentage")
    private Double xPercentage;

    /**
     * The ordinate of the area's center, as a percentage of the media height
     */
    @SerializedName("y_percentage")
    private Double yPercentage;

    /**
     * The width of the area's rectangle, as a percentage of the media width
     */
    @SerializedName("width_percentage")
    private Double widthPercentage;

    /**
     * The height of the area's rectangle, as a percentage of the media height
     */
    @SerializedName("height_percentage")
    private Double heightPercentage;

    /**
     * The clockwise rotation angle of the rectangle, in degrees; 0-360
     */
    @SerializedName("rotation_angle")
    private Double rotationAngle;

    /**
     * The radius of the rectangle corner rounding, as a percentage of the media width
     */
    @SerializedName("corner_radius_percentage")
    private Double cornerRadiusPercentage;

    public Double getXPercentage() {
        return xPercentage;
    }

    public Double getYPercentage() {
        return yPercentage;
    }

    public Double getWidthPercentage() {
        return widthPercentage;
    }

    public Double getHeightPercentage() {
        return heightPercentage;
    }

    public Double getRotationAngle() {
        return rotationAngle;
    }

    public Double getCornerRadiusPercentage() {
        return cornerRadiusPercentage;
    }
}