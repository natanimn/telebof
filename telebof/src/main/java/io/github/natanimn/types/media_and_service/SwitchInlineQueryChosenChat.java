package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class SwitchInlineQueryChosenChat implements Serializable {
    private String query;
    private Boolean allow_user_chats, allow_bot_chats, allow_group_chats, allow_channel_chats;

    public SwitchInlineQueryChosenChat query(String query){
        this.query = query;
        return this;
    }

    public SwitchInlineQueryChosenChat allowUserChats(boolean allowUserChats){
        this.allow_user_chats = allowUserChats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowBotChats(boolean allowBotChats){
        this.allow_bot_chats = allowBotChats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowGroupChats(boolean allowGroupChats){
        this.allow_group_chats = allowGroupChats;
        return this;
    }

    public SwitchInlineQueryChosenChat allowChannelChats(boolean allowChannelChats){
        this.allow_channel_chats = allowChannelChats;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SwitchInlineQueryChosenChat that = (SwitchInlineQueryChosenChat) object;
        return Objects.equals(query, that.query) && Objects.equals(allow_user_chats, that.allow_user_chats) &&
                Objects.equals(allow_bot_chats, that.allow_bot_chats) &&
                Objects.equals(allow_group_chats, that.allow_group_chats) &&
                Objects.equals(allow_channel_chats, that.allow_channel_chats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, allow_user_chats, allow_bot_chats, allow_group_chats, allow_channel_chats);
    }
}
