package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeclineSuggestedPost class. Returns True on success.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 * @see BotContext#declineSuggestedPost
 */
public class DeclineSuggestedPost extends AbstractBaseRequest<DeclineSuggestedPost, Boolean> {

    /**
     * Required
     * @param chatId Unique identifier for the target direct messages chat
     * @param messageId Identifier of a suggested post message to decline
     * @param api api
     */
    public DeclineSuggestedPost(Object chatId, Integer messageId, Api api) {
        super(chatId, api, "declineSuggestedPost", Boolean.class);
        add("message_id", messageId);
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