package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GameHighScore implements Serializable {
    public Integer position, score;
    public User user;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GameHighScore that = (GameHighScore) object;
        return Objects.equals(position, that.position) && Objects.equals(score, that.score) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, score, user);
    }
}
