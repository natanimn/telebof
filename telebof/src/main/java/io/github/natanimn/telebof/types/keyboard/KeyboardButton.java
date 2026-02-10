package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ButtonStyle;
import io.github.natanimn.telebof.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object represents one button of the reply keyboard.
 * At most one of the optional fields must be used to specify type of the button.
 * For simple text buttons, String can be used instead of this object to specify the button text.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.4.0
 */
public class KeyboardButton implements Serializable {

    private final String text;

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

    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    private ButtonStyle style;

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
     * @param requestPoll Optional. If specified, the user will be asked to create a poll and send it to the bot when the button is pressed. Available in private chats only.
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

    /**
     * Optional
     * @param iconCustomEmojiId Optional. Unique identifier of the custom emoji shown before the text of the button.
     *                          Can only be used by bots that purchased additional usernames on <a href="https://fragment.com">Fragment</a> or in the messages directly sent by the bot to private, group and supergroup chats if the owner of the bot has a Telegram Premium subscription.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
        return this;
    }

    /**
     * Optional
     * @param style Style of the button. If omitted, then an app-specific style is used.
     * @return {@link KeyboardButton}
     */
    public KeyboardButton setStyle(ButtonStyle style) {
        this.style = style;
        return this;
    }
}
