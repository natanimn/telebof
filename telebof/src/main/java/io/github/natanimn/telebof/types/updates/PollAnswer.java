package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

import java.util.List;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class PollAnswer implements TelegramUpdate, JsonFormatter {
    /**
     * Unique poll identifier
     */
    @SerializedName("poll_id")
    private String pollId;

    /**
     * The user that changed the answer to the poll, if the voter isn't anonymous
     */
    private User user;

    /**
     * 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
     */
    @SerializedName("option_ids")
    private List<Integer> optionIds;

    /**
     * The chat that changed the answer to the poll, if the voter is anonymous
     */
    @SerializedName("voter_chat")
    private Chat voterChat;

    /**
     * Persistent identifiers of the chosen answer options. May be empty if the vote was retracted.
     */
    @SerializedName("option_persistent_ids")
    private List<String> optionPersistentIds;

}