package io.github.natanimn.telebof.types.suggested;

import java.io.Serializable;

/**
 * Contains parameters of a post that is being suggested by the bot.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public class SuggestedPostParameters implements Serializable{
    /**
     * Optional.
     * Proposed price for the post. If the field is omitted, then the post is unpaid.
     */
    private SuggestedPostPrice price;

    /**
     * Optional.
     * Proposed send date of the post. If specified, then the date must be between 300 second and 2678400 seconds (30 days) in the future.
     * If the field is omitted, then the post can be published at any time within 30 days at the sole discretion of the user who approves it.
     */
    private Long date;

    public SuggestedPostPrice getPrice() {
        return price;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setPrice(SuggestedPostPrice price) {
        this.price = price;
    }
}