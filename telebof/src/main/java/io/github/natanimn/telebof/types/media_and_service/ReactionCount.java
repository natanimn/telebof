package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a reaction added to a message along with the number of times it was added.
 * @param type Type of the reaction
 * @param totalCount Number of times the reaction was added
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ReactionCount(
        ReactionType type,
        @SerializedName("total_count") Integer totalCount
) {}