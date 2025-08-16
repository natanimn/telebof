package io.github.natanimn.telebof.types.media_and_service;

import java.io.Serializable;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen chat, with an optional default inline query.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class SwitchInlineQueryChosenChat implements Serializable {

    /**
     * Optional. The default inline query to be inserted in the input field. If left empty, only the bot's username will be inserted
     */
    public String query;

    /**
     * Optional. True, if private chats with users can be chosen
     */
    public Boolean allow_user_chats;

    /**
     * Optional. True, if private chats with bots can be chosen
     */
    public Boolean allow_bot_chats;

    /**
     * Optional. True, if group and supergroup chats can be chosen
     */
    public Boolean allow_group_chats;

    /**
     * Optional. True, if channel chats can be chosen
     */
    public Boolean allow_channel_chats;

    public SwitchInlineQueryChosenChat query(String query){
        this.query = query;
        return this;
    }

    public SwitchInlineQueryChosenChat allowUserChats(boolean allow_user_chats){
        this.allow_user_chats = allow_user_chats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowBotChats(boolean allow_bot_chats){
        this.allow_bot_chats = allow_bot_chats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowGroupChats(boolean allow_group_chats){
        this.allow_group_chats = allow_group_chats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowChannelChats(boolean allow_channel_chats){
        this.allow_channel_chats = allow_channel_chats;
        return this;
    }
}
