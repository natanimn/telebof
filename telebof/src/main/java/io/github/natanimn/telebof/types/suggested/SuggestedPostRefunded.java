package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a payment refund for a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public class SuggestedPostRefunded {
    /**
     * Optional.
     * Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @SerializedName("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Reason for the refund. Currently, one of "post_deleted" if the post was deleted within 24 hours of being posted or removed from scheduled messages without being posted, or "payment_refunded" if the payer refunded their payment.
     */
    private String reason;

    public Message getSuggestedPostMessage() {
        return suggestedPostMessage;
    }

    public String getReason() {
        return reason;
    }
}