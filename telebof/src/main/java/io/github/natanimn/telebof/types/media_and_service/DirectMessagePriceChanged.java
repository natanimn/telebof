package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a change in the price of direct messages sent to a channel chat.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class DirectMessagePriceChanged {
    /**
     * True, if direct messages are enabled for the channel chat; false otherwise
     */
    @SerializedName("are_direct_messages_enabled")
    private Boolean areDirectMessagesEnabled;

    /**
     * Optional. The new number of Telegram Stars that must be paid by users for each direct message sent to the channel.
     * Does not apply to users who have been exempted by administrators. Defaults to 0.
     */
    @SerializedName("direct_message_star_count")
    private Integer directMessageStarCount;

    public Boolean getAreDirectMessagesEnabled() {
        return areDirectMessagesEnabled;
    }

    public Integer getDirectMessageStarCount() {
        return directMessageStarCount;
    }
}