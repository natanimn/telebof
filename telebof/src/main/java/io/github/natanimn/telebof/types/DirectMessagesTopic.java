package io.github.natanimn.telebof.types;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * Describes a topic of a direct messages chat.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */

public class DirectMessagesTopic {
    /**
     * Unique identifier of the topic.
     */
    @SerializedName("topic_id")
    private Long topicId;

    /**
     * Optional. Information about the user that created the topic. Currently, it is always present
     */
    private User user;

    public Long getTopicId() {
        return topicId;
    }

    public User getUser() {
        return user;
    }
}
