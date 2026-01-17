package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
/**
 * Represents a video to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputMediaVideo extends InputMediaBuilder<InputMediaVideo> {
    private String thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    @SerializedName("supports_streaming")
    private Boolean supportsStreaming;

    private String cover;

    @SerializedName("start_timestamp")
    private Integer startTimestamp;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaVideo(String media) {
        super("video", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputMediaVideo(File media) {
        super("video", media);
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    public InputMediaVideo setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail file to upload from your local machine
     */
    public InputMediaVideo setThumbnail(File thumbnail) {
        this.thumbnail = "attach://" + thumbnail.getName();
        this.files.add(thumbnail);
        return this;
    }

    /**
     * Optional.
     * @param width Video width
     */
    public InputMediaVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional.
     * @param height Video height
     */
    public InputMediaVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional.
     * @param duration Video duration in seconds
     */
    public InputMediaVideo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional.
     * @param hasSpoiler Pass True if the video needs to be covered with a spoiler animation
     */
    public InputMediaVideo setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    /**
     * Optional.
     * @param supportsStreaming Pass True if the uploaded video is suitable for streaming
     */
    public InputMediaVideo setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }

    /**
     * Optional.
     * @param cover Cover for the video in the message.
     */
    public InputMediaVideo setCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * Optional.
     * @param cover Cover file to upload from your local machine
     */
    public InputMediaVideo setCover(File cover) {
        this.cover = "attach://" + cover.getName();
        this.files.add(cover);
        return this;
    }

    /**
     * Optional.
     * @param startTimestamp Start timestamp for the video in the message
     */
    public InputMediaVideo setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
}