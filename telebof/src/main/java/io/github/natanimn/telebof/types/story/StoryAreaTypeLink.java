package io.github.natanimn.telebof.types.story;

import lombok.Getter;

/**
 * Describes a story area pointing to an HTTP or tg:// link. Currently, a story can have up to 3 link areas.
 * @author Natanim
 * @since 19 August 2025
 */
@Getter
public class StoryAreaTypeLink implements StoryAreaType {
    /**
     * HTTP or tg:// URL to be opened when the area is clicked
     */
    private final String url;
    private final String type = "link";

    public StoryAreaTypeLink(String url) {
        this.url = url;
    }
}