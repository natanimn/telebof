package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ChatBoost {

    public String boost_id;
    public Integer add_date;
    public Integer expiration_data;
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
