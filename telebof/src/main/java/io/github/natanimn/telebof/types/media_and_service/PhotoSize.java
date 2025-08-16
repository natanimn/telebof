package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 * @author Natanim
 * @since 3 March 2025
 */
public class PhotoSize {
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
     * Photo width
     */
    public Integer width;

    /**
     * Photo height
     */
    public Integer height;

    /**
     * Optional. File size in bytes
     */
    public Integer file_size;

}
