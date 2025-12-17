package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteStory class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#deleteStory
 */
public class DeleteStory extends AbstractBaseRequest<DeleteStory, Boolean> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param storyId Unique identifier of the story to delete
     * @param api api
     */
    public DeleteStory(String businessConnectionId, int storyId, Api api) {
        super(api, "deleteStory", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("story_id", storyId);
    }
}