package io.github.natanimn.types.forum;

import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ForumTopic {
    public Integer message_thread_id, icon_color;
    public String name, icon_custom_emoji_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForumTopic that = (ForumTopic) object;
        return Objects.equals(message_thread_id, that.message_thread_id) &&
                Objects.equals(icon_color, that.icon_color) &&
                Objects.equals(name, that.name) &&
                Objects.equals(icon_custom_emoji_id, that.icon_custom_emoji_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_thread_id, icon_color, name, icon_custom_emoji_id);
    }
}
