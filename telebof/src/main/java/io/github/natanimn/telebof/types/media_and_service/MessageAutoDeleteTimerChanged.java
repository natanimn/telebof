package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a service message about a change in auto-delete timer settings.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class MessageAutoDeleteTimerChanged {
    /**
     * New auto-delete time for messages in the chat; in seconds
     */
    @SerializedName("message_auto_delete_time")
    private Integer messageAutoDeleteTime;

}