package io.github.natanimn.telebof.types.gift_and_giveaway;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object describes the types of gifts that can be gifted to a user or a chat.
 * @param unlimitedGifts True, if unlimited regular gifts are accepted
 * @param limitedGifts True, if limited regular gifts are accepted
 * @param uniqueGifts True, if unique gifts or gifts that can be upgraded to unique for free are accepted
 * @param premiumSubscription True, if a Telegram Premium subscription is accepted
 * @author Natanim
 * @since 19 August 2025
 * @version 1.2.4
 */
public record AcceptedGiftTypes(
        @SerializedName("unlimited_gifts") Boolean unlimitedGifts,
        @SerializedName("limited_gifts") Boolean limitedGifts,
        @SerializedName("unique_gifts") Boolean uniqueGifts,
        @SerializedName("premium_subscription") Boolean premiumSubscription
) implements Serializable {

    /**
     * Creates a new AcceptedGiftTypes builder
     */
    public static AcceptedGiftTypesBuilder builder() {
        return new AcceptedGiftTypesBuilder();
    }

    /**
     * Builder class for AcceptedGiftTypes
     */
    public static class AcceptedGiftTypesBuilder {
        private Boolean unlimitedGifts;
        private Boolean limitedGifts;
        private Boolean uniqueGifts;
        private Boolean premiumSubscription;

        public AcceptedGiftTypesBuilder unlimitedGifts(Boolean unlimitedGifts) {
            this.unlimitedGifts = unlimitedGifts;
            return this;
        }

        public AcceptedGiftTypesBuilder limitedGifts(Boolean limitedGifts) {
            this.limitedGifts = limitedGifts;
            return this;
        }

        public AcceptedGiftTypesBuilder uniqueGifts(Boolean uniqueGifts) {
            this.uniqueGifts = uniqueGifts;
            return this;
        }

        public AcceptedGiftTypesBuilder premiumSubscription(Boolean premiumSubscription) {
            this.premiumSubscription = premiumSubscription;
            return this;
        }

        public AcceptedGiftTypes build() {
            return new AcceptedGiftTypes(
                    unlimitedGifts,
                    limitedGifts,
                    uniqueGifts,
                    premiumSubscription
            );
        }
    }
}