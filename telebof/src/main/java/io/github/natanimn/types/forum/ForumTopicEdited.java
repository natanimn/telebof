package io.github.natanimn.types.forum;

/**
 * This object represents a service message about an edited forum topic.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ForumTopicEdited {
    /**
     * Optional. New name of the topic, if it was edited
     */
    public String name;

    /**
     * Optional. New identifier of the custom emoji shown as the topic icon, if it was edited; an empty string if the icon was removed
     */
    public String icon_custom_emoji_id;

}
