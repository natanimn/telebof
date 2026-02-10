package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a service message about an ownership change in the chat.
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public class ChatOwnerChanged {
    /**
     * The new owner of the chat
     */
    @SerializedName("new_owner")
    private User newOwner;

    public User getNewOwner() {
        return newOwner;
    }
}
