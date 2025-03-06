package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
