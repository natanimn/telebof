package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.media_and_service.PreparedInlineMessage;

/**
 * @author Natanim
 * @since July 25, 2025
 * @version 0.6
 */
public class SavePreparedInlineMessage extends AbstractBaseRequest<SavePreparedInlineMessage, PreparedInlineMessage> {
    /**
     * @param user_id Unique identifier of the target user that can use the prepared message
     * @param result A {@link InlineQueryResult} object describing the message to be sent
     * @param rs {@link RequestSender} object
     */
    public SavePreparedInlineMessage(long user_id, InlineQueryResult result, RequestSender rs){
        super(rs, "savePreparedInlineMessage");
        add("user_id", user_id);
        add("result", result);
    }

    /**
     * Optional
     * @param allow_user_chats Pass True if the message can be sent to private chats with users
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowUserChats(boolean allow_user_chats){
        return add("allow_user_chats", allow_user_chats);
    }

    /**
     * Optional
     * @param allow_bot_chats Pass True if the message can be sent to private chats with bots.
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowBotChats(boolean allow_bot_chats){
        return add("allow_bot_chats", allow_bot_chats);
    }

    /**
     * Optional
     * @param allow_group_chats Pass True if the message can be sent to group and supergroup chats
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowGroupChats(boolean allow_group_chats){
        return add("allow_group_chats", allow_group_chats);
    }

    /**
     * Optional
     * @param allow_channel_chats Pass True if the message can be sent to channel chats
     * @return {@link SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage allowChannelChats(boolean allow_channel_chats){
        return add("allow_channel_chats", allow_channel_chats);
    }
}
