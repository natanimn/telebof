package io.github.natanimn.telebof.types.story;

import java.io.Serializable;

/**
 * Describes a clickable area on a story media.
 * @param position Position of the area
 * @param type Type of the area
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryArea(
        StoryAreaPosition position,
        StoryAreaType type
) implements Serializable {}