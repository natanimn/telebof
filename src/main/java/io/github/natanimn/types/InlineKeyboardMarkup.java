package io.github.natanimn.types;


import io.github.natanimn.BotLog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineKeyboardMarkup implements Markup, Serializable {
    private final List<List<InlineKeyboardButton>> inline_keyboard = new ArrayList<>();
    transient public String text, url, callback_data;
    transient public LoginUrl login_url;
    transient public WebAppInfo web_app;
    transient public String switch_inline_query, switch_inline_query_current_chat;
    transient public CallbackGame callback_game;
    transient public Boolean pay;
    transient private int rowWidth = 3;

    public InlineKeyboardMarkup(){}

    public InlineKeyboardMarkup(InlineKeyboardButton[][] keyboard) {
        Arrays.stream(keyboard)
                .map(List::of)
                .forEach(inline_keyboard::add);
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons, int rowWidth) {
        this.rowWidth = Math.min(rowWidth, 8);
        if (rowWidth > 8) {
            BotLog.warn("Telegram supports maximum 8 buttons per row");
        }
        addButtons(buttons);
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons) {
        this(buttons, Math.min(buttons.length, 8));
    }

    public void addKeyboard(InlineKeyboardButton... buttons) {
        addButtons(buttons);
    }

    private void addButtons(InlineKeyboardButton[] buttons) {
        for (int i = 0; i < buttons.length; i += rowWidth) {
            int end = Math.min(i + rowWidth, buttons.length);
            inline_keyboard.add(List.of(Arrays.copyOfRange(buttons, i, end)));
        }
    }

    public void rowWidth(int rowWidth) {
        this.rowWidth = rowWidth;
    }


}
