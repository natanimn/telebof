package io.github.natanimn.types;


import io.github.natanimn.BotLog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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

    public InlineKeyboardMarkup(InlineKeyboardButton[][]  keyboard) {
        List<InlineKeyboardButton[]> lists = Arrays.stream(keyboard).toList();
        lists.forEach(value -> {
            inline_keyboard.add(List.of(value));
        });
    }


    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons, int rowWidth){
        if (rowWidth > 8) {
            BotLog.warn("Currently telegram supports 8 inline keyboard rowWidth at maximum");
            rowWidth = 8;
        }

        List<InlineKeyboardButton> keyboard = List.of(buttons);
        for (int i =0; i < keyboard.size(); i+=rowWidth) {
            try {
                inline_keyboard.add(keyboard.subList(i, i + rowWidth));
            } catch (IndexOutOfBoundsException exception) {
                inline_keyboard.add(keyboard.subList(i, keyboard.size()));
            }
        }
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons){
        this(buttons, Math.min(buttons.length, 8));
    }



    public void addKeyboard(InlineKeyboardButton... buttons){
        int length = buttons.length;
        List<InlineKeyboardButton> buttonList = List.of(buttons);
        if (length > 8){
            for (int i =0; i < length; i+=rowWidth){
                try {
                    inline_keyboard.add(buttonList.subList(i, i + rowWidth));
                } catch (IndexOutOfBoundsException exception) {
                    inline_keyboard.add(buttonList.subList(i, length));
                }
            }

        } else {
            inline_keyboard.add(buttonList);
        }
    }

    public void rowWidth(int rowWidth) {
        this.rowWidth = rowWidth;
    }


}
