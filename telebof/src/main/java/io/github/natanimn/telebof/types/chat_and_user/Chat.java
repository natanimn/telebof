package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatType;

import java.util.Objects;

/**
 * Represents a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.2.0
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

    /**
     * Optional. True, if the chat is the direct messages chat of a channel
     */
    public Boolean is_direct_messages;

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
                ", is_direct_messages=" + is_direct_messages +
                '}';
    }
}
