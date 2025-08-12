package io.github.natanimn.types.media_and_service;


/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via {@link io.github.natanimn.BotContext#downloadFile}
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling {@link io.github.natanimn.BotContext#getFile(String)}.
 * <br><br>
 * <i>The maximum file size to download is 20 MB</i>
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class File {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    public String file_id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    public String file_unique_id;

    /**(String)
     * Optional. File path. Use {@link io.github.natanimn.BotContext#downloadFile} to get the file.
     */
    public String file_path;

    /**
     * Optional. File size in bytes.
     */
    public Long file_size;

}
