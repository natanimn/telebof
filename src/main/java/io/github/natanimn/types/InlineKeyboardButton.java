package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineKeyboardButton implements Serializable {
    public String text, url, callback_data, switch_inline_query_current_chat;
    public WebAppInfo wep_app;
    public LoginUrl login_url;
    public Boolean pay;
    public CallbackGame callback_game;
    public SwitchInlineQueryChosenChat switch_inline_query_chosen_chat;

    public InlineKeyboardButton(String text) {
        this.text = text;
    }

    public InlineKeyboardButton url(String url) {
        this.url = url;
        return this;
    }

    public InlineKeyboardButton callbackData(String callbackData) {
        this.callback_data = callbackData;
        return this;
    }

    public InlineKeyboardButton webApp(WebAppInfo webApp) {
        this.wep_app = webApp;
        return this;
    }

    public InlineKeyboardButton loginUrl(LoginUrl loginUrl) {
        this.login_url = loginUrl;
        return this;
    }

    public InlineKeyboardButton switchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switch_inline_query_current_chat = switchInlineQueryCurrentChat;
        return this;
    }

    public InlineKeyboardButton callbackGame(CallbackGame callbackGame) {
        this.callback_game = callbackGame;
        return this;
    }

    public InlineKeyboardButton pay(boolean pay) {
        this.pay = pay;
        return this;
    }

    public InlineKeyboardButton switchInlineQueryChosenChat(SwitchInlineQueryChosenChat chosenChat){
        this.switch_inline_query_chosen_chat = chosenChat;
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
                Objects.equals(switch_inline_query_chosen_chat, button.switch_inline_query_chosen_chat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url, callback_data, switch_inline_query_current_chat, wep_app, login_url, pay,
                callback_game, switch_inline_query_chosen_chat);
    }
}
