package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a general file to be sent.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended) or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param thumbnail Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
 * @param disableContentTypeDetection Optional. Disables automatic server-side content type detection for files uploaded using multipart/form-data. Always True, if the document is sent as part of an album.
 * @param caption Optional. Caption of the document to be sent, 0-1024 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the document caption
 * @param captionEntities Optional. List of special entities that appear in the caption
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputMediaDocument(
        String media,
        String thumbnail,
        @SerializedName("disable_content_type_detection") Boolean disableContentTypeDetection,
        String caption,
        @SerializedName("parse_mode") String parseMode,
        @SerializedName("caption_entities") MessageEntity[] captionEntities,
        List<File> files
) implements InputMediaInt {

    @Override
    public String type() {
        return "document";
    }

    @Override
    public boolean hasFile() {
        return files != null && !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    /**
     * Creates a new InputMediaDocument builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended) or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputMediaDocumentBuilder builder(String media) {
        return new InputMediaDocumentBuilder(media);
    }

    /**
     * Creates a new InputMediaDocument builder
     * @param media File to send. Pass a File to upload from your local machine
     */
    public static InputMediaDocumentBuilder builder(File media) {
        return new InputMediaDocumentBuilder(media);
    }

    /**
     * Builder class for InputMediaDocument
     */
    public static class InputMediaDocumentBuilder {
        private String media;
        private String thumbnail;
        private Boolean disableContentTypeDetection;
        private String caption;
        private String parseMode;
        private MessageEntity[] captionEntities;
        private List<File> files = new ArrayList<>();

        public InputMediaDocumentBuilder(String media) {
            this.media = media;
        }

        public InputMediaDocumentBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputMediaDocumentBuilder thumbnail(File thumbnail) {
            this.thumbnail = "attach://" + thumbnail.getName();
            this.files.add(thumbnail);
            return this;
        }

        public InputMediaDocumentBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public InputMediaDocumentBuilder disableContentTypeDetection(Boolean disableContentTypeDetection) {
            this.disableContentTypeDetection = disableContentTypeDetection;
            return this;
        }

        public InputMediaDocumentBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public InputMediaDocumentBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputMediaDocumentBuilder captionEntities(MessageEntity[] captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        public InputMediaDocument build() {
            return new InputMediaDocument(
                    media, thumbnail, disableContentTypeDetection,
                    caption, parseMode, captionEntities, files
            );
        }
    }
}