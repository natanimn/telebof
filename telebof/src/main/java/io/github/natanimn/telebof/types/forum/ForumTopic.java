package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a forum topic.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}