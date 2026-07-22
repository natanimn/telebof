package io.github.natanimn.telebof.types;

/**
 * Represents a community (a group of chats).
 * @author Natanim
 * @since 2.2
 */
public class Community {
    /**
     * Unique identifier for this community. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     */
    private Long id;

    /**
     * Name of the community
     */
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
