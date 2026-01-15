package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the user (act as if the user has selected the bot's message and tapped 'Reply').
 * This can be extremely useful if you want to create user-friendly step-by-step interfaces without having to sacrifice privacy mode. Not supported in channels and for messages sent on behalf of a Telegram Business account.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ForceReply implements Markup {
    /**
     * Shows reply interface to the user, as if they manually selected the bot's message and tapped 'Reply'
     */
    @SerializedName("force_reply")
    private final boolean forceReply;
    private Boolean selective;

    @SerializedName("input_field_placeholder")
    private String inputFieldPlaceholder;

    public ForceReply() {
        this.forceReply = true;
    }

    /**
     * Optional.
     * @param inputFieldPlaceholder The placeholder to be shown in the input field when the reply is active; 1-64 characters
     * @return {@link ForceReply}
     */
    public ForceReply setInputFieldPlaceholder(String inputFieldPlaceholder){
        this.inputFieldPlaceholder = inputFieldPlaceholder;
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
    public ForceReply setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
