package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object defines the parameters for the creation of a managed bot.
 * Information about the created bot will be shared with the bot using the update managed_bot and a {@link io.github.natanimn.telebof.types.updates.Message} with the field managed_bot_created.
 *
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class KeyboardButtonRequestManagedBot implements Serializable {
    @SerializedName("request_id")
    private final int requestId;

    @SerializedName("suggested_name")
    private String suggestedName;

    @SerializedName("suggested_username")
    private String suggestedUsername;

    /**
     * Required
     * @param requestId Signed 32-bit identifier of the request. Must be unique within the message
     */
    public KeyboardButtonRequestManagedBot(int requestId){
        this.requestId = requestId;
    }

    /**
     * Optional
     * @param suggestedName Suggested name for the bot
     */
    public void setSuggestedName(String suggestedName) {
        this.suggestedName = suggestedName;
    }

    /**
     * Optional
     * @param suggestedUsername Suggested username for the bot
     */
    public void setSuggestedUsername(String suggestedUsername) {
        this.suggestedUsername = suggestedUsername;
    }
}
