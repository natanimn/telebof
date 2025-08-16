package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a video.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9.4
 */
public class InputPaidMediaVideo implements InputPaidMedia{
    private String type;
    private String media;
    private transient boolean isFile, hasThumbnailFile;
    private String thumbnail;
    private Integer width, height, duration;
    private Boolean supports_streaming;
    private String cover;
    private Integer start_timestamp;

    private transient Boolean hasFile;
    private transient List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputPaidMediaVideo(String media){
        this.type = "video";
        this.media = media;
        this.hasFile = false;
    }

    /**
     * Required
     * @param media File to send. Pass an object of {@link File} to upload from your local machine.
     */
    public InputPaidMediaVideo(File media){
        this.type = "video";
        this.media = "attach://"+media.getName();
        this.hasFile = true;
        this.files.add(media);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320.
     * @return {@link InputPaidMediaVideo}
     */
    public InputPaidMediaVideo thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        this.hasFile = true;
        this.files.add(thumbnail);
        return this;

    }

    /**
     * Optional
     * @param width Video width
     * @return {@link InputPaidMediaVideo}
     */
    public InputPaidMediaVideo width(Integer width) {
        this.width = width;
        return this;
    }


    /**
     * Optional
     * @param height Video height
     * @return {@link InputPaidMediaVideo}
     */
    public InputPaidMediaVideo height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional
     * @param duration Video duration in seconds
     * @return {@link InputPaidMediaVideo}
     */
    public InputPaidMediaVideo duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional
     * @param supports_streaming Pass True if the uploaded video is suitable for streaming
     * @return {@link InputPaidMediaVideo}
     */
    public InputPaidMediaVideo supportsStreaming(Boolean supports_streaming) {
        this.supports_streaming = supports_streaming;
        return this;
    }

    /**
     * Optional
     * @param cover Cover for the video in the message.
     * @return {@link InputMediaVideo}
     */
    public InputPaidMediaVideo cover(File cover){
        this.cover = "attach://"+cover.getName();
        this.hasFile = true;
        this.files.add(cover);
        return this;
    }

    /**
     * Optional
     * @param start_timestamp Start timestamp for the video in the message
     * @return {@link  InputMediaVideo}
     */
    public InputPaidMediaVideo starTimestamp(int start_timestamp){
        this.start_timestamp = start_timestamp;
        return this;
    }

    /**
     * For internal use only
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return hasFile;
    }

    /**
     * For internal use only
     * @return list of files
     */
    @Override
    public List<File> getFiles() {
        return files;
    }
}
