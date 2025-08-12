package io.github.natanimn.types.updates;

import io.github.natanimn.enums.PollType;
import io.github.natanimn.types.media_and_service.MessageEntity;

import java.util.List;
import java.util.Objects;

/**
 * This class contains information about a poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class Poll implements TelegramUpdate{
    /**
     * Unique poll identifier
     */
    public String id;

    /**
     * Poll question, 1-300 characters
     */
    public String question;

    /**
     * Special entities that appear in the question. Currently, only custom emoji entities are allowed in poll questions
     */
    public PollType type;

    /**
     * Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
     */
    public String explanation;

    /**
     * List of poll options
     */
    public List<PollOption> options;

    /**
     * Total number of users that voted in the poll
     */
    public Integer total_voter_count;

    /**
     * 0-based identifier of the correct answer option.
     * Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
     */
    public Integer correct_option_id;

    /**
     *  Amount of time in seconds the poll will be active after creation
     */
    public Integer open_period;

    /**
     * Point in time (Unix timestamp) when the poll will be automatically closed
     */
    public Integer close_date;

    /**
     * True, if the poll is closed
     */
    public Boolean is_closed;

    /**
     * True, if the poll is anonymous
     */
    public Boolean is_anonymous;

    /**
     * True, if the poll allows multiple answers
     */
    public Boolean allows_multiple_answers;

    /**
     * Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
     */
    public List<MessageEntity> explanation_entities;

    /**
     * Special entities that appear in the question. Currently, only custom emoji entities are allowed in poll questions
     */
    public List<MessageEntity> question_entities;

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
