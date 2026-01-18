package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


/**
 * This object defines the criteria used to request suitable users.
 * Information about the selected users will be shared with the bot when the corresponding button is pressed.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see <a href="https://core.telegram.org/bots/features#chat-and-user-selection">More about requesting users »</a>
 */
public class KeyboardButtonRequestUsers implements Serializable {

    @SerializedName("request_id")
    private Long requestId;

    @SerializedName("user_is_bot")
    private Boolean userIsBot;

    @SerializedName("user_is_premium")
    private Boolean userIsPremium;

    @SerializedName("request_name")
    private Boolean requestName;

    @SerializedName("request_username")
    private Boolean requestUsername;

    @SerializedName("request_photo")
    private Boolean requestPhoto;

    @SerializedName("max_quantity")
    private Integer maxQuantity;

    /**
     * Required
     * @param requestId Signed 32-bit identifier of the request that will be received back in the {@link io.github.natanimn.telebof.types.chat_and_user.UsersShared} object.
     *                   Must be unique within the message
     */
    public KeyboardButtonRequestUsers(long requestId) {
        this.requestId = requestId;
    }

    /**
     * Optional
     * @param userIsBot Pass True to request bots, pass False to request regular users. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers setUserIsBot(boolean userIsBot) {
        this.userIsBot = userIsBot;
        return this;
    }

    /**
     * Optional
     * @param user_is_premium Pass True to request premium users, pass False to request non-premium users. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers setUserIsPremium(boolean userIsPremium) {
        this.userIsPremium = userIsPremium;
        return this;
    }

    /**
     * Optional
     * @param maxQuantity The maximum number of users to be selected; 1-10. Defaults to 1
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers setMaxQuantity(int maxQuantity){
        this.maxQuantity = maxQuantity;
        return this;
    }

    /**
     * Optional
     * @param requestName Pass True to request the users' first and last names
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers setRequestName(boolean requestName){
        this.requestName = requestName;
        return this;
    }

    /**
     * Optional
     * @param requestUsername Pass True to request the users' usernames
     * @return {@link KeyboardButtonRequestUsers}
     */
    public  KeyboardButtonRequestUsers setRequestUsername(boolean requestUsername){
        this.requestUsername = requestUsername;
        return this;
    }

    /**
     * Optional
     * @param requestPhoto Pass True to request the users' photos
     * @return {@link KeyboardButtonRequestUsers}
     */
    public  KeyboardButtonRequestUsers setRequestPhoto(boolean requestPhoto){
        this.requestPhoto = requestPhoto;
        return this;
    }

}
