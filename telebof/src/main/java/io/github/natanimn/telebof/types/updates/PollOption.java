package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This class contains information about one answer option in a poll.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PollOption implements TelegramUpdate {
    /**
     * Option text, 1-100 characters
     */
    private String text;

    /**
     * Special entities that appear in the option text. Currently, only custom emoji entities are allowed in poll option texts
     */
    @SerializedName("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Number of users that voted for this option
     */
    @SerializedName("voter_count")
    private Integer voterCount;

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Integer getVoterCount() {
        return voterCount;
    }

    @Override
    public String toString() {
        return "PollOption{" +
                "text='" + text + '\'' +
                ", textEntities=" + textEntities +
                ", voterCount=" + voterCount +
                '}';
    }
}