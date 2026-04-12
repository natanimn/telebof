package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.updates.Message;

import java.util.List;

/**
 * Describes a service message about an option added to a poll.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class PollOptionAdded {
    /**
     * Optional. Message containing the poll to which the option was added, if known.
     * Note that the Message object in this field will not contain the {@link Message#getReplyToMessage()} field even if it itself is a reply.
     */
    @SerializedName("poll_message")
    private Message pollMessage;

    /**
     * Unique identifier of the added option
     */
    @SerializedName("option_persistent_id")
    private String optionPersistentId;

    /**
     * Option text
     */
    @SerializedName("option_text")
    private String optionText;

    /**
     * Optional. Special entities that appear in the {@link #optionText}
     */
    @SerializedName("option_text_entities")
    private List<MessageEntity> optionTextEntities;
}
