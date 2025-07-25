package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class Chat implements Serializable {
    public long id;
    public String type, title, username, first_name, last_name;
    public Boolean is_forum;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Chat chat = (Chat) object;
        return id == chat.id && Objects.equals(type, chat.type) &&
                Objects.equals(title, chat.title) &&
                Objects.equals(username, chat.username) &&
                Objects.equals(first_name, chat.first_name) &&
                Objects.equals(last_name, chat.last_name) &&
                Objects.equals(is_forum, chat.is_forum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, username, first_name, last_name, is_forum);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", is_forum=" + is_forum +
                '}';
    }
}
