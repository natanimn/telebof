package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes why a request was unsuccessful.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ResponseParameters {
    /**
     * Optional.
     * The group has been migrated to a supergroup with the specified identifier.
     */
    @SerializedName("migrate_to_chat_id")
    private Long migrateToChatId;

    /**
     * Optional.
     * In case of exceeding flood control, the number of seconds left to wait before the request can be repeated
     */
    @SerializedName("retry_after")
    private Integer retryAfter;

}