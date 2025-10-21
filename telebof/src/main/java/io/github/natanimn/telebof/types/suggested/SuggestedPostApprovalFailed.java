package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the failed approval of a suggested post.
 * Currently, only caused by insufficient user funds at the time of approval.
 * @param suggestedPostMessage Optional. Message containing the suggested post whose approval has failed. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
 * @param price Expected price of the post
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public record SuggestedPostApprovalFailed(
        @SerializedName("suggested_post_message") Message suggestedPostMessage,
        SuggestedPostPrice price
) {}