package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents the content of a service message, sent whenever a user in the chat triggers a proximity alert set by another user.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ProximityAlertTriggered {
    /**
     * User that triggered the alert
     */
    public User traveler;

    /**
     * User that set the alert
     */
    public User watcher;

    /**
     * The distance between the users
     */
    public Integer distance;

}
