package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Represents a reaction added to a message along with the number of times it was added.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}