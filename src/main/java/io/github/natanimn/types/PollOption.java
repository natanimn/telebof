package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PollOption implements Serializable {
    public String text;
    public Integer voter_count;
    public List<MessageEntity> text_entities;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PollOption that = (PollOption) object;
        return Objects.equals(text, that.text) && Objects.equals(voter_count, that.voter_count) &&
                Objects.equals(text_entities, that.text_entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, voter_count, text_entities);
    }
}
