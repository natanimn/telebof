package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteMessageReaction class. Returns True on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class DeleteMessageReaction extends AbstractBaseRequest<DeleteMessageReaction, Boolean> {
    public DeleteMessageReaction(Object chatId, int messageId, Api api){
        super(chatId, api, "deleteMessageReaction");
        add("message_id", messageId);
    }

    /**
     * Optional.
     * @param userId Identifier of the user whose reaction will be removed, if the reaction was added by a user
     * @return {@link DeleteMessageReaction}
     */
    public DeleteMessageReaction userId(long userId){
        add("user_id", userId);
        return this;
    }

    /**
     * Optional.
     * @param actorChatId Identifier of the chat whose reaction will be removed, if the reaction was added by a chat
     * @return {@link DeleteMessageReaction}
     */
    public DeleteMessageReaction actorChatId(long actorChatId){
        add("actor_chat_id", actorChatId);
        return this;
    }
}
