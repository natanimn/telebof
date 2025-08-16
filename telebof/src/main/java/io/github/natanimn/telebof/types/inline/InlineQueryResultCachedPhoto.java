package io.github.natanimn.telebof.types.inline;


/**
 * Represents a link to a photo stored on the Telegram servers. By default, this photo will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the photo.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedPhoto extends InlineQueryMediaResult<InlineQueryResultCachedPhoto> {
    private String photo_file_id;
    private String title;
    private String description;
    private Boolean show_caption_above_media;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param photo_file_id A valid file identifier of the photo
     */
    public InlineQueryResultCachedPhoto(String id, String photo_file_id) {
        super("photo", id);
        this.photo_file_id = photo_file_id;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedPhoto}
     */
    public InlineQueryResultCachedPhoto showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }
}
