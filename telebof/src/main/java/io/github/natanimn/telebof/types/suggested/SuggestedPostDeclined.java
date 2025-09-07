package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;

/**
 * This object represents a service message about the rejection of a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostDeclined {
    /**
     * Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message suggested_post_message;

    /**
     * Optional. Comment with which the post was declined
     */
    public String comment;
}