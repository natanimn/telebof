package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.media_and_service.CallbackGame;
import io.github.natanimn.telebof.types.media_and_service.CopyTextButton;
import io.github.natanimn.telebof.types.media_and_service.SwitchInlineQueryChosenChat;
import io.github.natanimn.telebof.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object represents one button of an inline keyboard.
 * Exactly one of the optional fields must be used to specify type of the button.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineKeyboardButton implements Serializable {
    private final String text;
    private String url;

    @SerializedName("callback_data")
    private String callbackData;

    @SerializedName("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    @SerializedName("web_app")
    private WebAppInfo wepApp;

    @SerializedName("login_url")
    private LoginUrl loginUrl;

    private Boolean pay;

    @SerializedName("callback_game")
    private CallbackGame callbackGame;

    @SerializedName("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

    @SerializedName("copy_text")
    private CopyTextButton copyText;

    /**
     * Required
     * @param text Label text on the button
     */
    public InlineKeyboardButton(String text) {
        this.text = text;
    }

    /**
     *
     * @param text Required. Label text on the button
     * @param callbackData Optional. Data to be sent in a callback query to the bot when the button is pressed, 1-64 bytes
     */
    public InlineKeyboardButton(String text, String callbackData) {
        this.text = text;
        this.callbackData = callbackData;
    }

    /**
     * Optional
     * @param url HTTP or tg:// URL to be opened when the button is pressed. Links tg://user?id=<user_id>
     *            can be used to mention a user by their identifier without using a username, if this is allowed by their privacy settings.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional
     * @param webApp Description of the Web App that will be launched when the user presses the button.
     *                The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery.
     *                Available only in private chats between a user and the bot.
     *                Not supported for messages sent on behalf of a Telegram Business account.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setWebApp(WebAppInfo webApp) {
        this.wepApp = webApp;
        return this;
    }

    /**
     * Optional
     * @param loginUrl An HTTPS URL used to automatically authorize the user.
     *                  Can be used as a replacement for the <a href="https://core.telegram.org/widgets/login">Telegram Login Widget.</a>
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setLoginUrl(LoginUrl loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * Optional
     * @param switchInlineQueryCurrentChat  If set, pressing the button will insert the bot's username and the specified inline query in the current chat's input field.
     *                                          May be empty, in which case only the bot's username will be inserted.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    /**
     * Optional
     * @param callbackGame Description of the game that will be launched when the user presses the button.<br>
     *
     * <b>NOTE:</b> This type of button must always be the first button in the first row.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
        return this;
    }

    /**
     * Optional
     * @param pay  Specify True, to send a <a href="https://core.telegram.org/bots/api#payments">Pay button.</a>
     *             Substrings “⭐” and “XTR” in the buttons's text will be replaced with a Telegram Star icon.<br>
     *
     * <b>NOTE:</b> This type of button must always be the first button in the first row and can only be used in invoice messages.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setPay(Boolean pay) {
        this.pay = pay;
        return this;
    }

    /**
     * Optional
     * @param switchInlineQueryChosenChat If set, pressing the button will prompt the user to select one of their chats of the specified type,
     *                                        open that chat and insert the bot's username and the specified inline query in the input field.
     *                                        Not supported for messages sent on behalf of a Telegram Business account.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setSwitchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat){
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    /**
     * Optional.
     * @param copyText Description of the button that copies the specified text to the clipboard.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton setCopyText(CopyTextButton copyText){
        this.copyText = copyText;
        return this;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public WebAppInfo getWepApp() {
        return wepApp;
    }

    public LoginUrl getLoginUrl() {
        return loginUrl;
    }

    public Boolean getPay() {
        return pay;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public SwitchInlineQueryChosenChat getSwitchInlineQueryChosenChat() {
        return switchInlineQueryChosenChat;
    }

    public CopyTextButton getCopyText() {
        return copyText;
    }
}
