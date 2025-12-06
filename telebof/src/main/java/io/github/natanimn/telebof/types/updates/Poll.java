package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.PollType;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This class contains information about a poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Poll implements TelegramUpdate {
    /**
     * Unique poll identifier
     */
    private String id;

    /**
     * Poll question, 1-300 characters
     */
    private String question;

    /**
     * Poll type
     */
    private PollType type;

    /**
     * Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
     */
    private String explanation;

    /**
     * List of poll options
     */
    private List<PollOption> options;

    /**
     * Total number of users that voted in the poll
     */
    @SerializedName("total_voter_count")
    private Integer totalVoterCount;

    /**
     * 0-based identifier of the correct answer option. Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
     */
    @SerializedName("correct_option_id")
    private Integer correctOptionId;

    /**
     * Amount of time in seconds the poll will be active after creation
     */
    @SerializedName("open_period")
    private Integer openPeriod;

    /**
     * Point in time (Unix timestamp) when the poll will be automatically closed
     */
    @SerializedName("close_date")
    private Integer closeDate;

    /**
     * True, if the poll is closed
     */
    @SerializedName("is_closed")
    private Boolean isClosed;

    /**
     * True, if the poll is anonymous
     */
    @SerializedName("is_anonymous")
    private Boolean isAnonymous;

    /**
     * True, if the poll allows multiple answers
     */
    @SerializedName("allows_multiple_answers")
    private Boolean allowsMultipleAnswers;

    /**
     * Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
     */
    @SerializedName("explanation_entities")
    private List<MessageEntity> explanationEntities;

    /**
     * Special entities that appear in the question. Currently, only custom emoji entities are allowed in poll questions
     */
    @SerializedName("question_entities")
    private List<MessageEntity> questionEntities;

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public PollType getType() {
        return type;
    }

    public String getExplanation() {
        return explanation;
    }

    public List<PollOption> getOptions() {
        return options;
    }

    public Integer getTotalVoterCount() {
        return totalVoterCount;
    }

    public Integer getCorrectOptionId() {
        return correctOptionId;
    }

    public Integer getOpenPeriod() {
        return openPeriod;
    }

    public Integer getCloseDate() {
        return closeDate;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public Boolean getAllowsMultipleAnswers() {
        return allowsMultipleAnswers;
    }

    public List<MessageEntity> getExplanationEntities() {
        return explanationEntities;
    }

    public List<MessageEntity> getQuestionEntities() {
        return questionEntities;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", type=" + type +
                ", explanation='" + explanation + '\'' +
                ", options=" + options +
                ", totalVoterCount=" + totalVoterCount +
                ", correctOptionId=" + correctOptionId +
                ", openPeriod=" + openPeriod +
                ", closeDate=" + closeDate +
                ", isClosed=" + isClosed +
                ", isAnonymous=" + isAnonymous +
                ", allowsMultipleAnswers=" + allowsMultipleAnswers +
                ", explanationEntities=" + explanationEntities +
                ", questionEntities=" + questionEntities +
                '}';
    }
}