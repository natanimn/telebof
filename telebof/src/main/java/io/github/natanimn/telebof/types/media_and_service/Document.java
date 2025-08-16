package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents a general file (as opposed to {@link PhotoSize}, {@link Voice} and {@link Audio}).
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Document {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    public String file_id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    public String file_unique_id;

    /**
     * Optional. Original filename as defined by the sender
     */
    public String file_name;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    public String mime_type;

    /**
     * Optional. File size in bytes.
     */
    public Long file_size;

    /**
     * Optional. Document thumbnail as defined by the sender
     */
    public PhotoSize thumbnail;
}
