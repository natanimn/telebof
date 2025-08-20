package io.github.natanimn.telebof.types.gift_and_giveaway;


import io.github.natanimn.telebof.types.chat_and_user.Chat;

/**
 * This object describes a unique gift that was upgraded from a regular gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class UniqueGift {
    /**
     * Human-readable name of the regular gift from which this unique gift was upgraded
     */
    public String base_name;

    /**
     * Unique name of the gift. This name can be used in https://t.me/nft/... links and story areas
     */
    public String name;

    /**
     * Unique number of the upgraded gift among gifts upgraded from the same regular gift
     */
    public Integer number;

    /**
     * Model of the gift
     */
    public UniqueGiftModel model;

    /**
     * Symbol of the gift
     */
    public UniqueGiftSymbol symbol;

    /**
     * Backdrop of the gift
     */
    public UniqueGiftBackdrop backdrop;

    /**
     * Optional. Information about the chat that published the gift
     */
    public Chat publisher_chat;
}
