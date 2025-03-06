package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class MessageAutoDeleteTimerChanged {
    public Integer messageAutoDeleteTimerChanged;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageAutoDeleteTimerChanged that = (MessageAutoDeleteTimerChanged) object;
        return Objects.equals(messageAutoDeleteTimerChanged, that.messageAutoDeleteTimerChanged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageAutoDeleteTimerChanged);
    }
}
