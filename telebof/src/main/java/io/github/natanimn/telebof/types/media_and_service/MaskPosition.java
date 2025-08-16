package io.github.natanimn.telebof.types.media_and_service;

import java.io.Serializable;

/**
 * This object describes the position on faces where a mask should be placed by default.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.9
 */
public class MaskPosition implements Serializable {
    /**
     * The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
     */
    public String point;

    /**
     * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right.
     * For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    public Double x_shift;

    /**
     * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
     * For example, 1.0 will place the mask just below the default mask position.
     */
    public Double y_shift;

    /**
     * Mask scaling coefficient. For example, 2.0 means double size.
     */
    public Double scale;

    public MaskPosition point(String point){
        this.point = point;
        return this;
    }

    public MaskPosition xShift(double x_shift){
        this.x_shift = x_shift;
        return this;
    }

    public MaskPosition yShift(double y_shift){
        this.y_shift = y_shift;
        return this;
    }

    public MaskPosition scale(double scale){
        this.scale= scale;
        return this;
    }
}
