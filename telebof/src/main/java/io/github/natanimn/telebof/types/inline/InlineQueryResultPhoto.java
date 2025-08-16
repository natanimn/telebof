package io.github.natanimn.telebof.types.inline;


/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the photo.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultPhoto extends InlineQueryMediaResult<InlineQueryResultPhoto> {
    private String photo_url;
    private String title;
    private String description;
    private String thumbnail_url;
    private Integer photo_width;
    private Integer photo_height;
    private Boolean show_caption_above_media;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param photo_url A valid URL of the photo. Photo must be in JPEG format. Photo size must not exceed 5MB
     * @param thumbnail_url URL of the thumbnail for the photo
     */
    public InlineQueryResultPhoto(String id, String photo_url, String thumbnail_url) {
        super("photo", id);
        this.photo_url = photo_url;
        this.thumbnail_url = thumbnail_url;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param photo_width Width of the photo
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto photoWidth(int photo_width) {
        this.photo_width = photo_width;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

    /**
     * Optional
     * @param photo_height Height of the photo
     * @return {@link InlineQueryResultPhoto}
     */
    public InlineQueryResultPhoto photoHeight(int photo_height) {
        this.photo_height = photo_height;
        return this;
    }

}
