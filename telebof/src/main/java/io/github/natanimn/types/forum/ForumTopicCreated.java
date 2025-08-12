package io.github.natanimn.types.forum;


/**
 * This object represents a service message about a new forum topic created in the chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ForumTopicCreated {
    /**
     * Name of the topic
     */
    public String name;

    /**
     * Color of the topic icon in RGB format
     */
    public String icon_custom_emoji_id;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    public Integer icon_color;

}
