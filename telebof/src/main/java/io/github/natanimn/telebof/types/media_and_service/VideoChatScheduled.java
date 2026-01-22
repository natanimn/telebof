package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a video chat scheduled in the chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class VideoChatScheduled {
    /**
     * Point in time (Unix timestamp) when the video chat is supposed to be started by a chat administrator
     */
    @SerializedName("start_date")
    private Integer startDate;

    public Integer getStartDate() {
        return startDate;
    }
}