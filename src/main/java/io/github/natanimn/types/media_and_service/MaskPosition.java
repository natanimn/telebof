package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class MaskPosition implements Serializable {
    public String point;
    public Double x_shift, y_shift, scale;

    public MaskPosition point(String point){
        this.point = point;
        return this;
    }

    public MaskPosition xShift(double xShift){
        this.x_shift = xShift;
        return this;
    }

    public MaskPosition yShift(double yShift){
        this.y_shift = yShift;
        return this;
    }

    public MaskPosition scale(double scale){
        this.scale= scale;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MaskPosition that = (MaskPosition) object;
        return Objects.equals(point, that.point) && Objects.equals(x_shift, that.x_shift) &&
                Objects.equals(y_shift, that.y_shift) && Objects.equals(scale, that.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, x_shift, y_shift, scale);
    }
}
