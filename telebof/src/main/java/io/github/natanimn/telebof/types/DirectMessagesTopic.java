package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * Describes a topic of a direct messages chat.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class DirectMessagesTopic {
    /**
     * Unique identifier of the topic.
     */
    public Long topic_id;

    /**
     * Optional. Information about the user that created the topic. Currently, it is always present
     */
    public User user;
}
