package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a video to be sent.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param thumbnail Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
 * @param width Optional. Video width
 * @param height Optional. Video height
 * @param duration Optional. Video duration in seconds
 * @param hasSpoiler Optional. Pass True if the video needs to be covered with a spoiler animation
 * @param supportsStreaming Optional. Pass True if the uploaded video is suitable for streaming
 * @param cover Optional. Cover for the video in the message.
 * @param startTimestamp Optional. Start timestamp for the video in the message
 * @param caption Optional. Caption of the video to be sent, 0-1024 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the video caption
 * @param captionEntities Optional. List of special entities that appear in the caption
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputMediaVideo(
        String media,
        String thumbnail,
        Integer width,
        Integer height,
        Integer duration,
        @SerializedName("has_spoiler") Boolean hasSpoiler,
        @SerializedName("supports_streaming") Boolean supportsStreaming,
        String cover,
        @SerializedName("start_timestamp") Integer startTimestamp,
        String caption,
        @SerializedName("parse_mode") String parseMode,
        @SerializedName("caption_entities") List<MessageEntity> captionEntities,
        List<File> files
) implements InputPaidMedia {

    @Override
    public String type() {
        return "video";
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
     * Creates a new InputMediaVideo builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputMediaVideoBuilder builder(String media) {
        return new InputMediaVideoBuilder(media);
    }

    /**
     * Creates a new InputMediaVideo builder
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public static InputMediaVideoBuilder builder(File media) {
        return new InputMediaVideoBuilder(media);
    }

    /**
     * Builder class for InputMediaVideo
     */
    public static class InputMediaVideoBuilder {
        private String media;
        private String thumbnail;
        private Integer width;
        private Integer height;
        private Integer duration;
        private Boolean hasSpoiler;
        private Boolean supportsStreaming;
        private String cover;
        private Integer startTimestamp;
        private String caption;
        private String parseMode;
        private List<MessageEntity> captionEntities;
        private List<File> files = new ArrayList<>();

        public InputMediaVideoBuilder(String media) {
            this.media = media;
        }

        public InputMediaVideoBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputMediaVideoBuilder thumbnail(File thumbnail) {
            this.thumbnail = "attach://" + thumbnail.getName();
            this.files.add(thumbnail);
            return this;
        }

        public InputMediaVideoBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public InputMediaVideoBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        public InputMediaVideoBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        public InputMediaVideoBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public InputMediaVideoBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaVideoBuilder supportsStreaming(Boolean supportsStreaming) {
            this.supportsStreaming = supportsStreaming;
            return this;
        }

        public InputMediaVideoBuilder cover(File cover) {
            this.cover = "attach://" + cover.getName();
            this.files.add(cover);
            return this;
        }

        public InputMediaVideoBuilder cover(String cover) {
            this.cover = cover;
            return this;
        }

        public InputMediaVideoBuilder startTimestamp(Integer startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        public InputMediaVideoBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public InputMediaVideoBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputMediaVideoBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        public InputMediaVideo build() {
            return new InputMediaVideo(
                    media, thumbnail, width, height, duration, hasSpoiler, supportsStreaming,
                    cover, startTimestamp, caption, parseMode, captionEntities, files
            );
        }
    }
}