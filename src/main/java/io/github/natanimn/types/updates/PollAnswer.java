package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.Chat;
import io.github.natanimn.types.chat_and_user.User;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PollAnswer{
    /**
     * Unique poll identifier
     */
    public String poll_id;

    /**
     * The user that changed the answer to the poll, if the voter isn't anonymous
     */
    public User user;

    /**
     * 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
     */
    public List<Integer> options_id;

    /**
     * The chat that changed the answer to the poll, if the voter is anonymous
     */
    public Chat voter_chat;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PollAnswer that = (PollAnswer) object;
        return Objects.equals(poll_id, that.poll_id) && Objects.equals(user, that.user) &&
                Objects.equals(options_id, that.options_id) && Objects.equals(voter_chat, that.voter_chat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poll_id, user, options_id, voter_chat);
    }

    @Override
    public String toString() {
        return "PollAnswer{" +
                "poll_id='" + poll_id + '\'' +
                ", user=" + user +
                ", options_id=" + options_id +
                ", voter_chat=" + voter_chat +
                '}';
    }
}
