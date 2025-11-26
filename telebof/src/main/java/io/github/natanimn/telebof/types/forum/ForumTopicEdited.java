package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about an edited forum topic.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ForumTopicEdited {
    /**
     * Optional. New name of the topic, if it was edited
     */
    private String name;

    /**
     * Optional. New identifier of the custom emoji shown as the topic icon, if it was edited; an empty string if the icon was removed
     */
    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    public String getName() {
        return name;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }
}