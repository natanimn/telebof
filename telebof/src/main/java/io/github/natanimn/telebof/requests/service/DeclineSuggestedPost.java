package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeclineSuggestedPost class. Returns True on success.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 * @see BotContext#declineSuggestedPost
 */
public class DeclineSuggestedPost extends AbstractBaseRequest<DeclineSuggestedPost, Boolean> {

    /**
     * Required
     * @param chat_id Unique identifier for the target direct messages chat
     * @param message_id Identifier of a suggested post message to decline
     * @param api api
     */
    public DeclineSuggestedPost(Object chat_id, Integer message_id, Api api) {
        super(chat_id, api, "declineSuggestedPost", Boolean.class);
        add("message_id", message_id);
    }

    /**
     * Optional
     * @param comment Comment for the creator of the suggested post; 0-128 characters
     * @return {@link DeclineSuggestedPost}
     */
    public DeclineSuggestedPost comment(String comment) {
        return add("comment", comment);
    }
}