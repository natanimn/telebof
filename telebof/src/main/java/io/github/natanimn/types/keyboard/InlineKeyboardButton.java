package io.github.natanimn.types.keyboard;

import io.github.natanimn.types.media_and_service.CallbackGame;
import io.github.natanimn.types.media_and_service.CopyTextButton;
import io.github.natanimn.types.media_and_service.SwitchInlineQueryChosenChat;
import io.github.natanimn.types.web.WebAppInfo;

import java.io.Serializable;
import java.util.Objects;

/**
 * This object represents one button of an inline keyboard.
 * Exactly one of the optional fields must be used to specify type of the button.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineKeyboardButton implements Serializable {
    public String text, url, callback_data, switch_inline_query_current_chat;
    public WebAppInfo wep_app;
    public LoginUrl login_url;
    public Boolean pay;
    public CallbackGame callback_game;
    public SwitchInlineQueryChosenChat switch_inline_query_chosen_chat;
    public CopyTextButton copy_text;

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
     * @param callback_data Optional. Data to be sent in a callback query to the bot when the button is pressed, 1-64 bytes
     */
    public InlineKeyboardButton(String text, String callback_data) {
        this.text = text;
        this.callback_data = callback_data;
    }

    /**
     * Optional
     * @param url HTTP or tg:// URL to be opened when the button is pressed. Links tg://user?id=<user_id>
     *            can be used to mention a user by their identifier without using a username, if this is allowed by their privacy settings.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional
     * @param web_app Description of the Web App that will be launched when the user presses the button.
     *                The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery.
     *                Available only in private chats between a user and the bot.
     *                Not supported for messages sent on behalf of a Telegram Business account.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton webApp(WebAppInfo web_app) {
        this.wep_app = web_app;
        return this;
    }

    /**
     * Optional
     * @param login_url An HTTPS URL used to automatically authorize the user.
     *                  Can be used as a replacement for the <a href="https://core.telegram.org/widgets/login">Telegram Login Widget.</a>
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton loginUrl(LoginUrl login_url) {
        this.login_url = login_url;
        return this;
    }

    /**
     * Optional
     * @param switch_inline_query_current_chat  If set, pressing the button will insert the bot's username and the specified inline query in the current chat's input field.
     *                                          May be empty, in which case only the bot's username will be inserted.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton switchInlineQueryCurrentChat(String switch_inline_query_current_chat) {
        this.switch_inline_query_current_chat = switch_inline_query_current_chat;
        return this;
    }

    /**
     * Optional
     * @param callback_game Description of the game that will be launched when the user presses the button.<br>
     *
     * <b>NOTE:</b> This type of button must always be the first button in the first row.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton callbackGame(CallbackGame callback_game) {
        this.callback_game = callback_game;
        return this;
    }

    /**
     * Optional
     * @param pay  Specify True, to send a <a href="https://core.telegram.org/bots/api#payments">Pay button.</a>
     *             Substrings “⭐” and “XTR” in the buttons's text will be replaced with a Telegram Star icon.<br>
     *
     * <b>NOTE:</b> This type of button must always be the first button in the first row and can only be used in invoice messages.
     * @return
     */
    public InlineKeyboardButton pay(boolean pay) {
        this.pay = pay;
        return this;
    }

    /**
     * Optional
     * @param switch_inline_query_chosen_chat If set, pressing the button will prompt the user to select one of their chats of the specified type,
     *                                        open that chat and insert the bot's username and the specified inline query in the input field.
     *                                        Not supported for messages sent on behalf of a Telegram Business account.
     * @return {@link InlineKeyboardButton}
     */
    public InlineKeyboardButton switchInlineQueryChosenChat(SwitchInlineQueryChosenChat switch_inline_query_chosen_chat){
        this.switch_inline_query_chosen_chat = switch_inline_query_chosen_chat;
        return this;
    }

    public InlineKeyboardButton copyText(CopyTextButton copy_text){
        this.copy_text = copy_text;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineKeyboardButton button = (InlineKeyboardButton) object;
        return Objects.equals(text, button.text) &&
                Objects.equals(url, button.url) &&
                Objects.equals(callback_data, button.callback_data) &&
                Objects.equals(switch_inline_query_current_chat, button.switch_inline_query_current_chat) &&
                Objects.equals(wep_app, button.wep_app) &&
                Objects.equals(login_url, button.login_url) &&
                Objects.equals(pay, button.pay) &&
                Objects.equals(callback_game, button.callback_game) &&
                Objects.equals(switch_inline_query_chosen_chat, button.switch_inline_query_chosen_chat) &&
                Objects.equals(copy_text, button.copy_text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url, callback_data, switch_inline_query_current_chat, wep_app, login_url, pay,
                callback_game, switch_inline_query_chosen_chat, copy_text);
    }
}
