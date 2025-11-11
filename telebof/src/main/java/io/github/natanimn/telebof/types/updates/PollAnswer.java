package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 * @param pollId Unique poll identifier
 * @param user The user that changed the answer to the poll, if the voter isn't anonymous
 * @param optionIds 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
 * @param voterChat The chat that changed the answer to the poll, if the voter is anonymous
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PollAnswer(
        @SerializedName("poll_id") String pollId,
        User user,
        @SerializedName("option_ids") List<Integer> optionIds,
        @SerializedName("voter_chat") Chat voterChat
) implements TelegramUpdate {}