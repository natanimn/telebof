package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the status of a member in a chat
 * @author Natanim
 * @since 26 August 2025
 * @version 1.0.0
 */
public enum ChatMemberStatus {
    @SerializedName("banned")
    BANNED,

    @SerializedName("left")
    LEFT,

    @SerializedName("administrator")
    ADMINISTRATOR,

    @SerializedName("creator")
    CREATOR,

    @SerializedName("restricted")
    RESTRICTED,

    @SerializedName("member")
    MEMBER
}
