package io.github.natanimn.types.forum;


/**
 * This object represents a forum topic.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ForumTopic {
    /**
     * Unique identifier of the forum topic
     */
    public Integer message_thread_id;

    /**
     * Color of the topic icon in RGB format
     */
    public Integer icon_color;

    /**
     * Name of the topic
     */
    public String name;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    public String icon_custom_emoji_id;

}
