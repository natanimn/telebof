package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the options used for link preview generation.
 * @param isDisabled Optional. True, if the link preview is disabled
 * @param preferSmallMedia Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
 * @param preferLargeMedia Optional. True, if the media in the link preview is supposed to be enlarged; ignored if the URL isn't explicitly specified or media size change isn't supported for the preview
 * @param showAboveText Optional. True, if the link preview must be shown above the message text; otherwise, the link preview will be shown below the message text
 * @param url Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record LinkPreviewOptions(
        @SerializedName("is_disabled") Boolean isDisabled,
        @SerializedName("prefer_small_media") Boolean preferSmallMedia,
        @SerializedName("prefer_large_media") Boolean preferLargeMedia,
        @SerializedName("show_above_text") Boolean showAboveText,
        String url
) {

    /**
     * Creates a new LinkPreviewOptions builder
     */
    public static LinkPreviewOptionsBuilder builder() {
        return new LinkPreviewOptionsBuilder();
    }

    /**
     * Builder class for LinkPreviewOptions
     */
    public static class LinkPreviewOptionsBuilder {
        private Boolean isDisabled;
        private Boolean preferSmallMedia;
        private Boolean preferLargeMedia;
        private Boolean showAboveText;
        private String url;

        public LinkPreviewOptionsBuilder isDisabled(boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public LinkPreviewOptionsBuilder preferSmallMedia(boolean preferSmallMedia) {
            this.preferSmallMedia = preferSmallMedia;
            return this;
        }

        public LinkPreviewOptionsBuilder preferLargeMedia(boolean preferLargeMedia) {
            this.preferLargeMedia = preferLargeMedia;
            return this;
        }

        public LinkPreviewOptionsBuilder showAboveText(boolean showAboveText) {
            this.showAboveText = showAboveText;
            return this;
        }

        public LinkPreviewOptionsBuilder url(String url) {
            this.url = url;
            return this;
        }

        public LinkPreviewOptions build() {
            return new LinkPreviewOptions(
                    isDisabled,
                    preferSmallMedia,
                    preferLargeMedia,
                    showAboveText,
                    url
            );
        }
    }
}