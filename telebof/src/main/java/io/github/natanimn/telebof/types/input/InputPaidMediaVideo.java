package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a video.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputPaidMediaVideo implements InputPaidMedia {
    private final String type = "video";
    private String media;
    private String thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;

    @SerializedName("supports_streaming")
    private Boolean supportsStreaming;

    private String cover;

    @SerializedName("start_timestamp")
    private Integer startTimestamp;

    transient private final List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputPaidMediaVideo(String media) {
        this.media = media;
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputPaidMediaVideo(File media) {
        this.media = "attach://" + media.getName();
        this.files.add(media);
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    public InputPaidMediaVideo setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail file to upload from your local machine
     */
    public InputPaidMediaVideo setThumbnail(File thumbnail) {
        this.thumbnail = "attach://" + thumbnail.getName();
        this.files.add(thumbnail);
        return this;
    }

    /**
     * Optional.
     * @param width Video width
     */
    public InputPaidMediaVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional.
     * @param height Video height
     */
    public InputPaidMediaVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional.
     * @param duration Video duration in seconds
     */
    public InputPaidMediaVideo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional.
     * @param supportsStreaming Pass True if the uploaded video is suitable for streaming
     */
    public InputPaidMediaVideo setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }

    /**
     * Optional.
     * @param cover Cover for the video in the message.
     */
    public InputPaidMediaVideo setCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * Optional.
     * @param cover Cover file to upload from your local machine
     */
    public InputPaidMediaVideo setCover(File cover) {
        this.cover = "attach://" + cover.getName();
        this.files.add(cover);
        return this;
    }

    /**
     * Optional.
     * @param startTimestamp Start timestamp for the video in the message
     */
    public InputPaidMediaVideo setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    @Override
    public boolean hasFile() {
        return !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }
}