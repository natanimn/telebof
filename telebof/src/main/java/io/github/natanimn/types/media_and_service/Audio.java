package io.github.natanimn.types.media_and_service;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class Audio {
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
     * Optional. Performer of the audio as defined by the sender or by audio tags
     */
    public String performer;

    /**
     * Optional. Title of the audio as defined by the sender or by audio tags
     */
    public String title;

    /**
     * Optional. Original filename as defined by the sender
     */
    public String file_name;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    public String mime_type;

    /**
     * Duration of the audio in seconds as defined by the sender
     */
    public Integer duration;

    /**
     * Optional. File size in bytes.
     */
    public Long file_size;

    /**
     * Optional. Thumbnail of the album cover to which the music file belongs
     */
    public PhotoSize thumbnail;
}
