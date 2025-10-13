package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via {@link BotContext#downloadFile}
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling {@link BotContext#getFile(String)}.
 * <br><br>
 * <i>The maximum file size to download is 20 MB</i>
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param filePath Optional. File path. Use {@link BotContext#downloadFile} to get the file.
 * @param fileSize Optional. File size in bytes.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record File(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        @SerializedName("file_path") String filePath,
        @SerializedName("file_size") Long fileSize
) {}