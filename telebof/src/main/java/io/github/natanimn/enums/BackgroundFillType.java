package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes of {@link io.github.natanimn.types.media_and_service.BackgroundFill#type}
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
