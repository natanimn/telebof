package io.github.natanimn.types.media_and_service;

/**
 * Represents a reaction added to a message along with the number of times it was added.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ReactionCount {
    /**
     * Type of the reaction
     */
    public ReactionType type;

    /**
     * Number of times the reaction was added
     */
    public Integer total_count;
}
