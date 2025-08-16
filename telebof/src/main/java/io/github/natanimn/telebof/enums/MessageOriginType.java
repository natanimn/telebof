package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * This enum represents one of message origin type
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum MessageOriginType {
    @SerializedName("user")
    USER,

    @SerializedName("hidden_user")
    HIDDEN_USER,

    @SerializedName("chat")
    CHAT,

    @SerializedName("channel")
    CHANNEL
}
