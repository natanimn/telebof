package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

/**
 * Represents a chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Chat implements JsonFormatter {
    /**
     * Unique identifier for this chat.
     */
    private long id;

    /**
     * Type of the chat, can be either {@link ChatType#PRIVATE}, {@link ChatType#GROUP}, {@link ChatType#SUPERGROUP} or {@link ChatType#CHANNEL}
     */
    private ChatType type;

    /**
     * Title, for supergroups, channels and group chats
     */
    private String title;

    /**
     * Username, for private chats, supergroups and channels if available
     */
    private String username;

    /**
     * First name of the other party in a private chat
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Last name of the other party in a private chat
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * True, if the supergroup chat is a forum
     */
    @SerializedName("is_forum")
    private Boolean isForum;

    /**
     * True, if the chat is the direct messages chat of a channel
     */
    @SerializedName("is_direct_messages")
    private Boolean isDirectMessages;

}