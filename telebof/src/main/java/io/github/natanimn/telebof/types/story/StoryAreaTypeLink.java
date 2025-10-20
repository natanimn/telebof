package io.github.natanimn.telebof.types.story;

/**
 * Describes a story area pointing to an HTTP or tg:// link. Currently, a story can have up to 3 link areas.
 * @param url HTTP or tg:// URL to be opened when the area is clicked
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryAreaTypeLink(
        String url
) implements StoryAreaType {
    public String type() {
        return "link";
    }
}