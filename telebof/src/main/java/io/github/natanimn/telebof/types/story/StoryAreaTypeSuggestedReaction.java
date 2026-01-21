package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import com.google.gson.annotations.SerializedName;

/**
 * Describes a story area pointing to a suggested reaction. Currently, a story can have up to 5 suggested reaction areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class StoryAreaTypeSuggestedReaction implements StoryAreaType {
    /**
     * Type of the reaction
     */
    @SerializedName("reaction_type")
    private ReactionType reactionType;

    private final String type = "suggested_reaction";
    /**
     * Optional. Pass True if the reaction area has a dark background
     */
    @SerializedName("is_dark")
    private Boolean isDark;

    /**
     * Optional. Pass True if reaction area corner is flipped
     */
    @SerializedName("is_flipped")
    private Boolean isFlipped;

    /**
     * Required
     * @param reactionType Type of the reaction
     */
    public StoryAreaTypeSuggestedReaction(ReactionType reactionType) {
        this.reactionType = reactionType;
    }

    /**
     * @param isDark Pass True if the reaction area has a dark background
     * @return this
     */
    public StoryAreaTypeSuggestedReaction setIsDark(Boolean isDark) {
        this.isDark = isDark;
        return this;
    }

    /**
     * @param isFlipped Pass True if reaction area corner is flipped
     * @return this
     */
    public StoryAreaTypeSuggestedReaction setIsFlipped(Boolean isFlipped) {
        this.isFlipped = isFlipped;
        return this;
    }

    public String getType() {
        return type;
    }

    public ReactionType getReactionType() {
        return reactionType;
    }

    public Boolean getIsDark() {
        return isDark;
    }

    public Boolean getIsFlipped() {
        return isFlipped;
    }
}