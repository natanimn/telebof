package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PollAnswer implements TelegramUpdate {
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

    public String getPollId() {
        return pollId;
    }

    public User getUser() {
        return user;
    }

    public List<Integer> getOptionIds() {
        return optionIds;
    }

    public Chat getVoterChat() {
        return voterChat;
    }

    @Override
    public String toString() {
        return "PollAnswer{" +
                "pollId='" + pollId + '\'' +
                ", user=" + user +
                ", optionIds=" + optionIds +
                ", voterChat=" + voterChat +
                '}';
    }
}