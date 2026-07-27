package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.PollType;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.media_and_service.PollMedia;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This class contains information about a poll.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Poll implements TelegramUpdate, JsonFormatter {
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
     * Optional. Array of 0-based identifiers of the correct answer options. Available only for polls in quiz mode which are closed or were sent (not forwarded) by the bot or to the private chat with the bot.
     */
    @SerializedName("correct_option_ids")
    private List<Integer> correctOptionIds;

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

    /**
     * True, if the poll allows to change the chosen answer options
     */
    @SerializedName("allows_revoting")
    private Boolean allowsRevoting;

    @SerializedName("description_entities")
    private List<MessageEntity> descriptionEntities;

    /**
     * Optional. Media added to the poll description; for polls inside the Message object only
     */
    private PollMedia media;

    /**
     * Optional. Media added to the quiz explanation
     */
    @SerializedName("explanation_media")
    private PollMedia explanationMedia;

    /**
     * True if voting is limited to users who have been members of the chat where the poll was originally sent for more than 24 hours
     */
    @SerializedName("members_only")
    private Boolean membersOnly;

    /**
     * Optional. A list of two-letter <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> country codes indicating the countries from which users can vote in the poll.
     * The country code “FT” is used for users with anonymous numbers. If omitted, then users from any country can participate in the poll.
     */
    @SerializedName("country_codes")
    private List<String> countryCodes;

}