package io.github.natanimn.telebof.types.story;

import lombok.Getter;

import java.io.Serializable;

/**
 * Describes a clickable area on a story media.
 * @author Natanim
 * @since 19 August 2025
 */
@Getter
public class StoryArea implements Serializable {
    /**
     * Position of the area
     */
    private StoryAreaPosition position;

    /**
     * Type of the area
     */
    private StoryAreaType type;

    public StoryArea(){}

    public StoryArea(StoryAreaPosition position, StoryAreaType type) {
        this.position = position;
        this.type = type;
    }

}