package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.story.Story;

/**
 * RepostStory class. Returns {@link Story} on success.
 * @author Natanim
 * @since 1.3.0
 * @version 1.3.0
 */
public class RepostStory extends AbstractBaseRequest<RepostStory, Story> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param fromChatId from chat id
     * @param fromStoryId from story id
     * @param activePeriod active period
     * @param api api
     */
    public RepostStory(String businessConnectionId, long fromChatId, int fromStoryId, int activePeriod, Api api){
        super(api, "repostStory", Story.class);
        add("business_connection_id", businessConnectionId);
        add("from_chat_id", fromChatId);
        add("from_story_id", fromStoryId);
        add("active_period", activePeriod);
    }

    /**
     * Optional
     * @param postToChatPage Pass True to keep the story accessible after it expires
     * @return {@link RepostStory}
     */
    public RepostStory postToChatPage(Boolean postToChatPage){
        return add("post_to_chat_page", postToChatPage);
    }

    /**
     * Optional
     * @param protectContent Pass True if the content of the story must be protected from forwarding and screenshotting
     * @return {@link RepostStory}
     */
    public RepostStory protectContent(Boolean protectContent){
        return add("protect_content", protectContent);
    }

}
