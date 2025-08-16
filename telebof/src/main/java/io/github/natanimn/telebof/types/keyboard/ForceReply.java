package io.github.natanimn.telebof.types.keyboard;

import java.util.Objects;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the user (act as if the user has selected the bot's message and tapped 'Reply').
 * This can be extremely useful if you want to create user-friendly step-by-step interfaces without having to sacrifice privacy mode. Not supported in channels and for messages sent on behalf of a Telegram Business account.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ForceReply implements Markup {
    /**
     * Shows reply interface to the user, as if they manually selected the bot's message and tapped 'Reply'
     */
    public final boolean force_reply;
    public Boolean selective;
    public String input_field_placeholder;

    public ForceReply() {
        this.force_reply = true;
    }

    /**
     * Optional.
     * @param input_field_placeholder The placeholder to be shown in the input field when the reply is active; 1-64 characters
     * @return {@link ForceReply}
     */
    public ForceReply inputFieldPlaceholder(String input_field_placeholder){
        this.input_field_placeholder = input_field_placeholder;
        return this;
    }

    /**
     * Optional.
     * @param selective Use this parameter if you want to force reply from specific users only.
     *                  Targets:<br>
     *                      1) users that are @mentioned in the text of the Message object; <br>
     *                      2) if the bot's message is a reply to a message in the same chat and forum topic, sender of the original message.
     * @return {@link ForceReply}
     */
    public ForceReply selective(boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForceReply that = (ForceReply) object;
        return force_reply == that.force_reply &&
                Objects.equals(selective, that.selective) &&
                Objects.equals(input_field_placeholder, that.input_field_placeholder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force_reply, selective, input_field_placeholder);
    }
}
