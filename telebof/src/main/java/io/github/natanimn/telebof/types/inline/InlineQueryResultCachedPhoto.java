package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a photo stored on the Telegram servers. By default, this photo will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the photo.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedPhoto extends InlineQueryMediaResult<InlineQueryResultCachedPhoto> {
    @SerializedName("photo_file_id")
    private String photoFileId;
    private String title;
    private String description;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param photoFileId A valid file identifier of the photo
     */
    public InlineQueryResultCachedPhoto(String id, String photoFileId) {
        super("photo", id);
        this.photoFileId = photoFileId;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}