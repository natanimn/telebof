package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;

/**
 * This object represents a service message about the approval of a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostApproved {
    /**
     * Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message suggested_post_message;

    /**
     * Optional. Amount paid for the post
     */
    public SuggestedPostPrice price;

    /**
     * Date when the post will be published
     */
    public Integer send_date;
}