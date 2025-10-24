package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
 * @param thumbnail Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
 * @param width Optional. Animation width
 * @param height Optional. Animation height
 * @param duration Optional. Animation duration in seconds
 * @param hasSpoiler Optional. Pass True if the animation needs to be covered with a spoiler animation
 * @param caption Optional. Caption of the animation to be sent, 0-1024 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the animation caption
 * @param captionEntities Optional. List of special entities that appear in the caption
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputMediaAnimation(
        String media,
        String thumbnail,
        Integer width,
        Integer height,
        Integer duration,
        @SerializedName("has_spoiler") Boolean hasSpoiler,
        String caption,
        @SerializedName("parse_mode") ParseMode parseMode,
        @SerializedName("caption_entities") MessageEntity[] captionEntities,
        List<File> files
) implements InputMediaInt {

    @Override
    public String type() {
        return "animation";
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
     * Creates a new InputMediaAnimation builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
     */
    public static InputMediaAnimationBuilder builder(String media) {
        return new InputMediaAnimationBuilder(media);
    }

    /**
     * Creates a new InputMediaAnimation builder
     * @param media File to send.
     */
    public static InputMediaAnimationBuilder builder(File media) {
        return new InputMediaAnimationBuilder(media);
    }

    /**
     * Builder class for InputMediaAnimation
     */
    public static class InputMediaAnimationBuilder {
        private String media;
        private String thumbnail;
        private Integer width;
        private Integer height;
        private Integer duration;
        private Boolean hasSpoiler;
        private String caption;
        private ParseMode parseMode;
        private MessageEntity[] captionEntities;
        private List<File> files = new ArrayList<>();

        public InputMediaAnimationBuilder(String media) {
            this.media = media;
        }

        public InputMediaAnimationBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputMediaAnimationBuilder thumbnail(File thumbnail) {
            this.thumbnail = "attach://" + thumbnail.getName();
            this.files.add(thumbnail);
            return this;
        }

        public InputMediaAnimationBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public InputMediaAnimationBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        public InputMediaAnimationBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        public InputMediaAnimationBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public InputMediaAnimationBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaAnimationBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public InputMediaAnimationBuilder parseMode(ParseMode parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputMediaAnimationBuilder captionEntities(MessageEntity[] captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        public InputMediaAnimation build() {
            return new InputMediaAnimation(
                    media, thumbnail, width, height, duration, hasSpoiler,
                    caption, parseMode, captionEntities, files
            );
        }
    }
}