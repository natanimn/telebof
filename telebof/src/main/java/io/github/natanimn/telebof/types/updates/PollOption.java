package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This class contains information about one answer option in a poll.
 * @param text Option text, 1-100 characters
 * @param textEntities Special entities that appear in the option text. Currently, only custom emoji entities are allowed in poll option texts
 * @param voterCount Number of users that voted for this option
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PollOption(
        String text,
        @SerializedName("text_entities") List<MessageEntity> textEntities,
        @SerializedName("voter_count") Integer voterCount
) implements TelegramUpdate {}