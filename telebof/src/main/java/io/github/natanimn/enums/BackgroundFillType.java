package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

public enum BackgroundFillType {
    @SerializedName("solid")
    SOLID,

    @SerializedName("gradient")
    GRADIENT,

    @SerializedName("freeform_gradient")
    FREEFROM_GRADIENT
}
