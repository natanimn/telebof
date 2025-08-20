package io.github.natanimn.telebof.types.gift_and_giveaway;

/**
 * Describes a service message about a unique gift that was sent or received.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class UniqueGiftInfo {
    /**
     * Information about the gift
     */
    public UniqueGift gift;

    /**
     * Origin of the gift. Currently, either "upgrade" for gifts upgraded from regular gifts, "transfer" for gifts transferred from other users or channels, or "resale" for gifts bought from other users
     */
    public String origin;

    /**
     * Optional. For gifts bought from other users, the price paid for the gift
     */
    public Integer last_resale_star_count;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    public String owned_gift_id;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift
     */
    public Integer transfer_star_count;

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now
     */
    public Integer next_transfer_date;
}