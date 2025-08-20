package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.ReactionType;

/**
 * Describes a story area pointing to a suggested reaction. Currently, a story can have up to 5 suggested reaction areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryAreaTypeSuggestedReaction implements StoryAreaType {
    private String type;
    private ReactionType reaction_type;
    private Boolean is_dark;
    private Boolean is_flipped;

    /**
     * Required
     * @param reaction_type Type of the reaction
     */
    public StoryAreaTypeSuggestedReaction(ReactionType reaction_type) {
        this.type = "suggested_reaction";
        this.reaction_type = reaction_type;
    }

    /**
     * Optional
     * @param is_dark Pass True if the reaction area has a dark background
     * @return {@link StoryAreaTypeSuggestedReaction}
     */
    public StoryAreaTypeSuggestedReaction isDark(Boolean is_dark) {
        this.is_dark = is_dark;
        return this;
    }

    /**
     * Optional
     * @param is_flipped Pass True if reaction area corner is flipped
     * @return {@link StoryAreaTypeSuggestedReaction}
     */
    public StoryAreaTypeSuggestedReaction isFlipped(Boolean is_flipped) {
        this.is_flipped = is_flipped;
        return this;
    }
}