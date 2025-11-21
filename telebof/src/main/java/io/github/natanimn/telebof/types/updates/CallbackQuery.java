package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot, the field message will be present.
 * If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present.
 * Exactly one of the fields data or game_short_name will be present.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class CallbackQuery implements TelegramUpdate {
    /**
     * Unique identifier for this query
     */
    private String id;

    /**
     * Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in <a href="https://core.telegram.org/bots/api#games">games.</a>
     */
    @SerializedName("chat_instance")
    private String chatInstance;

    /**
     * Data associated with the callback button.
     * Be aware that the message originated the query can contain no callback buttons with this data.
     */
    private String data;

    /**
     * Short name of a <a href="https://core.telegram.org/bots/api#games">Game</a> to be returned, serves as the unique identifier for the game
     */
    @SerializedName("game_short_name")
    private String gameShortName;

    /**
     * Sender
     */
    private User from;

    /**
     * Message sent by the bot with the callback button that originated the query
     */
    private Message message;

    public String getId() {
        return id;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public String getData() {
        return data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public User getFrom() {
        return from;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CallbackQuery that = (CallbackQuery) object;
        return  Objects.equals(id, that.id) &&
                Objects.equals(inlineMessageId, that.inlineMessageId) &&
                Objects.equals(chatInstance, that.chatInstance) &&
                Objects.equals(data, that.data) &&
                Objects.equals(gameShortName, that.gameShortName) &&
                Objects.equals(from, that.from) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inlineMessageId, chatInstance, data, gameShortName, from, message);
    }

    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id='" + id + '\'' +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", chatInstance='" + chatInstance + '\'' +
                ", data='" + data + '\'' +
                ", gameShortName='" + gameShortName + '\'' +
                ", from=" + from +
                ", message=" + message +
                '}';
    }
}