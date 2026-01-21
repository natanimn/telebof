package io.github.natanimn.telebof.types.story;

/**
 * Describes a story area pointing to an HTTP or tg:// link. Currently, a story can have up to 3 link areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class StoryAreaTypeLink implements StoryAreaType {
    /**
     * HTTP or tg:// URL to be opened when the area is clicked
     */
    private String url;
    private final String type = "link";

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}