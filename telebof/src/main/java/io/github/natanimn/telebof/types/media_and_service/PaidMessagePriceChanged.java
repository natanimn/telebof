package io.github.natanimn.telebof.types.media_and_service;

/**
 * Describes a service message about a change in the price of paid messages within a chat.
 * @author Natanim
 * @since 20 August 2025
 * @version 1.0.0
 */
public class PaidMessagePriceChanged {
    /**
     * The new number of Telegram Stars that must be paid by non-administrator users of the supergroup chat for each sent message
     */
    public Integer paid_message_star_count;
}
