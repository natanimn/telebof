package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a reaction added to a message along with the number of times it was added.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ReactionCount {

    /**
     * Type of the reaction
     */
    private ReactionType type;

    /**
     * Number of times the reaction was added
     */
    @SerializedName("total_count")
    private Integer totalCount;

    public ReactionType getType() {
        return type;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
}