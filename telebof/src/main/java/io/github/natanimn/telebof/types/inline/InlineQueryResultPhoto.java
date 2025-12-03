package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional caption.
 * Alternatively, you can use setInputMessageContent to send a message with the specified content instead of the photo.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultPhoto extends InlineQueryMediaResult<InlineQueryResultPhoto> {
    @SerializedName("photo_url")
    private String photoUrl;
    private String title;
    private String description;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("photo_width")
    private Integer photoWidth;
    @SerializedName("photo_height")
    private Integer photoHeight;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param photoUrl A valid URL of the photo. Photo must be in JPEG format. Photo size must not exceed 5MB
     * @param thumbnailUrl URL of the thumbnail for the photo
     */
    public InlineQueryResultPhoto(String id, String photoUrl, String thumbnailUrl) {
        super("photo", id);
        this.photoUrl = photoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param photoWidth Width of the photo
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }

    /**
     * Optional
     * @param photoHeight Height of the photo
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }
}