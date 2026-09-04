package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ButtonStyle;
import io.github.natanimn.telebof.types.keyboard.DisabledButton;
import io.github.natanimn.telebof.types.keyboard.LoginUrl;
import io.github.natanimn.telebof.types.media_and_service.CopyTextButton;
import io.github.natanimn.telebof.types.media_and_service.SwitchInlineQueryChosenChat;
import io.github.natanimn.telebof.types.web.WebAppInfo;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object represents a button in a RichMessage. Exactly one of the fields other than text and style must be used to specify the type of the button.
 * @author Natanim
 * @since 2.3
 */
@Setter(AccessLevel.PRIVATE)
@Accessors(chain = true)
public class RichMessageButton implements Serializable {
    /**
     * Text of the button.
     */
    private final Object text;

    /**
     * Optional. Style of the button.
     */
    @Setter(AccessLevel.PUBLIC)
    private ButtonStyle style;

    /**
     * Optional. HTTP or tg:// URL to be opened when the button is pressed.
     * Links tg://user?id=<user_id> can be used to mention a user by their identifier without using a username, if this is allowed by their privacy settings
     */
    private String url;

    /**
     * Optional. Data to be sent in a callback query to the bot when the button is pressed, 1-64 bytes
     */
    @SerializedName("callback_data")
    private String callbackData;

    /**
     * Optional. Description of the Web App that will be launched when the user presses the button.
     * The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery.
     * Available only in private chats between a user and the bot. Not supported for messages sent on behalf of a business account.
     */
    @SerializedName("web_app")
    private WebAppInfo webApp;

    /**
     * Optional. An HTTPS URL used to automatically authorize the user. Can be used as a replacement for the Telegram Login Widget.
     * Not supported for ephemeral messages.
     */
    @SerializedName("login_url")
    private LoginUrl loginUrl;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot's username and the specified inline query in the input field.
     * May be empty, in which case just the bot's username will be inserted. Not supported for messages sent in channel direct messages chats and on behalf of a business account.
     */
    @SerializedName("switch_inline_query")
    private String switchInlineQuery;

    /**
     * Optional. If set, pressing the button will insert the bot's username and the specified inline query in the current chat's input field.
     * May be empty, in which case only the bot's username will be inserted. Not supported in channels and for messages sent in channel direct messages chats and on behalf of a business account.
     */
    @SerializedName("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats of the specified type, open that chat and insert the bot's username and the specified inline query in the input field.
     * Not supported for messages sent in channel direct messages chats and on behalf of a business account.
     */
    @SerializedName("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

    /**
     * Optional. A button that copies the specified text to the clipboard
     */
    @SerializedName("copy_text")
    private CopyTextButton copyTextButton;

    /**
     * Optional. If set, then the button is disabled and does nothing
     */
    private DisabledButton disabled;

    private RichMessageButton(Object text) {
        this.text = text;
    }

    public static RichMessageButton ofUrl(Object text, String url){
        return new RichMessageButton(text).setUrl(url);
    }

    public static RichMessageButton ofCallbackData(Object text, String callbackData){
        return new RichMessageButton(text).setCallbackData(callbackData);
    }

    public static RichMessageButton ofWebApp(Object text, WebAppInfo webApp){
        return new RichMessageButton(text).setWebApp(webApp);
    }

    public static RichMessageButton ofLoginUrl(Object text, LoginUrl loginUrl){
        return new RichMessageButton(text).setLoginUrl(loginUrl);
    }

    public static RichMessageButton ofSwitchInlineQuery(Object text, String switchInlineQuery){
        return new RichMessageButton(text).setSwitchInlineQuery(switchInlineQuery);
    }

    public static RichMessageButton ofSwitchInlineQueryCurrentChat(Object text, String switchInlineQueryCurrentChat){
        return new RichMessageButton(text).setSwitchInlineQueryCurrentChat(switchInlineQueryCurrentChat);
    }

    public static RichMessageButton ofSwitchInlineQueryChosenChat(Object text, SwitchInlineQueryChosenChat switchInlineQueryChosenChat){
        return new RichMessageButton(text).setSwitchInlineQueryChosenChat(switchInlineQueryChosenChat);
    }

    public static RichMessageButton ofDisabled(Object text){
        return new RichMessageButton(text).setDisabled(new DisabledButton());
    }

}
