package io.github.natanimn.telebof.types.suggested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Contains information about a suggested post.
 * @author Natanim
 * @since 3 September 2025
 */
@Getter
public class SuggestedPostInfo {
    /**
     * State of the suggested post. Currently, it can be one of "pending", "approved", "declined".
     */
    private String state;

    /**
     * Optional.
     * Proposed price of the post. If the field is omitted, then the post is unpaid.
     */
    private SuggestedPostPrice price;

    /**
     * Optional.
     * Proposed send date of the post. If the field is omitted, then the post can be published at any time within 30 days at the sole discretion of the user or administrator who approves it.
     */
    @SerializedName("send_date")
    private Integer sendDate;

}