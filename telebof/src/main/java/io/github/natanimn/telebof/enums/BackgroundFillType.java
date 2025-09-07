package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.BackgroundFill;

/**
 * Describes of {@link BackgroundFill#type}
 * @author Natanim
 * @since 12 August 2025
 * @version 0.9
 */
public enum BackgroundFillType {
    @SerializedName("solid")
    SOLID,

    @SerializedName("gradient")
    GRADIENT,

    @SerializedName("freeform_gradient")
    FREEFROM_GRADIENT
}
