package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen chat, with an optional default inline query.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
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

}