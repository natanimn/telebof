package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * HideGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see HideGeneralForumTopic
 */
public class HideGeneralForumTopic extends AbstractBaseRequest<HideGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public HideGeneralForumTopic(Object chat_id, Api api) {
        super(chat_id, api, "hideGeneralForumTopic", Boolean.class);
    }

}
