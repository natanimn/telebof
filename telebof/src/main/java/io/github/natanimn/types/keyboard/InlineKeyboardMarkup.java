package io.github.natanimn.types.keyboard;


import io.github.natanimn.BotLog;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineKeyboardMarkup implements Markup, Serializable {
    public List<List<InlineKeyboardButton>> inline_keyboard = new ArrayList<>();
    transient private int rowWidth = 3;

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
