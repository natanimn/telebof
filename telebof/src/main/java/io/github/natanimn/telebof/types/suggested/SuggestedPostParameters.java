package io.github.natanimn.telebof.types.suggested;

import java.io.Serializable;

/**
 * Contains parameters of a post that is being suggested by the bot.
 * @param price Optional. Proposed price for the post. If the field is omitted, then the post is unpaid.
 * @param date Optional. Proposed send date of the post. If specified, then the date must be between 300 second and 2678400 seconds (30 days) in the future. If the field is omitted, then the post can be published at any time within 30 days at the sole discretion of the user who approves it.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public record SuggestedPostParameters(
        SuggestedPostPrice price,
        Integer date
) implements Serializable {

    /**
     * Creates a new SuggestedPostParameters builder
     */
    public static SuggestedPostParametersBuilder builder() {
        return new SuggestedPostParametersBuilder();
    }

    /**
     * Builder class for SuggestedPostParameters
     */
    public static class SuggestedPostParametersBuilder {
        private SuggestedPostPrice price;
        private Integer date;

        public SuggestedPostParametersBuilder price(SuggestedPostPrice price) {
            this.price = price;
            return this;
        }

        public SuggestedPostParametersBuilder date(Integer date) {
            this.date = date;
            return this;
        }

        public SuggestedPostParameters build() {
            return new SuggestedPostParameters(price, date);
        }
    }
}