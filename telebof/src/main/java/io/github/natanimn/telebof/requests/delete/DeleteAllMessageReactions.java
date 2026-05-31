package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteAllMessageReactions class. Returns True on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class DeleteAllMessageReactions extends AbstractBaseRequest<DeleteAllMessageReactions, Boolean> {
    public DeleteAllMessageReactions(Object chatId, Api api){
        super(chatId, api, "deleteAllMessageReactions");
    }

    /**
     * Optional.
     * @param userId Identifier of the user whose reaction will be removed, if the reaction was added by a user
     * @return {@link DeleteAllMessageReactions}
     */
    public DeleteAllMessageReactions userId(long userId){
        add("user_id", userId);
        return this;
    }

    /**
     * Optional.
     * @param actorChatId Identifier of the chat whose reaction will be removed, if the reaction was added by a chat
     * @return {@link DeleteAllMessageReactions}
     */
    public DeleteAllMessageReactions actorChatId(long actorChatId){
        add("actor_chat_id", actorChatId);
        return this;
    }
}
