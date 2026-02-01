package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a service message about a unique gift that was sent or received.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class UniqueGiftInfo {
    /**
     * Information about the gift
     */
    private UniqueGift gift;

    /**
     * Origin of the gift. Currently, either "upgrade" for gifts upgraded from regular gifts, "transfer" for gifts transferred from other users or channels, or "resale" for gifts bought from other users
     */
    private String origin;

    /**
     * Optional. For gifts bought from other users, the currency in which the payment for the gift was done.
     * Currently, one of “XTR” for Telegram Stars or “TON” for toncoins.
     */
    @SerializedName("last_resale_currency")
    private String lastResaleCurrency;

    /**
     * Optional. For gifts bought from other users, the price paid for the gift in either Telegram Stars or nanotoncoins
     */
    @SerializedName("last_resale_amount")
    private Integer lastResaleAmount;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    @SerializedName("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift
     */
    @SerializedName("transfer_star_count")
    private Integer transferStarCount;

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now
     */
    @SerializedName("next_transfer_date")
    private Integer nextTransferDate;

    public UniqueGift getGift() {
        return gift;
    }

    public String getOrigin() {
        return origin;
    }

    public String getLastResaleCurrency() {
        return lastResaleCurrency;
    }

    public Integer getLastResaleAmount() {
        return lastResaleAmount;
    }

    public String getOwnedGiftId() {
        return ownedGiftId;
    }

    public Integer getTransferStarCount() {
        return transferStarCount;
    }

    public Integer getNextTransferDate() {
        return nextTransferDate;
    }
}