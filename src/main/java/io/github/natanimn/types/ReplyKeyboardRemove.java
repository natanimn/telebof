package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ReplyKeyboardRemove implements Markup, Serializable {
    private final boolean remove_keyboard;
    private boolean selective;
    public ReplyKeyboardRemove() {
        this.remove_keyboard = true;
        this.selective = false;
    }

    public ReplyKeyboardRemove selective(boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReplyKeyboardRemove that = (ReplyKeyboardRemove) object;
        return remove_keyboard == that.remove_keyboard && selective == that.selective;
    }

    @Override
    public int hashCode() {
        return Objects.hash(remove_keyboard, selective);
    }
}
