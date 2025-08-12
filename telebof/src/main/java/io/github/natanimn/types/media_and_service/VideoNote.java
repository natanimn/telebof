package io.github.natanimn.types.media_and_service;

/**
 * This object represents a <a href="https://telegram.org/blog/video-messages-and-telescope">video message</a>
 * (available in Telegram apps as of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>).
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class VideoNote {
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
     * Video width and height (diameter of the video message) as defined by the sender
     */
    public Integer length;

    /**
     * Duration of the video in seconds as defined by the sender
     */
    public Integer duration;

    /**
     * Optional. File size in bytes
     */
    public Integer file_size;

    /**
     * Optional. Video thumbnail
     */
    public PhotoSize thumbnail;

}