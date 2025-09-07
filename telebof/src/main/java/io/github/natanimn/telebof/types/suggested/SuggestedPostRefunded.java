package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;

/**
 * This object represents a service message about a payment refund for a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostRefunded {
    /**
     * Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message suggested_post_message;

    /**
     * Reason for the refund. Currently, one of "post_deleted" if the post was deleted within 24 hours of being posted or removed from scheduled messages without being posted, or "payment_refunded" if the payer refunded their payment.
     */
    public String reason;
}