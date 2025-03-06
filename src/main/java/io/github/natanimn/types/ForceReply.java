package io.github.natanimn.types;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ForceReply implements Markup, Serializable {
    public final boolean force_reply;
    public Boolean selective;
    public String input_field_placeholder;

    public ForceReply() {
        this.force_reply = true;
    }

    public ForceReply inputFieldPlaceholder(String inputFieldPlaceholder){
        this.input_field_placeholder = inputFieldPlaceholder;
        return this;
    }

    public ForceReply selective(boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForceReply that = (ForceReply) object;
        return force_reply == that.force_reply &&
                Objects.equals(selective, that.selective) &&
                Objects.equals(input_field_placeholder, that.input_field_placeholder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force_reply, selective, input_field_placeholder);
    }
}
