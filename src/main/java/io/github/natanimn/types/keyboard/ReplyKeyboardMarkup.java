package io.github.natanimn.types.keyboard;

import io.github.natanimn.BotLog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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


    public ReplyKeyboardMarkup(KeyboardButton[][] keyboards) {
        List.of(keyboards).forEach(k-> keyboard.add(List.of(k)));
    }

    public ReplyKeyboardMarkup(String[][] keyboards) {
        Arrays.stream(keyboards).forEach(row -> {
            List<KeyboardButton> buttons = Arrays.stream(row)
                            .map(KeyboardButton::new)
                            .collect(Collectors.toList());
                    keyboard.add(buttons);
                });
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

    public void add(String... keyboardButton) {
        add(Arrays.stream(keyboardButton)
                .map(KeyboardButton::new)
                .toArray(KeyboardButton[]::new));
    }

    public void add(KeyboardButton... keyboardButtons) {
        if (keyboardButtons.length > MAX_ROW_WIDTH) {
            for (int i = 0; i < keyboardButtons.length; i += rowWidth) {
                int end = Math.min(i + rowWidth, keyboardButtons.length);
                keyboard.add(List.of(Arrays.copyOfRange(keyboardButtons, i, end)));
            }
        } else {
            keyboard.add(List.of(keyboardButtons));
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
