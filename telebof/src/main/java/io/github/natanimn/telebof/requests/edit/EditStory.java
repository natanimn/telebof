package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.input.InputStoryContent;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.story.StoryArea;

/**
 * EditStory class. Returns {@link Story} on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#editStory
 */
public class EditStory extends AbstractBaseRequest<EditStory, Story> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param story_id Unique identifier of the story to edit
     * @param content Content of the story
     * @param api api
     */
    public EditStory(String business_connection_id, Integer story_id, InputStoryContent content, Api api) {
        super(api, "editStory", Story.class);
        add("business_connection_id", business_connection_id);
        add("story_id", story_id);
        add("content", content);
    }

    /**
     * Optional
     * @param caption Caption of the story, 0-2048 characters after entities parsing
     * @return {@link EditStory}
     */
    public EditStory caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the story caption
     * @return {@link EditStory}
     */
    public EditStory parseMode(String parse_mode) {
        return add("parse_mode", parse_mode);
    }

    /**
     * Optional
     * @param caption_entities A JSON-serialized list of special entities that appear in the caption
     * @return {@link EditStory}
     */
    public EditStory captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", caption_entities);
    }

    /**
     * Optional
     * @param areas A JSON-serialized list of clickable areas to be shown on the story
     * @return {@link EditStory}
     */
    public EditStory areas(StoryArea[] areas) {
        return add("areas", areas);
    }
}