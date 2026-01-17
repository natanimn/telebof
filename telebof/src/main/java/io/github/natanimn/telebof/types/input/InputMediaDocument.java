package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;

/**
 * Represents a general file to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputMediaDocument extends InputMediaBuilder<InputMediaDocument> {
    private String thumbnail;

    @SerializedName("disable_content_type_detection")
    private Boolean disableContentTypeDetection;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended) or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaDocument(String media) {
        super("document", media);
    }

    /**
     * Required
     * @param media File to send. Pass a File to upload from your local machine
     */
    public InputMediaDocument(File media) {
        super("document", media);
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    public InputMediaDocument setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail file to upload from your local machine
     */
    public InputMediaDocument setThumbnail(File thumbnail) {
        this.thumbnail = "attach://" + thumbnail.getName();
        this.files.add(thumbnail);
        return this;
    }

    /**
     * Optional.
     * @param disableContentTypeDetection Disables automatic server-side content type detection for files uploaded using multipart/form-data.
     *                                    Always True, if the document is sent as part of an album.
     */
    public InputMediaDocument setDisableContentTypeDetection(Boolean disableContentTypeDetection) {
        this.disableContentTypeDetection = disableContentTypeDetection;
        return this;
    }
}