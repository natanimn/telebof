package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;
import java.io.Serializable;
import java.util.Objects;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot, the field message will be present.
 * If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present.
 * Exactly one of the fields data or game_short_name will be present.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class CallbackQuery implements TelegramUpdate {
    /**
     * Unique identifier for this query
     */
    public String id;

    /**
     * Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    public String inline_message_id;

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in <a href="https://core.telegram.org/bots/api#games">games.</a>
     */
    public String chat_instance;

    /**
     * Data associated with the callback button.
     * Be aware that the message originated the query can contain no callback buttons with this data.
     */
    public String data;

    /**
     * Short name of a <a href="https://core.telegram.org/bots/api#games">Game</a> to be returned, serves as the unique identifier for the game
     */
    public String game_short_name;

    /**
     * Sender
     */
    public User from;

    /**
     * Message sent by the bot with the callback button that originated the query
     */
    public Message message;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CallbackQuery that = (CallbackQuery) object;
        return  Objects.equals(id, that.id) &&
                Objects.equals(inline_message_id, that.inline_message_id) &&
                Objects.equals(chat_instance, that.chat_instance) &&
                Objects.equals(data, that.data) &&
                Objects.equals(game_short_name, that.game_short_name) &&
                Objects.equals(from, that.from) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inline_message_id, chat_instance, data, game_short_name, from, message);
    }

    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id='" + id + '\'' +
                ", inline_message_id='" + inline_message_id + '\'' +
                ", chat_instance='" + chat_instance + '\'' +
                ", data='" + data + '\'' +
                ", game_short_name='" + game_short_name + '\'' +
                ", from=" + from +
                ", message=" + message +
                '}';
    }
}
