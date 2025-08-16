package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.forum.ForumTopic;

/**
 * CreateForumTopic class. Returns {@link ForumTopic} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#createForumTopic
 */
public class CreateForumTopic extends AbstractBaseRequest<CreateForumTopic, ForumTopic> {

    /**
     * Required
     * @param chat_id chat id
     * @param name name
     * @param requestSender request sender
     */
    public CreateForumTopic(Object chat_id, String name, RequestSender requestSender) {
        super(chat_id, requestSender, "createForumTopic", ForumTopic.class);
        add("name", name);
    }

    /**
     * Optional
     * @param icon_color Color of the topic icon in RGB format.
     *                   Currently, must be one of 7322096 (0x6FB9F0), 16766590 (0xFFD67E), 13338331 (0xCB86DB), 9367192 (0x8EEE98), 16749490 (0xFF93B2), or 16478047 (0xFB6F5F)
     * @return {@link CreateForumTopic}
     */
    public CreateForumTopic iconColor(int icon_color) {
        return add("icon_color", icon_color);
    }

    /**
     * Optional
     * @param icon_custom_emoji_id Unique identifier of the custom emoji shown as the topic icon.
     *                             Use {@link BotContext#getForumTopicIconStickers} to get all allowed custom emoji identifiers.
     * @return {@link CreateForumTopic}
     */
    public CreateForumTopic iconCustomEmojiId(String icon_custom_emoji_id) {
        return add("icon_custom_emoji_id", icon_custom_emoji_id);
    }

}
