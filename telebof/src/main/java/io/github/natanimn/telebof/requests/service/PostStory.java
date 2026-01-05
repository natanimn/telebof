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
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#postStory
 */
public class PostStory extends AbstractBaseRequest<PostStory, Story> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param content Content of the story
     * @param activePeriod Period after which the story is moved to the archive, in seconds
     * @param api api
     */
    public PostStory(String businessConnectionId, InputStoryContent content, Integer activePeriod, Api api) {
        super(api, "postStory", Story.class);
        add("business_connection_id", businessConnectionId);
        add("content", content);
        add("active_period", activePeriod);
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
     * @param parseMode Mode for parsing entities in the story caption
     * @return {@link PostStory}
     */
    public PostStory parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of {@link #parseMode}
     * @return {@link PostStory}
     */
    public PostStory captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
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
     * @param postToChatPage Pass True to keep the story accessible after it expires
     * @return {@link PostStory}
     */
    public PostStory postToChatPage(boolean postToChatPage) {
        return add("post_to_chat_page", postToChatPage);
    }

    /**
     * Optional
     * @param protectContent Pass True if the content of the story must be protected from forwarding and screenshotting
     * @return {@link PostStory}
     */
    public PostStory protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }
}