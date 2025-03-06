package io.github.natanimn.types;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputPaidMediaVideo implements InputPaidMedia{
    private String type;
    private String media;
    private transient boolean isFile, hasThumbnailFile;
    private transient InputFile inputFile, thumbnailFile;
    private String thumbnail;
    private Integer width, height, duration;
    private Boolean supports_streaming;

    public InputPaidMediaVideo(String media){
        this.type = "video";
        this.media = media;
        this.isFile = false;
    }
    public InputPaidMediaVideo(File media){
        this.type = "video";
        this.media = "attach://"+media.getName();
        this.isFile = true;
        this.inputFile = new InputFile(media, MediaContentType.VIDEO);
    }

    public void thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        this.thumbnailFile = new InputFile(thumbnail, MediaContentType.PHOTO);
        this.hasThumbnailFile = true;
    }

    public void thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        this.hasThumbnailFile = false;
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

    @Override
    public InputFile getThumbnailFile() {
        return thumbnailFile;
    }

    @Override
    public boolean hasThumbnailFile() {
        return hasThumbnailFile;
    }

    @Override
    public InputFile getInputFile() {
        return inputFile;
    }

    @Override
    public boolean isFile() {
        return isFile;
    }
}
