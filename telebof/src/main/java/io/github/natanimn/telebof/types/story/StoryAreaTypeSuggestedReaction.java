package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import com.google.gson.annotations.SerializedName;

/**
 * Describes a story area pointing to a suggested reaction. Currently, a story can have up to 5 suggested reaction areas.
 * @param reactionType Type of the reaction
 * @param isDark Optional. Pass True if the reaction area has a dark background
 * @param isFlipped Optional. Pass True if reaction area corner is flipped
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryAreaTypeSuggestedReaction(
        @SerializedName("reaction_type") ReactionType reactionType,
        @SerializedName("is_dark") Boolean isDark,
        @SerializedName("is_flipped") Boolean isFlipped
) implements StoryAreaType {

    public String type() {
        return "suggested_reaction";
    }

    /**
     * Creates a new StoryAreaTypeSuggestedReaction builder
     * @param reactionType Type of the reaction
     */
    public static StoryAreaTypeSuggestedReactionBuilder builder(ReactionType reactionType) {
        return new StoryAreaTypeSuggestedReactionBuilder(reactionType);
    }

    /**
     * Builder class for StoryAreaTypeSuggestedReaction
     */
    public static class StoryAreaTypeSuggestedReactionBuilder {
        private final ReactionType reactionType;
        private Boolean isDark;
        private Boolean isFlipped;

        public StoryAreaTypeSuggestedReactionBuilder(ReactionType reactionType) {
            this.reactionType = reactionType;
        }

        public StoryAreaTypeSuggestedReactionBuilder isDark(Boolean isDark) {
            this.isDark = isDark;
            return this;
        }

        public StoryAreaTypeSuggestedReactionBuilder isFlipped(Boolean isFlipped) {
            this.isFlipped = isFlipped;
            return this;
        }

        public StoryAreaTypeSuggestedReaction build() {
            return new StoryAreaTypeSuggestedReaction(reactionType, isDark, isFlipped);
        }
    }
}