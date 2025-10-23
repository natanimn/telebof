package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a photo to be sent.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param hasSpoiler Optional. Pass True if the photo needs to be covered with a spoiler animation
 * @param caption Optional. Caption of the photo to be sent, 0-1024 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the photo caption
 * @param captionEntities Optional. List of special entities that appear in the caption
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputMediaPhoto(
        String media,
        @SerializedName("has_spoiler") Boolean hasSpoiler,
        String caption,
        @SerializedName("parse_mode") String parseMode,
        @SerializedName("caption_entities") MessageEntity[] captionEntities,
        List<File> files
) implements InputMediaInt {

    @Override
    public String type() {
        return "photo";
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
     * Creates a new InputMediaPhoto builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputMediaPhotoBuilder builder(String media) {
        return new InputMediaPhotoBuilder(media);
    }

    /**
     * Creates a new InputMediaPhoto builder
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public static InputMediaPhotoBuilder builder(File media) {
        return new InputMediaPhotoBuilder(media);
    }

    /**
     * Builder class for InputMediaPhoto
     */
    public static class InputMediaPhotoBuilder {
        private String media;
        private Boolean hasSpoiler;
        private String caption;
        private String parseMode;
        private MessageEntity[] captionEntities;
        private List<File> files = new ArrayList<>();

        public InputMediaPhotoBuilder(String media) {
            this.media = media;
        }

        public InputMediaPhotoBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputMediaPhotoBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaPhotoBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public InputMediaPhotoBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputMediaPhotoBuilder captionEntities(MessageEntity[] captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        public InputMediaPhoto build() {
            return new InputMediaPhoto(
                    media, hasSpoiler, caption, parseMode, captionEntities, files
            );
        }
    }
}