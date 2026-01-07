package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.media_and_service.PreparedInlineMessage;

/**
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */
public class SavePreparedInlineMessage extends AbstractBaseRequest<SavePreparedInlineMessage, PreparedInlineMessage> {
    /**
     * @param userId Unique identifier of the target user that can use the prepared message
     * @param result A {@link InlineQueryResult} object describing the message to be sent
     * @param rs {@link Api} object
     */
    public SavePreparedInlineMessage(long userId, InlineQueryResult result, Api rs){
        super(rs, "savePreparedInlineMessage");
        add("user_id", userId);
        add("result", result);
    }

    /**
     * Optional
     * @param allowUserChats Pass True if the message can be sent to private chats with users
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowUserChats(boolean allowUserChats){
        return add("allow_user_chats", allowUserChats);
    }

    /**
     * Optional
     * @param allowBotChats Pass True if the message can be sent to private chats with bots.
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowBotChats(boolean allowBotChats){
        return add("allow_bot_chats", allowBotChats);
    }

    /**
     * Optional
     * @param allowGroupChats Pass True if the message can be sent to group and supergroup chats
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowGroupChats(boolean allowGroupChats){
        return add("allow_group_chats", allowGroupChats);
    }

    /**
     * Optional
     * @param allowChannelChats Pass True if the message can be sent to channel chats
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowChannelChats(boolean allowChannelChats){
        return add("allow_channel_chats", allowChannelChats);
    }
}
