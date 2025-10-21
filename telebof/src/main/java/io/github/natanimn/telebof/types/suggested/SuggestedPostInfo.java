package io.github.natanimn.telebof.types.suggested;

import com.google.gson.annotations.SerializedName;

/**
 * Contains information about a suggested post.
 * @param state State of the suggested post. Currently, it can be one of "pending", "approved", "declined".
 * @param price Optional. Proposed price of the post. If the field is omitted, then the post is unpaid.
 * @param sendDate Optional. Proposed send date of the post. If the field is omitted, then the post can be published at any time within 30 days at the sole discretion of the user or administrator who approves it.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public record SuggestedPostInfo(
        String state,
        SuggestedPostPrice price,
        @SerializedName("send_date") Integer sendDate
) {}