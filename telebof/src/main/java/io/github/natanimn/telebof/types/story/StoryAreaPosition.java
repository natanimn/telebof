package io.github.natanimn.telebof.types.story;

/**
 * Describes the position of a clickable area within a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryAreaPosition {
    private Double x_percentage;
    private Double y_percentage;
    private Double width_percentage;
    private Double height_percentage;
    private Double rotation_angle;
    private Double corner_radius_percentage;

    /**
     * Required
     * @param x_percentage The abscissa of the area's center, as a percentage of the media width
     * @param y_percentage The ordinate of the area's center, as a percentage of the media height
     * @param width_percentage The width of the area's rectangle, as a percentage of the media width
     * @param height_percentage The height of the area's rectangle, as a percentage of the media height
     * @param rotation_angle The clockwise rotation angle of the rectangle, in degrees; 0-360
     * @param corner_radius_percentage The radius of the rectangle corner rounding, as a percentage of the media width
     */
    public StoryAreaPosition(double x_percentage, double y_percentage, double width_percentage,
                             double height_percentage, double rotation_angle, double corner_radius_percentage) {
        this.x_percentage = x_percentage;
        this.y_percentage = y_percentage;
        this.width_percentage = width_percentage;
        this.height_percentage = height_percentage;
        this.rotation_angle = rotation_angle;
        this.corner_radius_percentage = corner_radius_percentage;
    }
}
