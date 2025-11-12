package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;

/**
 * Represents a chat.
 * @param id Unique identifier for this chat.
 * @param type Type of the chat, can be either {@link ChatType#PRIVATE}, {@link ChatType#GROUP}, {@link ChatType#SUPERGROUP} or {@link ChatType#CHANNEL}
 * @param title Title, for supergroups, channels and group chats
 * @param username Username, for private chats, supergroups and channels if available
 * @param firstName First name of the other party in a private chat
 * @param lastName Last name of the other party in a private chat
 * @param isForum True, if the supergroup chat is a forum
 * @param isDirectMessages True, if the chat is the direct messages chat of a channel
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Chat(
     long id,

     ChatType type,

     String title,

     String username,

     @SerializedName("first_name")
     String firstName,

     @SerializedName("last_name")
     String lastName,

     @SerializedName("is_forum")
     Boolean isForum,

     @SerializedName("is_direct_messages")
     Boolean isDirectMessages
){}
