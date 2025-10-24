package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an audio file to be treated as music to be sent.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param thumbnail Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
 * @param performer Optional. Performer of the audio
 * @param title Optional. Title of the audio
 * @param duration Optional. Duration of the audio in seconds
 * @param hasSpoiler Optional. Pass True if the audio needs to be covered with a spoiler animation
 * @param caption Optional. Caption of the audio to be sent, 0-1024 characters after entities parsing
 * @param parseMode Optional. Mode for parsing entities in the audio caption
 * @param captionEntities Optional. List of special entities that appear in the caption
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputMediaAudio(
        String media,
        String thumbnail,
        String performer,
        String title,
        Integer duration,
        @SerializedName("has_spoiler") Boolean hasSpoiler,
        String caption,
        @SerializedName("parse_mode") ParseMode parseMode,
        @SerializedName("caption_entities") MessageEntity[] captionEntities,
        List<File> files
) implements InputMediaInt{

    @Override
    public String type() {
        return "audio";
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
     * Creates a new InputMediaAudio builder
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputMediaAudioBuilder builder(String media) {
        return new InputMediaAudioBuilder(media);
    }

    /**
     * Creates a new InputMediaAudio builder
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public static InputMediaAudioBuilder builder(File media) {
        return new InputMediaAudioBuilder(media);
    }

    /**
     * Builder class for InputMediaAudio
     */
    public static class InputMediaAudioBuilder {
        private String media;
        private String thumbnail;
        private String performer;
        private String title;
        private Integer duration;
        private Boolean hasSpoiler;
        private String caption;
        private ParseMode parseMode;
        private MessageEntity[] captionEntities;
        private List<File> files = new ArrayList<>();

        public InputMediaAudioBuilder(String media) {
            this.media = media;
        }

        public InputMediaAudioBuilder(File media) {
            this.media = "attach://" + media.getName();
            this.files.add(media);
        }

        public InputMediaAudioBuilder thumbnail(File thumbnail) {
            this.thumbnail = "attach://" + thumbnail.getName();
            this.files.add(thumbnail);
            return this;
        }

        public InputMediaAudioBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public InputMediaAudioBuilder performer(String performer) {
            this.performer = performer;
            return this;
        }

        public InputMediaAudioBuilder title(String title) {
            this.title = title;
            return this;
        }

        public InputMediaAudioBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public InputMediaAudioBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaAudioBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public InputMediaAudioBuilder parseMode(ParseMode parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputMediaAudioBuilder captionEntities(MessageEntity[] captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        public InputMediaAudio build() {
            return new InputMediaAudio(
                    media, thumbnail, performer, title, duration, hasSpoiler,
                    caption, parseMode, captionEntities, files
            );
        }
    }
}