package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object describes the position on faces where a mask should be placed by default.
 * @author Natanim Negash
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class MaskPosition implements Serializable {
    /**
     * The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
     */
    private String point;

    /**
     * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    @SerializedName("x_shift")
    private Double xShift;

    /**
     * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.
     */
    @SerializedName("y_shift")
    private Double yShift;

    /**
     * Mask scaling coefficient. For example, 2.0 means double size.
     */
    private Double scale;
}