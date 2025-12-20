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
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#editStory
 */
public class EditStory extends AbstractBaseRequest<EditStory, Story> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param storyId Unique identifier of the story to edit
     * @param content Content of the story
     * @param api api
     */
    public EditStory(String businessConnectionId, int storyId, InputStoryContent content, Api api) {
        super(api, "editStory", Story.class);
        add("business_connection_id", businessConnectionId);
        add("story_id", storyId);
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
     * @param parseMode Mode for parsing entities in the story caption
     * @return {@link EditStory}
     */
    public EditStory parseMode(String parseMode) {
        return add("parse_mode", parseMode);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption
     * @return {@link EditStory}
     */
    public EditStory captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
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