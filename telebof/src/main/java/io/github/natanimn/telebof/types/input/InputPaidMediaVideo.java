package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a video.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param thumbnail Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
 * @param width Optional. Video width
 * @param height Optional. Video height
 * @param duration Optional. Video duration in seconds
 * @param supportsStreaming Optional. Pass True if the uploaded video is suitable for streaming
 * @param cover Optional. Cover for the video in the message.
 * @param startTimestamp Optional. Start timestamp for the video in the message
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputPaidMediaVideo(
        String media,
        String thumbnail,
        Integer width,
        Integer height,
        Integer duration,
        @SerializedName("supports_streaming") Boolean supportsStreaming,
        String cover,
        @SerializedName("start_timestamp") Integer startTimestamp,
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
     * Creates a new InputPaidMediaVideo builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputPaidMediaVideoBuilder builder(String media) {
        return new InputPaidMediaVideoBuilder(media);
    }

    /**
     * Creates a new InputPaidMediaVideo builder
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public static InputPaidMediaVideoBuilder builder(File media) {
        return new InputPaidMediaVideoBuilder(media);
    }

    /**
     * Builder class for InputPaidMediaVideo
     */
    public static class InputPaidMediaVideoBuilder {
        private String media;
        private String thumbnail;
        private Integer width;
        private Integer height;
        private Integer duration;
        private Boolean supportsStreaming;
        private String cover;
        private Integer startTimestamp;
        private List<File> files = new ArrayList<>();

        public InputPaidMediaVideoBuilder(String media) {
            this.media = media;
        }

        public InputPaidMediaVideoBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputPaidMediaVideoBuilder thumbnail(File thumbnail) {
            this.thumbnail = "attach://" + thumbnail.getName();
            this.files.add(thumbnail);
            return this;
        }

        public InputPaidMediaVideoBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public InputPaidMediaVideoBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        public InputPaidMediaVideoBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        public InputPaidMediaVideoBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public InputPaidMediaVideoBuilder supportsStreaming(Boolean supportsStreaming) {
            this.supportsStreaming = supportsStreaming;
            return this;
        }

        public InputPaidMediaVideoBuilder cover(File cover) {
            this.cover = "attach://" + cover.getName();
            this.files.add(cover);
            return this;
        }

        public InputPaidMediaVideoBuilder cover(String cover) {
            this.cover = cover;
            return this;
        }

        public InputPaidMediaVideoBuilder startTimestamp(Integer startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        public InputPaidMediaVideo build() {
            return new InputPaidMediaVideo(
                    media, thumbnail, width, height, duration, supportsStreaming,
                    cover, startTimestamp, files
            );
        }
    }
}