package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatBoost implements Serializable {
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
