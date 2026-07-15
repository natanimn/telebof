package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents result of chat join request query
 * @author Natanim
 * @since 2.1
 */
public enum ChatJoinRequestResult {
    /**
     * Allow the user to join the chat
     */
    @SerializedName("approve")
    APPROVE,

    /**
     * Disallow the user to join the chat
     */
    @SerializedName("decline")
    DECLINE,

    /**
     * Leave the decision to other administrators.
     */
    @SerializedName("queue")
    QUEUE
}
