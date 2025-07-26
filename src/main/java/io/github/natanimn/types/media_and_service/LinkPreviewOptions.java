package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class LinkPreviewOptions implements Serializable {
    public Boolean is_disabled, prefer_small_media, prefer_large_media, show_above_text;
    public String url;

    public LinkPreviewOptions isDisabled(boolean is_disabled){
        this.is_disabled = is_disabled;
        return this;
    }

    public LinkPreviewOptions preferLargeMedia(boolean prefer_large_media){
        this.prefer_large_media = prefer_large_media;
        return this;
    }

    public LinkPreviewOptions preferSmallMedia(boolean prefer_small_media){
        this.prefer_small_media = prefer_small_media;
        return this;
    }

    public LinkPreviewOptions showAboveText(boolean show_above_text){
        this.show_above_text = show_above_text;
        return this;
    }

    public LinkPreviewOptions url(String url){
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        LinkPreviewOptions that = (LinkPreviewOptions) object;
        return Objects.equals(is_disabled, that.is_disabled) && Objects.equals(prefer_small_media, that.prefer_small_media) &&
                Objects.equals(prefer_large_media, that.prefer_large_media) && Objects.equals(show_above_text, that.show_above_text) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(is_disabled, prefer_small_media, prefer_large_media, show_above_text, url);
    }
}
