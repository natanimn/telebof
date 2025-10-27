package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;

/**
 * Represents a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Chat {
    private long id;
    private ChatType type;
    private String title;
    private String username;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("is_forum")
    private Boolean isForum;

    @SerializedName("is_direct_messages")
    private Boolean isDirectMessages;

    /**
     * Gets the unique identifier for this chat.
     * @return Unique identifier for this chat
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the type of the chat.
     * @return Type of the chat, can be either {@link ChatType#PRIVATE}, {@link ChatType#GROUP}, {@link ChatType#SUPERGROUP} or {@link ChatType#CHANNEL}
     */
    public ChatType getType() {
        return type;
    }

    /**
     * Gets the title of the chat.
     * @return Title, for supergroups, channels and group chats
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the username of the chat.
     * @return Username, for private chats, supergroups and channels if available
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the first name of the other party in a private chat.
     * @return First name of the other party in a private chat
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the other party in a private chat.
     * @return Last name of the other party in a private chat
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets whether the supergroup chat is a forum.
     * @return True, if the supergroup chat is a forum
     */
    public Boolean getIsForum() {
        return isForum;
    }

    /**
     * Gets whether the chat is the direct messages chat of a channel.
     * @return True, if the chat is the direct messages chat of a channel
     */
    public Boolean getIsDirectMessages() {
        return isDirectMessages;
    }
}