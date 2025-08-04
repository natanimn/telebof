package io.github.natanimn.types.forum;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ForumTopicEdited  implements Serializable {

    public String name, icon_custom_emoji_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForumTopicEdited that = (ForumTopicEdited) object;
        return Objects.equals(name, that.name) && Objects.equals(icon_custom_emoji_id, that.icon_custom_emoji_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, icon_custom_emoji_id);
    }
}
