package io.github.natanimn.telebof.types.suggested;

import java.io.Serializable;

/**
 * Contains parameters of a post that is being suggested by the bot.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostParameters implements Serializable {
    private SuggestedPostPrice price;
    private Integer date;

    /**
     * Optional
     * @param price Optional. Proposed price for the post. If the field is omitted, then the post is unpaid.
     */
    public void setPrice(SuggestedPostPrice price) {
        this.price = price;
    }

    /**
     * Optional
     * @param date Optional. Proposed send date of the post.
     *             If specified, then the date must be between 300 second and 2678400 seconds (30 days) in the future.
     *             If the field is omitted, then the post can be published at any time within 30 days at the sole discretion of the user who approves it.
     */
    public void setDate(Integer date) {
        this.date = date;
    }
}
