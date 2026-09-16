package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This class contains information about one answer option in a poll.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class PollOption implements TelegramUpdate, JsonFormatter {
    /**
     * Unique identifier of the option, persistent on option addition and deletion
     */
    @SerializedName("persistent_id")
    private String persistentId;

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

    /**
     * Optional. User who added the option; omitted if the option wasn't added by a user after poll creation
     */
    @SerializedName("added_by_user")
    private User addedByUser;

    /**
     * Optional. Chat that added the option; omitted if the option wasn't added by a chat after poll creation
     */
    @SerializedName("added_by_chat")
    private Chat addedByChat;

    /**
     * Optional. Point in time (Unix timestamp) when the option was added; omitted if the option existed in the original poll
     */
    @SerializedName("addition_date")
    private Long additionDate;

}