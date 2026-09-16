package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes a service message about an ownership change in the chat.
 * @author Natanim
 * @since 1.4.0
 */
@Getter
public class ChatOwnerChanged {
    /**
     * The new owner of the chat
     */
    @SerializedName("new_owner")
    private User newOwner;

}
