package io.github.natanimn.telebof.types.keyboard;

import io.github.natanimn.telebof.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object represents one button of the reply keyboard.
 * At most one of the optional fields must be used to specify type of the button.
 * For simple text buttons, String can be used instead of this object to specify the button text.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.9
 */
public class KeyboardButton implements Serializable {
    private String text;
    private KeyboardButtonRequestUsers request_users;
    private KeyboardButtonRequestChat request_chat;
    private KeyboardButtonPollType request_poll;
    private Boolean request_contact;
    private Boolean request_location;
    private WebAppInfo wep_app;


    /**
     * Required
     * @param text Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed
     */
    public KeyboardButton(String text) {
        this.text = text;
    }

    /**
     * Optional
     * @param request_users If specified, pressing the button will open a list of suitable users.
     *                      Identifiers of selected users will be sent to the bot in a “users_shared” service message.
     *                      Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton requestUser(KeyboardButtonRequestUsers request_users) {
        this.request_users = request_users;
        return this;
    }

    /**
     * Optional
     * @param request_chat If specified, pressing the button will open a list of suitable chats.
     *                     Tapping on a chat will send its identifier to the bot in a “chat_shared” service message.
     *                     Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton requestChat(KeyboardButtonRequestChat request_chat) {
        this.request_chat = request_chat;
        return this;
    }

    /**
     * Optional
     * @param request_contact If True, the user's phone number will be sent as a contact when the button is pressed.
     *                        Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton requestContact(boolean request_contact) {
        this.request_contact = request_contact;
        return this;
    }

    /**
     * Optional
     * @param request_location If True, the user's current location will be sent when the button is pressed.
     *                        Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton requestLocation(boolean request_location) {
        this.request_location = request_location;
        return this;
    }

    /**
     * Optional
     * @param request_poll
     * @return {@link KeyboardButton}
     */
    public KeyboardButton requestPoll(KeyboardButtonPollType request_poll) {
        this.request_poll = request_poll;
        return this;
    }

    /**
     * Optional
     * @param wep_app If specified, the described <a href="https://core.telegram.org/bots/webapps">Web App</a> will be launched when the button is pressed.
     *                The Web App will be able to send a “web_app_data” service message. Available in private chats only.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton webApp(WebAppInfo wep_app) {
        this.wep_app = wep_app;
        return this;
    }

}
