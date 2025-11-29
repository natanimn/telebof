package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes a service message about a regular gift that was sent or received.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class GiftInfo {
    /**
     * Information about the gift
     */
    private Gift gift;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    @SerializedName("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver by converting the gift; omitted if conversion to Telegram Stars is impossible
     */
    @SerializedName("convert_star_count")
    private Integer convertStarCount;

    /**
     * Optional. Number of Telegram Stars that were prepaid by the sender for the ability to upgrade the gift
     */
    @SerializedName("prepaid_upgrade_star_count")
    private Integer prepaidUpgradeStarCount;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift
     */
    @SerializedName("can_be_upgraded")
    private Boolean canBeUpgraded;

    /**
     * Optional. Text of the message that was added to the gift
     */
    private String text;

    /**
     * Optional. Special entities that appear in the text
     */
    private List<MessageEntity> entities;

    /**
     * Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them
     */
    @SerializedName("is_private")
    private Boolean isPrivate;

    public Gift getGift() {
        return gift;
    }

    public String getOwnedGiftId() {
        return ownedGiftId;
    }

    public Integer getConvertStarCount() {
        return convertStarCount;
    }

    public Integer getPrepaidUpgradeStarCount() {
        return prepaidUpgradeStarCount;
    }

    public Boolean getCanBeUpgraded() {
        return canBeUpgraded;
    }

    public String getText() {
        return text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
}