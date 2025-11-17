package io.github.natanimn.telebof.types;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * Describes a topic of a direct messages chat.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 * @param topicId Unique identifier of the topic.
 * @param user Optional. Information about the user that created the topic. Currently, it is always present
 */

public record DirectMessagesTopic(
    @SerializedName("topic_id") Long topicId,
    User user
) { }
