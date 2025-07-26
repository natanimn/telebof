package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.types.media_and_service.ReactionType;

/**
 * Represents one of {@link ReactionType} type
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public enum TypeReaction {
    @SerializedName("emoji")
    EMOJI,

    @SerializedName("custom_emoji")
    CUSTOM_EMOJI
}
