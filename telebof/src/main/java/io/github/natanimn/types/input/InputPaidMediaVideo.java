package io.github.natanimn.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
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

    public InputPaidMediaVideo(String media){
        this.type = "video";
        this.media = media;
        this.hasFile = false;
    }

    public InputPaidMediaVideo(File media){
        this.type = "video";
        this.media = "attach://"+media.getName();
        this.hasFile = true;
        this.files.add(media);
    }

    public void thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        this.hasFile = true;
        this.files.add(thumbnail);

    }

    public void thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void width(Integer width) {
        this.width = width;
    }

    public void height(Integer height) {
        this.height = height;
    }

    public void duration(Integer duration) {
        this.duration = duration;
    }

    public void supportsStreaming(Boolean supports_streaming) {
        this.supports_streaming = supports_streaming;
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

    @Override
    public boolean hasFile() {
        return hasFile;
    }

    @Override
    public List<File> getFiles() {
        return files;
    }
}
