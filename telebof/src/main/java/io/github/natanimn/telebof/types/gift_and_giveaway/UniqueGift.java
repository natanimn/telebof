package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes a unique gift that was upgraded from a regular gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class UniqueGift {

    /**
     * Identifier of the regular gift from which the gift was upgraded
     */
    @SerializedName("gift_id")
    private String giftId;

    /**
     * Human-readable name of the regular gift from which this unique gift was upgraded
     */
    @SerializedName("base_name")
    private String baseName;

    /**
     * Unique name of the gift. This name can be used in https://t.me/nft/... links and story areas
     */
    private String name;

    /**
     * Unique number of the upgraded gift among gifts upgraded from the same regular gift
     */
    private Integer number;

    /**
     * Model of the gift
     */
    private UniqueGiftModel model;

    /**
     * Symbol of the gift
     */
    private UniqueGiftSymbol symbol;

    /**
     * Backdrop of the gift
     */
    private UniqueGiftBackdrop backdrop;

    /**
     * Optional. Information about the chat that published the gift
     */
    @SerializedName("publisher_chat")
    private Chat publisherChat;

    /**
     * Optional. True, if the gift is assigned from the TON blockchain and can't be resold or transferred in Telegram
     */
    @SerializedName("is_from_blockchain")
    private Boolean isFromBlockchain;

    /**
     * Optional. True, if the original regular gift was exclusively purchaseable by Telegram Premium subscribers
     */
    @SerializedName("is_premium")
    private Boolean isPremium;

    /**
     * Optional. The color scheme that can be used by the gift's owner for the chat's name, replies to messages and link previews;
     * for business account gifts and gifts that are currently on sale only
     */
    private UniqueGiftColors colors;

    public String getGiftId() {
        return giftId;
    }

    public String getBaseName() {
        return baseName;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public UniqueGiftModel getModel() {
        return model;
    }

    public UniqueGiftSymbol getSymbol() {
        return symbol;
    }

    public UniqueGiftBackdrop getBackdrop() {
        return backdrop;
    }

    public Chat getPublisherChat() {
        return publisherChat;
    }

    public Boolean getIsFromBlockchain() {
        return isFromBlockchain;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public UniqueGiftColors getColors() {
        return colors;
    }
}