package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents the content of a service message, sent whenever a user in the chat triggers a proximity alert set by another user.
 * @param traveler User that triggered the alert
 * @param watcher User that set the alert
 * @param distance The distance between the users
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ProximityAlertTriggered(
        User traveler,
        User watcher,
        Integer distance
) {}