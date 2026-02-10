package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a service message about the chat owner leaving the chat.
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public class ChatOwnerLeft {
    /**
     * Optional. The user which will be the new owner of the chat if the previous owner does not return to the chat
     */
    @SerializedName("new_owner")
    private User newOwner;

    public User getNewOwner() {
        return newOwner;
    }
}
