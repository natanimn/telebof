package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.payments.StarAmount;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * This object represents a service message about a successful payment for a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostPaid {
    /**
     * Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message suggested_post_message;

    /**
     * Currency in which the payment was made. Currently, one of "XTR" for Telegram Stars or "TON" for toncoins
     */
    public String currency;

    /**
     * Optional. The amount of the currency that was received by the channel in nanotoncoins; for payments in toncoins only
     */
    public Integer amount;

    /**
     * Optional. The amount of Telegram Stars that was received by the channel; for payments in Telegram Stars only
     */
    public StarAmount star_amount;
}