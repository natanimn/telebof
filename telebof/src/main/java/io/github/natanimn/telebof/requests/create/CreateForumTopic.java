package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.forum.ForumTopic;

/**
 * CreateForumTopic class. Returns {@link ForumTopic} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#createForumTopic
 */
public class CreateForumTopic extends AbstractBaseRequest<CreateForumTopic, ForumTopic> {

    /**
     * Required
     * @param chatId chat id
     * @param name name
     * @param api api
     */
    public CreateForumTopic(Object chatId, String name, Api api) {
        super(chatId, api, "createForumTopic", ForumTopic.class);
        add("name", name);
    }

    /**
     * Optional
     * @param iconColor Color of the topic icon in RGB format.
     *                   Currently, must be one of 7322096 (0x6FB9F0), 16766590 (0xFFD67E), 13338331 (0xCB86DB), 9367192 (0x8EEE98), 16749490 (0xFF93B2), or 16478047 (0xFB6F5F)
     * @return {@link CreateForumTopic}
     */
    public CreateForumTopic iconColor(int iconColor) {
        return add("icon_color", iconColor);
    }

    /**
     * Optional
     * @param iconCustomEmojiId Unique identifier of the custom emoji shown as the topic icon.
     *                             Use {@link BotContext#getForumTopicIconStickers} to get all allowed custom emoji identifiers.
     * @return {@link CreateForumTopic}
     */
    public CreateForumTopic iconCustomEmojiId(String iconCustomEmojiId) {
        return add("icon_custom_emoji_id", iconCustomEmojiId);
    }

}
