package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class CallbackQuery implements Serializable {
    public String id, inline_message_id, chat_instance, data, game_short_name;
    public User from;
    public Message message;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CallbackQuery that = (CallbackQuery) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(inline_message_id, that.inline_message_id) &&
                Objects.equals(chat_instance, that.chat_instance) &&
                Objects.equals(data, that.data) && Objects.equals(game_short_name, that.game_short_name) &&
                Objects.equals(from, that.from) && Objects.equals(message, that.message);
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
