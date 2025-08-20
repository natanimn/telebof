package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.input.InputStoryContent;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.story.StoryArea;

/**
 * PostStory class. Returns {@link Story} on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#postStory
 */
public class PostStory extends AbstractBaseRequest<PostStory, Story> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param content Content of the story
     * @param active_period Period after which the story is moved to the archive, in seconds
     * @param api api
     */
    public PostStory(String business_connection_id, InputStoryContent content, Integer active_period, Api api) {
        super(api, "postStory", Story.class);
        add("business_connection_id", business_connection_id);
        add("content", content);
        add("active_period", active_period);
    }

    /**
     * Optional
     * @param caption Caption of the story, 0-2048 characters after entities parsing
     * @return {@link PostStory}
     */
    public PostStory caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the story caption
     * @return {@link PostStory}
     */
    public PostStory parseMode(ParseMode parse_mode) {
        return add("parse_mode", parse_mode);
    }

    /**
     * Optional
     * @param caption_entities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of {@link #parseMmode}
     * @return {@link PostStory}
     */
    public PostStory captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", caption_entities);
    }

    /**
     * Optional
     * @param areas A JSON-serialized list of clickable areas to be shown on the story
     * @return {@link PostStory}
     */
    public PostStory areas(StoryArea[] areas) {
        return add("areas", areas);
    }

    /**
     * Optional
     * @param post_to_chat_page Pass True to keep the story accessible after it expires
     * @return {@link PostStory}
     */
    public PostStory postToChatPage(boolean post_to_chat_page) {
        return add("post_to_chat_page", post_to_chat_page);
    }

    /**
     * Optional
     * @param protect_content Pass True if the content of the story must be protected from forwarding and screenshotting
     * @return {@link PostStory}
     */
    public PostStory protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }
}