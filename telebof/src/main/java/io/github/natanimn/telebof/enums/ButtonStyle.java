package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents button style
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public enum ButtonStyle {
    @SerializedName("primary")
    PRIMARY,

    @SerializedName("danger")
    DANGER,

    @SerializedName("success")
    SUCCESS
}
