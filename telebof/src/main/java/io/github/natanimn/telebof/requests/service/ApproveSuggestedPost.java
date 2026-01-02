package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ApproveSuggestedPost class. Returns True on success.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 * @see BotContext#approveSuggestedPost
 */
public class ApproveSuggestedPost extends AbstractBaseRequest<ApproveSuggestedPost, Boolean> {

    /**
     * Required
     * @param chatId Unique identifier for the target direct messages chat
     * @param messageId Identifier of a suggested post message to approve
     * @param api api
     */
    public ApproveSuggestedPost(Object chatId, Integer messageId, Api api) {
        super(chatId, api, "approveSuggestedPost", Boolean.class);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param sendDate Point in time (Unix timestamp) when the post is expected to be published;
     *                  omit if the date has already been specified when the suggested post was created.
     *                  If specified, then the date must be not more than 2678400 seconds (30 days) in the future
     * @return {@link ApproveSuggestedPost}
     */
    public ApproveSuggestedPost sendDate(Integer sendDate) {
        return add("send_date", sendDate);
    }
}