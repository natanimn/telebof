package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.BackgroundFillType;

import java.util.List;

/**
 * This object describes the way a background is filled based on the selected colors
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class BackgroundFill {
    /**
     * Type of the background fill,
     */
    public BackgroundFillType type;

    /**
     * The color of the background fill in the RGB24 format
     */
    public Integer color;

    /**
     * Top color of the gradient in the RGB24 format
     */
    public Integer top_color;

    /**
     * Bottom color of the gradient in the RGB24 format
     */
    public Integer bottom_color;

    /**
     * Clockwise rotation angle of the background fill in degrees; 0-359
     */
    public Integer rotation_angle;

    /**
     * A list of the 3 or 4 base colors that are used to generate the freeform gradient in the RGB24 format
     */
    public List<Integer> colors;
}
