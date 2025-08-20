package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteStory class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#deleteStory
 */
public class DeleteStory extends AbstractBaseRequest<DeleteStory, Boolean> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param story_id Unique identifier of the story to delete
     * @param api api
     */
    public DeleteStory(String business_connection_id, Integer story_id, Api api) {
        super(api, "deleteStory", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("story_id", story_id);
    }
}