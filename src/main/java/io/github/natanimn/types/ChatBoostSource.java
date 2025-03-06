package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ChatBoostSource implements Serializable {
    public String source, giveaway_message_id;
    public User user;
    public Boolean is_unclaimed;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostSource that = (ChatBoostSource) object;
        return Objects.equals(source, that.source) && Objects.equals(giveaway_message_id, that.giveaway_message_id)
                && Objects.equals(user, that.user) && Objects.equals(is_unclaimed, that.is_unclaimed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, giveaway_message_id, user, is_unclaimed);
    }
}
