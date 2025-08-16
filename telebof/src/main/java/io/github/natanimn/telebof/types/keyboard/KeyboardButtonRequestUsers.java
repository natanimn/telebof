package io.github.natanimn.telebof.types.keyboard;

import java.io.Serializable;


/**
 * This object defines the criteria used to request suitable users.
 * Information about the selected users will be shared with the bot when the corresponding button is pressed.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see <a href="https://core.telegram.org/bots/features#chat-and-user-selection">More about requesting users »</a>
 */
public class KeyboardButtonRequestUsers implements Serializable {
    private Long request_id;
    private Boolean user_is_bot, user_is_premium, request_name, request_username, request_photo;
    private Byte max_quantity;

    /**
     * Required
     * @param request_id Signed 32-bit identifier of the request that will be received back in the {@link io.github.natanimn.telebof.types.chat_and_user.UsersShared} object.
     *                   Must be unique within the message
     */
    public KeyboardButtonRequestUsers(long request_id) {
        this.request_id = request_id;
    }

    /**
     * Optional
     * @param user_is_bot Pass True to request bots, pass False to request regular users. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers userIsBot(boolean user_is_bot) {
        this.user_is_bot = user_is_bot;
        return this;
    }

    /**
     * Optional
     * @param user_is_premium Pass True to request premium users, pass False to request non-premium users. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers userIsPremium(boolean user_is_premium) {
        this.user_is_premium = user_is_premium;
        return this;
    }

    /**
     * Optional
     * @param max_quantity The maximum number of users to be selected; 1-10. Defaults to 1
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers maxQuantity(byte max_quantity){
        this.max_quantity = max_quantity;
        return this;
    }

    /**
     * Optional
     * @param request_name Pass True to request the users' first and last names
     * @return {@link KeyboardButtonRequestUsers}
     */
    public KeyboardButtonRequestUsers requestName(boolean request_name){
        this.request_name = request_name;
        return this;
    }

    /**
     * Optional
     * @param request_username Pass True to request the users' usernames
     * @return {@link KeyboardButtonRequestUsers}
     */
    public  KeyboardButtonRequestUsers requestUsername(boolean request_username){
        this.request_username = request_username;
        return this;
    }

    /**
     * Optional
     * @param request_photo Pass True to request the users' photos
     * @return {@link KeyboardButtonRequestUsers}
     */
    public  KeyboardButtonRequestUsers requestPhoto(boolean request_photo){
        this.request_photo = request_photo;
        return this;
    }

}
