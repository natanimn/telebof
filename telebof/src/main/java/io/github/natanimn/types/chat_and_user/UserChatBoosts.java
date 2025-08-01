package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class UserChatBoosts implements Serializable {
    public List<ChatBoost> boosts;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserChatBoosts that = (UserChatBoosts) object;
        return Objects.equals(boosts, that.boosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boosts);
    }
}
