package io.github.natanimn.types.forum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ForumTopicCreated implements Serializable {

    public String name, icon_custom_emoji_id;
    public Integer icon_color;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForumTopicCreated that = (ForumTopicCreated) object;
        return Objects.equals(name, that.name) &&
                Objects.equals(icon_custom_emoji_id, that.icon_custom_emoji_id) &&
                Objects.equals(icon_color, that.icon_color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, icon_custom_emoji_id, icon_color);
    }
}
