package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object describes the position on faces where a mask should be placed by default.
 * @param point The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
 * @param xShift Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask position.
 * @param yShift Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.
 * @param scale Mask scaling coefficient. For example, 2.0 means double size.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MaskPosition(
        String point,
        @SerializedName("x_shift") Double xShift,
        @SerializedName("y_shift") Double yShift,
        Double scale
) implements Serializable {

    /**
     * Creates a new MaskPosition builder
     */
    public static MaskPositionBuilder builder() {
        return new MaskPositionBuilder();
    }

    /**
     * Builder class for MaskPosition
     */
    public static class MaskPositionBuilder {
        private String point;
        private Double xShift;
        private Double yShift;
        private Double scale;

        public MaskPositionBuilder point(String point) {
            this.point = point;
            return this;
        }

        public MaskPositionBuilder xShift(double xShift) {
            this.xShift = xShift;
            return this;
        }

        public MaskPositionBuilder yShift(double yShift) {
            this.yShift = yShift;
            return this;
        }

        public MaskPositionBuilder scale(double scale) {
            this.scale = scale;
            return this;
        }

        public MaskPosition build() {
            return new MaskPosition(
                    point,
                    xShift,
                    yShift,
                    scale
            );
        }
    }
}