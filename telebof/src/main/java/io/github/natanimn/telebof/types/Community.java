package io.github.natanimn.telebof.types;

import lombok.Getter;

/**
 * Represents a community (a group of chats).
 * @author Natanim
 * @since 2.2
 */
@Getter
public class Community {
    /**
     * Unique identifier for this community. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     */
    private Long id;

    /**
     * Name of the community
     */
    private String name;

}
