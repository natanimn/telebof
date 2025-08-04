package io.github.natanimn.types.media_and_service;

import java.util.List;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class Video{

    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    public String file_id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    public String file_unique_id;

    /**
     * Video width as defined by the sender
     */
    public Integer width;

    /**
     * Video height as defined by the sender
     */
    public Integer height;

    /**
     * Duration of the video in seconds as defined by the sender
     */
    public Integer duration;

    /**
     * Original filename as defined by the sender
     */
    public String file_name;

    /**
     *  MIME type of the file as defined by the sender
     */
    public String mime_type;

    /**
     * File size in bytes.
     */
    public Integer file_size;

    /**
     * Video thumbnail
     */
    public PhotoSize thumbnail;

    /**
     * Timestamp in seconds from which the video will play in the message
     */
    public Integer start_timestamp;

    /**
     * Available sizes of the cover of the video in the message
     */
    public List<PhotoSize> cover;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Video video = (Video) object;
        return Objects.equals(file_id, video.file_id) && Objects.equals(file_unique_id, video.file_unique_id) &&
                Objects.equals(file_name, video.file_name) && Objects.equals(mime_type, video.mime_type) &&
                Objects.equals(width, video.width) && Objects.equals(height, video.height) &&
                Objects.equals(duration, video.duration) && Objects.equals(file_size, video.file_size) &&
                Objects.equals(thumbnail, video.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_name, mime_type, width, height, duration, file_size, thumbnail);
    }
}
