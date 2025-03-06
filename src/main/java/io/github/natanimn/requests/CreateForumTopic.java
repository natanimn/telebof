package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ForumTopic;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class CreateForumTopic extends AbstractBaseRequest<CreateForumTopic, ForumTopic> {
    public CreateForumTopic(Object chatId, String name, RequestSender requestSender) {
        super(chatId, requestSender, "createForumTopic", ForumTopic.class);
        add("name", name);
    }

    public CreateForumTopic iconColor(int iconColor) {
        return add("icon_color", iconColor);
    }

    public CreateForumTopic iconCustomEmojiId(String iconCustomEmojiId) {
        return add("icon_custom_emoji_id", iconCustomEmojiId);
    }

}
