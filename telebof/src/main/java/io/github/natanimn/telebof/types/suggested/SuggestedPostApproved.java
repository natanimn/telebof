package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the approval of a suggested post.
 * @param suggestedPostMessage Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
 * @param price Optional. Amount paid for the post
 * @param sendDate Date when the post will be published
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public record SuggestedPostApproved(
        @SerializedName("suggested_post_message") Message suggestedPostMessage,
        SuggestedPostPrice price,
        @SerializedName("send_date") Integer sendDate
) {}