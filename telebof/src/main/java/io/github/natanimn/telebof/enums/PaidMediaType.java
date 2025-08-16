package io.github.natanimn.telebof.enums;

import io.github.natanimn.telebof.types.payments.PaidMedia;
import com.google.gson.annotations.SerializedName;

/**
 * Describes {@link PaidMedia#type}
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum PaidMediaType {
    @SerializedName("preview")
    PREVIEW,

    @SerializedName("photo")
    PHOTO,

    @SerializedName("video")
    VIDEO
}
