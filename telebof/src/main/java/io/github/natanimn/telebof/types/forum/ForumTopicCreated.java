package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a new forum topic created in the chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ForumTopicCreated {
    /**
     * Name of the topic
     */
    private String name;

    /**
     * Color of the topic icon in RGB format
     */
    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    @SerializedName("icon_color")
    private Integer iconColor;

    public String getName() {
        return name;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public Integer getIconColor() {
        return iconColor;
    }
}