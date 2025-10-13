package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a change in auto-delete timer settings.
 * @param messageAutoDeleteTime New auto-delete time for messages in the chat; in seconds
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MessageAutoDeleteTimerChanged(
        @SerializedName("message_auto_delete_time") Integer messageAutoDeleteTime
) {}