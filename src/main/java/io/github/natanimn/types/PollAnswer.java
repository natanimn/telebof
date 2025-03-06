package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PollAnswer implements Serializable {
    public String poll_id;
    public User user;
    public List<Integer> options_id;
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
