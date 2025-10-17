package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen chat, with an optional default inline query.
 * @param query Optional. The default inline query to be inserted in the input field. If left empty, only the bot's username will be inserted
 * @param allowUserChats Optional. True, if private chats with users can be chosen
 * @param allowBotChats Optional. True, if private chats with bots can be chosen
 * @param allowGroupChats Optional. True, if group and supergroup chats can be chosen
 * @param allowChannelChats Optional. True, if channel chats can be chosen
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record SwitchInlineQueryChosenChat(
        String query,
        @SerializedName("allow_user_chats") Boolean allowUserChats,
        @SerializedName("allow_bot_chats") Boolean allowBotChats,
        @SerializedName("allow_group_chats") Boolean allowGroupChats,
        @SerializedName("allow_channel_chats") Boolean allowChannelChats
) implements Serializable {

    /**
     * Creates a new SwitchInlineQueryChosenChat builder
     */
    public static SwitchInlineQueryChosenChatBuilder builder() {
        return new SwitchInlineQueryChosenChatBuilder();
    }

    /**
     * Builder class for SwitchInlineQueryChosenChat
     */
    public static class SwitchInlineQueryChosenChatBuilder {
        private String query;
        private Boolean allowUserChats;
        private Boolean allowBotChats;
        private Boolean allowGroupChats;
        private Boolean allowChannelChats;

        public SwitchInlineQueryChosenChatBuilder query(String query) {
            this.query = query;
            return this;
        }

        public SwitchInlineQueryChosenChatBuilder allowUserChats(boolean allowUserChats) {
            this.allowUserChats = allowUserChats;
            return this;
        }

        public SwitchInlineQueryChosenChatBuilder allowBotChats(boolean allowBotChats) {
            this.allowBotChats = allowBotChats;
            return this;
        }

        public SwitchInlineQueryChosenChatBuilder allowGroupChats(boolean allowGroupChats) {
            this.allowGroupChats = allowGroupChats;
            return this;
        }

        public SwitchInlineQueryChosenChatBuilder allowChannelChats(boolean allowChannelChats) {
            this.allowChannelChats = allowChannelChats;
            return this;
        }

        public SwitchInlineQueryChosenChat build() {
            return new SwitchInlineQueryChosenChat(
                    query,
                    allowUserChats,
                    allowBotChats,
                    allowGroupChats,
                    allowChannelChats
            );
        }
    }
}