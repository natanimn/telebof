package io.github.natanimn.telebof.types.story;

/**
 * Describes a story area pointing to an HTTP or tg:// link. Currently, a story can have up to 3 link areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryAreaTypeLink implements StoryAreaType {
    private String type;
    private String url;

    /**
     * Required
     * @param url HTTP or tg:// URL to be opened when the area is clicked
     */
    public StoryAreaTypeLink(String url) {
        this.type = "link";
        this.url = url;
    }
}