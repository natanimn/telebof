package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.io.Serializable;

/**
 * Represents a general file to be sent.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9.4
 */
public class InputMediaDocument extends InputMediaBuilder<InputMediaDocument> {
    private String thumbnail;
    private Boolean disable_content_type_detection;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended) or
     *             pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaDocument(String media) {
        super("document", media);
    }

    /**
     * Required
     * @param media File to send. Pass a {@link File} to upload from you local machine
     */
    public InputMediaDocument(File media) {
        super("document", media);
    }

    /**
     * Optional
     * @param thumbnail  Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                   The thumbnail should be in JPEG format and less than 200 kB in size.
     *                   A thumbnail's width and height should not exceed 320.
     * @return {@link InputMediaDocument}
     */
    public InputMediaDocument thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setHasFile(true);
        addFiles(thumbnail);
        return this;
    }

    /**
     * Optional
     * @param disable_content_type_detection Disables automatic server-side content type detection for files uploaded using multipart/form-data({@link #InputMediaDocument(File)}.
     *                                       Always True, if the document is sent as part of an album.
     * @return {@link InputMediaDocument}
     */
    public InputMediaDocument disableContentTypeDetection(boolean disable_content_type_detection) {
        this.disable_content_type_detection = disable_content_type_detection;
        return this;
    }

}
