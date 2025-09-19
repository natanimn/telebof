package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a forum topic.
 * @param messageThreadId Unique identifier of the forum topic
 * @param iconColor Color of the topic icon in RGB format
 * @param name Name of the topic
 * @param iconCustomEmojiId Optional. Unique identifier of the custom emoji shown as the topic icon
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ForumTopic(
        @SerializedName("message_thread_id") Integer messageThreadId,
        @SerializedName("icon_color") Integer iconColor,
        String name,
        @SerializedName("icon_custom_emoji_id") String iconCustomEmojiId
) {}