package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.Community;

/**
 * Describes a service message about a chat being added to a community.
 * @author Natanim
 * @since 2.2
 */
public class CommunityChatAdded {
    /**
     * The new community to which the chat belongs
     */
    private Community community;

    public Community getCommunity() {
        return community;
    }
}
