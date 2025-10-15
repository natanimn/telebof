package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Describes why a request was unsuccessful.
 * @param migrateToChatId Optional. The group has been migrated to a supergroup with the specified identifier.
 * @param retryAfter Optional. In case of exceeding flood control, the number of seconds left to wait before the request can be repeated
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ResponseParameters(
        @SerializedName("migrate_to_chat_id") Long migrateToChatId,
        @SerializedName("retry_after") Integer retryAfter
) {}