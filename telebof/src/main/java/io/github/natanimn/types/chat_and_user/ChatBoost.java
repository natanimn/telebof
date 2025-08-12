package io.github.natanimn.types.chat_and_user;

import java.util.Objects;

/**
 * This object contains information about a chat boost.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatBoost {
    /**
     * Unique identifier of the boost
     */
    public String boost_id;

    /**
     * Point in time (Unix timestamp) when the chat was boosted
     */
    public Integer add_date;

    /**
     * Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged
     */
    public Integer expiration_data;

    /**
     * Source of the added boost
     */
    public ChatBoostSource source;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoost chatBoost = (ChatBoost) object;
        return Objects.equals(boost_id, chatBoost.boost_id) &&
                Objects.equals(add_date, chatBoost.add_date) &&
                Objects.equals(expiration_data, chatBoost.expiration_data) &&
                Objects.equals(source, chatBoost.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boost_id, add_date, expiration_data, source);
    }
}
