package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via {@link BotContext#downloadFile}
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling {@link BotContext#getFile(String)}.
 * <br><br>
 * <i>The maximum file size to download is 20 MB</i>
 * @author Natanim
 * @since 0.1
 */
@Getter
public class File implements JsonFormatter {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @SerializedName("file_id")
    private String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @SerializedName("file_unique_id")
    private String fileUniqueId;

    /**
     * Optional. File path. Use {@link BotContext#downloadFile} to get the file.
     */
    @SerializedName("file_path")
    private String filePath;

    /**
     * Optional. File size in bytes.
     */
    @SerializedName("file_size")
    private Long fileSize;

}