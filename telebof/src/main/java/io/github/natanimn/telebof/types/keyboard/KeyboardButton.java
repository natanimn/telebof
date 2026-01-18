package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object represents one button of the reply keyboard.
 * At most one of the optional fields must be used to specify type of the button.
 * For simple text buttons, String can be used instead of this object to specify the button text.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class KeyboardButton implements Serializable {

    private String text;

    @SerializedName("request_users")
    private KeyboardButtonRequestUsers requestUsers;

    @SerializedName("request_chat")
    private KeyboardButtonRequestChat requestChat;

    @SerializedName("request_poll")
    private KeyboardButtonPollType requestPoll;

    @SerializedName("request_contact")
    private Boolean requestContact;

    @SerializedName("request_location")
    private Boolean requestLocation;

    @SerializedName("web_app")
    private WebAppInfo wepApp;


    /**
     * Required
     * @param text Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed
     */
    public KeyboardButton(String text) {
        this.text = text;
    }

    /**
     * Optional
     * @param requestUsers If specified, pressing the button will open a list of suitable users.
     *                      Identifiers of selected users will be sent to the bot in a “users_shared” service message.
     *                      Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setRequestUsers(KeyboardButtonRequestUsers requestUsers) {
        this.requestUsers = requestUsers;
        return this;
    }

    /**
     * Optional
     * @param requestChat If specified, pressing the button will open a list of suitable chats.
     *                     Tapping on a chat will send its identifier to the bot in a “chat_shared” service message.
     *                     Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setRequestChat(KeyboardButtonRequestChat requestChat) {
        this.requestChat = requestChat;
        return this;
    }

    /**
     * Optional
     * @param requestContact If True, the user's phone number will be sent as a contact when the button is pressed.
     *                        Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    /**
     * Optional
     * @param requestLocation If True, the user's current location will be sent when the button is pressed.
     *                        Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }

    /**
     * Optional
     * @param requestPoll
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setRequestPoll(KeyboardButtonPollType requestPoll) {
        this.requestPoll = requestPoll;
        return this;
    }

    /**
     * Optional
     * @param wepApp If specified, the described <a href="https://core.telegram.org/bots/webapps">Web App</a> will be launched when the button is pressed.
     *                The Web App will be able to send a “web_app_data” service message. Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setWebApp(WebAppInfo wepApp) {
        this.wepApp = wepApp;
        return this;
    }

}
