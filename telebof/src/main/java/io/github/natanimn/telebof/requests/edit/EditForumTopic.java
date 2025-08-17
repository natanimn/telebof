package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * EditForumTopic class. Returns True on sucsess.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#editForumTopic
 */
public class EditForumTopic extends AbstractBaseRequest<EditForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_thread_id message thread id
     * @param api api
     */
    public EditForumTopic(Object chat_id, int message_thread_id, Api api) {
        super(chat_id, api, "editForumTopic", Boolean.class);
        add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param name New topic name, 0-128 characters. If not specified or empty, the current name of the topic will be kept
     * @return {@link EditForumTopic}
     */
    public EditForumTopic name(String name) {
        return add("name", name);

    }

    /**
     * Optional
     * @param icon_custom_emoji_id New unique identifier of the custom emoji shown as the topic icon.
     *                             Use {@link BotContext#getForumTopicIconStickers} to get all allowed custom emoji identifiers.
     *                             Pass an empty string to remove the icon. If not specified, the current icon will be kept
     * @return {@link EditForumTopic}
     */
    public EditForumTopic iconCustomEmojiId(String icon_custom_emoji_id) {
        return add("icon_custom_emoji_id", icon_custom_emoji_id);
    }

}
