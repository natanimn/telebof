package io.github.natanimn.types.keyboard;

import io.github.natanimn.BotLog;
import io.github.natanimn.types.updates.Message;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * This object represents a <a href="https://core.telegram.org/bots/features#keyboards">custom keyboard</a> with reply options
 * <br>
 * Not supported in channels and for messages sent on behalf of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see <a href="https://core.telegram.org/bots/features#keyboards">Introduction to bots for details and examples</a>
 */
public class ReplyKeyboardMarkup implements Markup, Serializable {
    private Boolean is_persistent, resize_keyboard, one_time_keyboard, selective;
    private String input_field_placeholder;

    private List<List<KeyboardButton>> keyboard;
    transient protected final int MAX_ROW_WIDTH = 12;
    transient private int rowWidth = 3;

    public ReplyKeyboardMarkup(){
        this.keyboard = new ArrayList<>();
    }

    /**
     * Required
     * @param keyboards Array of button rows, each represented by an Array of {@link KeyboardButton} objects
     */
    public ReplyKeyboardMarkup(KeyboardButton[][] keyboards) {
        this.keyboard = new ArrayList<>();
        List.of(keyboards).forEach(k-> keyboard.add(List.of(k)));
    }

    /**
     * Required
     * @param keyboards Array of button rows, each represented by an Array of String
     */
    public ReplyKeyboardMarkup(String[][] keyboards) {
        this.keyboard = new ArrayList<>();
        Arrays.stream(keyboards).forEach(row -> {
            List<KeyboardButton> buttons = Arrays.stream(row)
                            .map(KeyboardButton::new)
                            .collect(Collectors.toList());
                    keyboard.add(buttons);
                });
    }

    /**
     * Optional
     * @param is_persistent Requests clients to always show the keyboard when the regular keyboard is hidden.
     *                      Defaults to false, in which case the custom keyboard can be hidden and opened with a keyboard icon.
     * @return {@link ReplyKeyboardMarkup}
     */
    public ReplyKeyboardMarkup isPersistent(boolean is_persistent) {
        this.is_persistent = is_persistent;
        return this;
    }

    /**
     * Optional
     * @param resize_keyboard Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard smaller if there are just two rows of buttons).
     *                        Defaults to false, in which case the custom keyboard is always of the same height as the app's standard keyboard.
     * @return {@link ReplyKeyboardMarkup}
     */
    public ReplyKeyboardMarkup resizeKeyboard(boolean resize_keyboard){
        this.resize_keyboard = resize_keyboard;
        return this;
    }

    /**
     * Optional
     * @param one_time_keyboard Requests clients to hide the keyboard as soon as it's been used.
     *                          The keyboard will still be available, but clients will automatically display the usual
     *                          letter-keyboard in the chat - the user can press a special button in the input field to see the custom keyboard again. Defaults to false.
     * @return {@link ReplyKeyboardMarkup}
     */
    public ReplyKeyboardMarkup oneTimeKeyboard(boolean one_time_keyboard){
        this.one_time_keyboard = one_time_keyboard;
        return this;
    }

    /**
     * Optional
     * @param input_field_placeholder The placeholder to be shown in the input field when the keyboard is active; 1-64 characters
     * @return {@link ReplyKeyboardMarkup}
     */
    public ReplyKeyboardMarkup inputFieldPlaceholder(String input_field_placeholder){
        this.input_field_placeholder = input_field_placeholder;
        return this;
    }

    /**
     * Optional
     * @param selective Use this parameter if you want to show the keyboard to specific users only.
     *                  Targets: 1) users that are @mentioned in the text of the {@link Message} object; <br>
     *                  2) if the bot's message is a reply to a message in the same chat and forum topic, sender of the original message.
     *<br>
     * Example: A user requests to change the bot's language, bot replies to the request with a keyboard to select the new language. Other users in the group don't see the keyboard.
     * @return {@link ReplyKeyboardMarkup}
     */
    public ReplyKeyboardMarkup selective(boolean selective){
        this.selective = selective;
        return this;
    }

    /**
     * Optional
     * @param rowWidth the number of keyboards on a row at max
     */
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
}
