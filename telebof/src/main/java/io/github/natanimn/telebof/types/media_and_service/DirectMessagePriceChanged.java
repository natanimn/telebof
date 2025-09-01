package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents a service message about a change in the price of direct messages sent to a channel chat.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 */
public class DirectMessagePriceChanged {
    /**
     * True, if direct messages are enabled for the channel chat; false otherwise
     */
    public Boolean are_direct_messages_enabled;

    /**
     * Optional. The new number of Telegram Stars that must be paid by users for each direct message sent to the channel.
     * Does not apply to users who have been exempted by administrators. Defaults to 0.
     */
    public Integer direct_message_star_count;
}