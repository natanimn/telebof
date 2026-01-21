package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the failed approval of a suggested post.
 * Currently, only caused by insufficient user funds at the time of approval.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public class SuggestedPostApprovalFailed {
    /**
     * Optional.
     * Message containing the suggested post whose approval has failed.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @SerializedName("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Expected price of the post
     */
    private SuggestedPostPrice price;

    public Message getSuggestedPostMessage() {
        return suggestedPostMessage;
    }

    public SuggestedPostPrice getPrice() {
        return price;
    }
}