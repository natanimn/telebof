package io.github.natanimn.types.keyboard;


/**
 * Upon receiving a message with this object, Telegram clients will remove the current custom keyboard and display the default letter-keyboard.
 * By default, custom keyboards are displayed until a new keyboard is sent by a bot.
 * An exception is made for one-time keyboards that are hidden immediately after the user presses a button (see {@link ReplyKeyboardMarkup}).
 * Not supported in channels and for messages sent on behalf of a Telegram Business account.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ReplyKeyboardRemove implements Markup {
    /**
     * Requests clients to remove the custom keyboard (user will not be able to summon this keyboard;
     * if you want to hide the keyboard from sight but keep it accessible, use {@link ReplyKeyboardMarkup#oneTimeKeyboard(boolean)} in {@link ReplyKeyboardMarkup})
     */
    private final boolean remove_keyboard;
    private boolean selective;


    public ReplyKeyboardRemove() {
        this.remove_keyboard = true;
        this.selective = false;
    }

    /**
     * Optional
     * @param selective Use this parameter if you want to remove the keyboard for specific users only.
     *                  Targets: 1) users that are @mentioned in the text of the Message object;<br>
     *                  2) if the bot's message is a reply to a message in the same chat and forum topic, sender of the original message.
     * <br>
     * Example: A user votes in a poll, bot returns confirmation message in reply to the vote and removes the keyboard for that user, while still showing the keyboard with poll options to users who haven't voted yet.
     * @return {@link ReplyKeyboardRemove}
     */
    public ReplyKeyboardRemove selective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
