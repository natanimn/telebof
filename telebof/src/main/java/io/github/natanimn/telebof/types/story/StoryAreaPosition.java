package io.github.natanimn.telebof.types.story;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the position of a clickable area within a story.
 * @param xPercentage The abscissa of the area's center, as a percentage of the media width
 * @param yPercentage The ordinate of the area's center, as a percentage of the media height
 * @param widthPercentage The width of the area's rectangle, as a percentage of the media width
 * @param heightPercentage The height of the area's rectangle, as a percentage of the media height
 * @param rotationAngle The clockwise rotation angle of the rectangle, in degrees; 0-360
 * @param cornerRadiusPercentage The radius of the rectangle corner rounding, as a percentage of the media width
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryAreaPosition(
        @SerializedName("x_percentage") Double xPercentage,
        @SerializedName("y_percentage") Double yPercentage,
        @SerializedName("width_percentage") Double widthPercentage,
        @SerializedName("height_percentage") Double heightPercentage,
        @SerializedName("rotation_angle") Double rotationAngle,
        @SerializedName("corner_radius_percentage") Double cornerRadiusPercentage
) {}