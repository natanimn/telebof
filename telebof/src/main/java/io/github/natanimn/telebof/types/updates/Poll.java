package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.PollType;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This class contains information about a poll.
 * @param id Unique poll identifier
 * @param question Poll question, 1-300 characters
 * @param type Poll type
 * @param explanation Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
 * @param options List of poll options
 * @param totalVoterCount Total number of users that voted in the poll
 * @param correctOptionId 0-based identifier of the correct answer option. Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
 * @param openPeriod Amount of time in seconds the poll will be active after creation
 * @param closeDate Point in time (Unix timestamp) when the poll will be automatically closed
 * @param isClosed True, if the poll is closed
 * @param isAnonymous True, if the poll is anonymous
 * @param allowsMultipleAnswers True, if the poll allows multiple answers
 * @param explanationEntities Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
 * @param questionEntities Special entities that appear in the question. Currently, only custom emoji entities are allowed in poll questions
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Poll(
        String id,
        String question,
        PollType type,
        String explanation,
        List<PollOption> options,
        @SerializedName("total_voter_count") Integer totalVoterCount,
        @SerializedName("correct_option_id") Integer correctOptionId,
        @SerializedName("open_period") Integer openPeriod,
        @SerializedName("close_date") Integer closeDate,
        @SerializedName("is_closed") Boolean isClosed,
        @SerializedName("is_anonymous") Boolean isAnonymous,
        @SerializedName("allows_multiple_answers") Boolean allowsMultipleAnswers,
        @SerializedName("explanation_entities") List<MessageEntity> explanationEntities,
        @SerializedName("question_entities") List<MessageEntity> questionEntities
) implements TelegramUpdate {}