package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the approval of a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public class SuggestedPostApproved {
    /**
     * Optional.
     * Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @SerializedName("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Optional.
     * Amount paid for the post
     */
    private SuggestedPostPrice price;

    /**
     * Date when the post will be published
     */
    @SerializedName("send_date")
    private Integer sendDate;

    public Message getSuggestedPostMessage() {
        return suggestedPostMessage;
    }

    public SuggestedPostPrice getPrice() {
        return price;
    }

    public Integer getSendDate() {
        return sendDate;
    }
}