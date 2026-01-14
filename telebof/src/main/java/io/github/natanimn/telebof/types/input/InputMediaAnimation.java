package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputMediaAnimation implements InputMediaInt {

    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
     */
    private String media;

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    private String thumbnail;

    /**
     * Optional. Animation width
     */
    private Integer width;

    /**
     * Optional. Animation height
     */
    private Integer height;

    /**
     * Optional. Animation duration in seconds
     */
    private Integer duration;

    /**
     * Optional. Pass True if the animation needs to be covered with a spoiler animation
     */
    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * Optional. Caption of the animation to be sent, 0-1024 characters after entities parsing
     */
    private String caption;

    /**
     * Optional. Mode for parsing entities in the animation caption
     */
    @SerializedName("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in the caption
     */
    @SerializedName("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * List of files to be uploaded
     */
    transient private List<File> files;

    /**
     * Constructor for InputMediaAnimation with String media
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
     */
    public InputMediaAnimation(String media) {
        this.type = "animation";
        this.media = media;
        this.files = new ArrayList<>();
    }

    /**
     * Constructor for InputMediaAnimation with File media
     * @param media File to send.
     */
    public InputMediaAnimation(File media) {
        this.type = "animation";
        this.media = "attach://" + media.getName();
        this.files = new ArrayList<>();
        this.files.add(media);
    }

    public void setCaptionEntities(MessageEntity[] captionEntities) {
        this.captionEntities = List.of(captionEntities);
    }

    public void setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean hasFile() {
        return files != null && !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }
}