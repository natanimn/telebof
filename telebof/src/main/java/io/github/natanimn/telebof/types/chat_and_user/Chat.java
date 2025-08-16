package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatType;

import java.util.Objects;

/**
 * Represents a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class Chat{
    /**
     * Unique identifier for this chat.
     */
    public long id;

    /**
     * Type of the chat, can be either {@link ChatType#PRIVATE}, {@link ChatType#GROUP}, {@link ChatType#SUPERGROUP} or {@link ChatType#CHANNEL}
     */
    public ChatType type;

    /**
     * Title, for supergroups, channels and group chats
     */
    public String title;

    /**
     * Username, for private chats, supergroups and channels if available
     */
    public String username;

    /**
     * First name of the other party in a private chat
     */
    public String first_name;

    /**
     * Last name of the other party in a private chat
     */
    public String last_name;

    /**
     * True, if the supergroup chat is a forum
     */
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
