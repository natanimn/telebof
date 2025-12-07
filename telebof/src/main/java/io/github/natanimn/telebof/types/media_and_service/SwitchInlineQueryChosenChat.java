package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen chat, with an optional default inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SwitchInlineQueryChosenChat implements Serializable {
    /**
     * Optional. The default inline query to be inserted in the input field. If left empty, only the bot's username will be inserted
     */
    private String query;

    /**
     * Optional. True, if private chats with users can be chosen
     */
    @SerializedName("allow_user_chats")
    private Boolean allowUserChats;

    /**
     * Optional. True, if private chats with bots can be chosen
     */
    @SerializedName("allow_bot_chats")
    private Boolean allowBotChats;

    /**
     * Optional. True, if group and supergroup chats can be chosen
     */
    @SerializedName("allow_group_chats")
    private Boolean allowGroupChats;

    /**
     * Optional. True, if channel chats can be chosen
     */
    @SerializedName("allow_channel_chats")
    private Boolean allowChannelChats;

    public String getQuery() {
        return query;
    }

    public SwitchInlineQueryChosenChat setQuery(String query) {
        this.query = query;
        return this;
    }

    public Boolean getAllowUserChats() {
        return allowUserChats;
    }

    public SwitchInlineQueryChosenChat setAllowUserChats(Boolean allowUserChats) {
        this.allowUserChats = allowUserChats;
        return this;
    }

    public Boolean getAllowBotChats() {
        return allowBotChats;
    }

    public SwitchInlineQueryChosenChat setAllowBotChats(Boolean allowBotChats) {
        this.allowBotChats = allowBotChats;
        return this;
    }

    public Boolean getAllowGroupChats() {
        return allowGroupChats;
    }

    public SwitchInlineQueryChosenChat setAllowGroupChats(Boolean allowGroupChats) {
        this.allowGroupChats = allowGroupChats;
        return this;
    }

    public Boolean getAllowChannelChats() {
        return allowChannelChats;
    }

    public SwitchInlineQueryChosenChat setAllowChannelChats(Boolean allowChannelChats) {
        this.allowChannelChats = allowChannelChats;
        return this;
    }
}