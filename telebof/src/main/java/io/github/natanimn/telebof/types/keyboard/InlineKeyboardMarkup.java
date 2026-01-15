package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.BotLog;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineKeyboardMarkup implements Markup {
    /**
     * Array of button rows, each represented by an Array of {@link InlineKeyboardButton} objects
     */
    @SerializedName("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    transient private int rowWidth = 3;

    public InlineKeyboardMarkup(){
        this.inlineKeyboard = new ArrayList<>();
    }

    public InlineKeyboardMarkup(int rowWidth){
        this.rowWidth        = rowWidth;
        this.inlineKeyboard = new ArrayList<>();
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[][] keyboard) {
        this.inlineKeyboard = new ArrayList<>();
        
        Arrays.stream(keyboard)
                .map(List::of)
                .forEach(inlineKeyboard::add);
    }

    public InlineKeyboardMarkup(InlineKeyboardButton[] buttons, int rowWidth) {
        this.inlineKeyboard = new ArrayList<>();

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
            inlineKeyboard.add(List.of(Arrays.copyOfRange(buttons, i, end)));
        }
    }

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setRowWidth(int rowWidth) {
        this.rowWidth = rowWidth;
    }
}
