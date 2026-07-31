package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This object represents the content of a service message, sent whenever a user in the chat triggers a proximity alert set by another user.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ProximityAlertTriggered {
    /**
     * User that triggered the alert
     */
    private User traveler;

    /**
     * User that set the alert
     */
    private User watcher;

    /**
     * The distance between the users
     */
    private Integer distance;

}
