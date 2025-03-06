package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ReplyKeyboardMarkup implements Markup, Serializable {
    private Boolean is_persistent, resize_keyboard, one_time_keyboard, selective;
    private String input_field_placeholder;

    private final List<List<KeyboardButton>> keyboard = new ArrayList<>();
    transient protected final int MAX_ROW_WIDTH = 12;
    transient private int rowWidth = 3;

    public ReplyKeyboardMarkup(){}

    public ReplyKeyboardMarkup(KeyboardButton[] keyboard){
        this(keyboard, Math.min(keyboard.length, 12));
    }

    public ReplyKeyboardMarkup(KeyboardButton[] keyboards, int rowWidth) {
        if (rowWidth > MAX_ROW_WIDTH) {
            BotLog.warn("Currently telegram supports 12 reply keyboard row width at maximum.");
            rowWidth = MAX_ROW_WIDTH;
        }

        List<KeyboardButton> buttons = List.of(keyboards);
        int length = keyboards.length;
        int i = 0;
        while (i < length){
            try{
                keyboard.add(buttons.subList(i, i+rowWidth));
            }catch (IndexOutOfBoundsException e){
                keyboard.add(buttons.subList(i, length));
            }
            i+=rowWidth;
        }

    }

    public ReplyKeyboardMarkup(String[] keyboard){
        this(keyboard, Math.min(keyboard.length, 12));
    }

    public ReplyKeyboardMarkup(String[] keyboards, int rowWidth){
        if (rowWidth > MAX_ROW_WIDTH){
            BotLog.warn("Currently telegram supports 12 reply keyboard row width at maximum.");
            rowWidth = MAX_ROW_WIDTH;
        }

        List<KeyboardButton> keyboardButtons = new ArrayList<>();
        Arrays.stream(keyboards).forEach(v -> keyboardButtons.add(new KeyboardButton(v)));
        int length = keyboards.length;

        int i =0;
        while (i < length){
            try{
                keyboard.add(keyboardButtons.subList(i, i+rowWidth));
            }catch (IndexOutOfBoundsException e){
                keyboard.add(keyboardButtons.subList(i, length));
            }
            i+=rowWidth;
        }
    }

    public ReplyKeyboardMarkup isPersistent(boolean isPersistent) {
        this.is_persistent = isPersistent;
        return this;
    }

    public ReplyKeyboardMarkup resizeKeyboard(boolean resizeKeyboard){
        this.resize_keyboard = resizeKeyboard;
        return this;
    }

    public ReplyKeyboardMarkup oneTimeKeyboard(boolean oneTimeKeyboard){
        this.one_time_keyboard = oneTimeKeyboard;
        return this;
    }

    public ReplyKeyboardMarkup inputFieldPlaceholder(String inputFieldPlaceholder){
        this.input_field_placeholder = inputFieldPlaceholder;
        return this;
    }

    public ReplyKeyboardMarkup selective(boolean selective){
        this.selective = selective;
        return this;
    }

    public void rowWidth(int rowWidth) {
        if (rowWidth > MAX_ROW_WIDTH) {
            BotLog.warn("Currently telegram supports 12 reply keyboard row width at maximum.");
            this.rowWidth = MAX_ROW_WIDTH;
        } else {
            this.rowWidth = rowWidth;
        }
    }

    public void add(String ... keyboardButton) {
        List<KeyboardButton> keyboardButtonList = new ArrayList<>();
        List.of(keyboardButton).forEach(value -> {
            keyboardButtonList.add(new KeyboardButton(value));
        });
        KeyboardButton[] keyboardButtons = keyboardButtonList.toArray(KeyboardButton[]::new);
        add(keyboardButtons);
    }


    public void add(KeyboardButton ... keyboardButton) {
        int length = keyboardButton.length;
        List<KeyboardButton> buttonList = List.of(keyboardButton);
        if (length > MAX_ROW_WIDTH) {
            for (int i=0; i<length; i+=rowWidth){
                try{
                    keyboard.add(buttonList.subList(i, i+rowWidth));
                }catch (IndexOutOfBoundsException e){
                    keyboard.add(buttonList.subList(i, length));
                }
            }

        } else {
            keyboard.add(buttonList);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) object;
        return Objects.equals(is_persistent, markup.is_persistent) &&
                Objects.equals(resize_keyboard, markup.resize_keyboard) &&
                Objects.equals(one_time_keyboard, markup.one_time_keyboard) &&
                Objects.equals(selective, markup.selective) &&
                Objects.equals(input_field_placeholder, markup.input_field_placeholder) &&
                Objects.equals(keyboard, markup.keyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(is_persistent, resize_keyboard, one_time_keyboard, selective, input_field_placeholder, keyboard);
    }
}
