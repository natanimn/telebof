package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * HideGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see HideGeneralForumTopic
 */
public class HideGeneralForumTopic extends AbstractBaseRequest<HideGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public HideGeneralForumTopic(Object chatId, Api api) {
        super(chatId, api, "hideGeneralForumTopic", Boolean.class);
    }

}
