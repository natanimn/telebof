package io.github.natanimn.telebof.types.forum;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a service message about a new forum topic created in the chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

    /**
     * Optional. True, if the name of the topic wasn't specified explicitly by its creator and likely needs to be changed by the bot
     */
    @SerializedName("is_name_implicit")
    private Boolean isNameImplicit;

}