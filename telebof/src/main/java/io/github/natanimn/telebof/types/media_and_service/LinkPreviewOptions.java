package io.github.natanimn.telebof.types.media_and_service;

/**
 * Describes the options used for link preview generation.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class LinkPreviewOptions {
    /**
     * Optional. True, if the link preview is disabled
     */
    public Boolean is_disabled;

    /**
     * Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
     */
    public Boolean prefer_small_media;

    /**
     * Optional. True, if the media in the link preview is supposed to be enlarged;
     * ignored if the URL isn't explicitly specified or media size change isn't supported for the preview
     */
    public Boolean prefer_large_media;

    /**
     * Optional. True, if the link preview must be shown above the message text;
     * otherwise, the link preview will be shown below the message text
     */
    public Boolean show_above_text;

    /**
     * Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
     */
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
}
