package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a forum topic.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ForumTopic {
    /**
     * Unique identifier of the forum topic
     */
    @SerializedName("message_thread_id")
    private Integer messageThreadId;

    /**
     * Color of the topic icon in RGB format
     */
    @SerializedName("icon_color")
    private Integer iconColor;

    /**
     * Name of the topic
     */
    private String name;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    /**
     * Optional. True, if the name of the topic wasn't specified explicitly by its creator and likely needs to be changed by the bot
     */
    @SerializedName("is_name_implicit")
    private Boolean isNameImplicit;

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public Integer getIconColor() {
        return iconColor;
    }

    public String getName() {
        return name;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public Boolean getIsNameImplicit() {
        return isNameImplicit;
    }
}