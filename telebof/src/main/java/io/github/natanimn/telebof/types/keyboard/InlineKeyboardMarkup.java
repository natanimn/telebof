package io.github.natanimn.telebof.types.keyboard;

import io.github.natanimn.telebof.BotLog;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class InlineKeyboardMarkup implements Markup {
    /**
     * Array of button rows, each represented by an Array of {@link InlineKeyboardButton} objects
     */
    private List<List<InlineKeyboardButton>> inline_keyboard;

    transient private int rowWidth = 3;

    public InlineKeyboardMarkup(){
        this.inline_keyboard = new ArrayList<>();
    }

    public InlineKeyboardMarkup(int rowWidth){
        this.rowWidth        = rowWidth;
        this.inline_keyboard = new ArrayList<>();
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[][] keyboard) {
        this.inline_keyboard = new ArrayList<>();
        
        Arrays.stream(keyboard)
                .map(List::of)
                .forEach(inline_keyboard::add);
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons, int rowWidth) {
        this.inline_keyboard = new ArrayList<>();

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

    public List<List<InlineKeyboardButton>> inlineKeyboard() {
        return inline_keyboard;
    }

    public void setRowWidth(int rowWidth) {
        this.rowWidth = rowWidth;
    }
}
