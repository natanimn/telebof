package io.github.natanimn.telebof.types.story;

import java.io.Serializable;

/**
 * Describes a clickable area on a story media.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryArea implements Serializable {
    private StoryAreaPosition position;
    private StoryAreaType type;

    /**
     * Required
     * @param position Position of the area
     * @param type Type of the area
     */
    public StoryArea(StoryAreaPosition position, StoryAreaType type) {
        this.position = position;
        this.type = type;
    }
}
