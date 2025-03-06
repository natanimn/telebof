package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Poll implements Serializable {
    public String id, question, type, explanation;
    public List<PollOption> options;
    public Integer total_voter_count, correct_option_id, open_period, close_date;
    public Boolean is_closed, is_anonymous, allows_multiple_answers;
    public List<MessageEntity> explanation_entities, question_entities;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Poll poll = (Poll) object;
        return Objects.equals(id, poll.id) && Objects.equals(question, poll.question) && Objects.equals(type, poll.type) &&
                Objects.equals(explanation, poll.explanation) && Objects.equals(options, poll.options) &&
                Objects.equals(total_voter_count, poll.total_voter_count) &&
                Objects.equals(correct_option_id, poll.correct_option_id) && Objects.equals(open_period, poll.open_period) &&
                Objects.equals(close_date, poll.close_date) && Objects.equals(is_closed, poll.is_closed) &&
                Objects.equals(is_anonymous, poll.is_anonymous) &&
                Objects.equals(allows_multiple_answers, poll.allows_multiple_answers) &&
                Objects.equals(explanation_entities, poll.explanation_entities) &&
                Objects.equals(question_entities, poll.question_entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, type, explanation, options, total_voter_count, correct_option_id, open_period,
                close_date, is_closed, is_anonymous, allows_multiple_answers, explanation_entities, question_entities);
    }


    @Override
    public String toString() {
        return "Poll{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", type='" + type + '\'' +
                ", explanation='" + explanation + '\'' +
                ", options=" + options +
                ", total_voter_count=" + total_voter_count +
                ", correct_option_id=" + correct_option_id +
                ", open_period=" + open_period +
                ", close_date=" + close_date +
                ", is_closed=" + is_closed +
                ", is_anonymous=" + is_anonymous +
                ", allows_multiple_answers=" + allows_multiple_answers +
                ", explanation_entities=" + explanation_entities +
                ", question_entities=" + question_entities +
                '}';
    }
}
