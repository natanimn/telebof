package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Describes the options used for link preview generation.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class LinkPreviewOptions {
    /**
     * Optional. True, if the link preview is disabled
     */
    @SerializedName("is_disabled")
    private Boolean isDisabled;

    /**
     * Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
     */
    @SerializedName("prefer_small_media")
    private Boolean preferSmallMedia;

    /**
     * Optional. True, if the media in the link preview is supposed to be enlarged; ignored if the URL isn't explicitly specified or media size change isn't supported for the preview
     */
    @SerializedName("prefer_large_media")
    private Boolean preferLargeMedia;

    /**
     * Optional. True, if the link preview must be shown above the message text; otherwise, the link preview will be shown below the message text
     */
    @SerializedName("show_above_text")
    private Boolean showAboveText;

    /**
     * Optional. URL to use for the link preview. If empty, then the first URL found in the message text will be used
     */
    private String url;
}