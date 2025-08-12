package io.github.natanimn.types.updates;

import io.github.natanimn.types.media_and_service.MessageEntity;

import java.util.List;
import java.util.Objects;

/**
 * This class contains information about one answer option in a poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PollOption implements TelegramUpdate {
    /**
     * Option text, 1-100 characters
     */
    public String text;

    /**
     * Special entities that appear in the option text.
     * Currently, only custom emoji entities are allowed in poll option texts
     */
    public List<MessageEntity> text_entities;

    /**
     * Number of users that voted for this option
     */
    public Integer voter_count;

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
