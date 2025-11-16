package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a new forum topic created in the chat.
 * @param name Name of the topic
 * @param iconCustomEmojiId Color of the topic icon in RGB format
 * @param iconColor Optional. Unique identifier of the custom emoji shown as the topic icon
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ForumTopicCreated(
        String name,
        @SerializedName("icon_custom_emoji_id") String iconCustomEmojiId,
        @SerializedName("icon_color") Integer iconColor
) {}