package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Natanim
 * @since 28 July 2025
 * @version 0.8
 */
public enum ChatType {
    @SerializedName("private")
    PRIVATE,

    @SerializedName("group")
    GROUP,

    @SerializedName("supergroup")
    SUPERGROUP,

    @SerializedName("channel")
    CHANNEL
}
