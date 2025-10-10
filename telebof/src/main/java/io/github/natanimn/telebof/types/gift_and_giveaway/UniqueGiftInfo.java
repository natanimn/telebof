package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a service message about a unique gift that was sent or received.
 * @param gift Information about the gift
 * @param origin Origin of the gift. Currently, either "upgrade" for gifts upgraded from regular gifts, "transfer" for gifts transferred from other users or channels, or "resale" for gifts bought from other users
 * @param lastResaleStarCount Optional. For gifts bought from other users, the price paid for the gift
 * @param ownedGiftId Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
 * @param transferStarCount Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift
 * @param nextTransferDate Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record UniqueGiftInfo(
        UniqueGift gift,
        String origin,
        @SerializedName("last_resale_star_count") Integer lastResaleStarCount,
        @SerializedName("owned_gift_id") String ownedGiftId,
        @SerializedName("transfer_star_count") Integer transferStarCount,
        @SerializedName("next_transfer_date") Integer nextTransferDate
) {}