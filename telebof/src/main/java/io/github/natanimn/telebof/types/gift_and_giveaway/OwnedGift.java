package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object describes a gift received and owned by a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class OwnedGift {
    /**
     * Type of the gift, always "regular" or "unique"
     */
    private String type;

    /**
     * Information about the regular gift (for type "regular")
     */
    private Gift gift;

    /**
     * Information about the unique gift (for type "unique")
     */
    @SerializedName("unique_gift")
    private UniqueGift uniqueGift;

    /**
     * Optional. Unique identifier of the gift for the bot; for gifts received on behalf of business accounts only
     */
    @SerializedName("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Sender of the gift if it is a known user
     */
    @SerializedName("sender_user")
    private User senderUser;

    /**
     * Date the gift was sent in Unix time
     */
    @SerializedName("send_date")
    private Integer sendDate;

    /**
     * Optional. Text of the message that was added to the gift (for regular gifts)
     */
    private String text;

    /**
     * Optional. Special entities that appear in the text (for regular gifts)
     */
    private List<MessageEntity> entities;

    /**
     * Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them (for regular gifts)
     */
    @SerializedName("is_private")
    private Boolean isPrivate;

    /**
     * Optional. True, if the gift is displayed on the account's profile page; for gifts received on behalf of business accounts only
     */
    @SerializedName("is_saved")
    private Boolean isSaved;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift; for gifts received on behalf of business accounts only (for regular gifts)
     */
    @SerializedName("can_be_upgraded")
    private Boolean canBeUpgraded;

    /**
     * Optional. True, if the gift can be transferred to another owner; for gifts received on behalf of business accounts only (for unique gifts)
     */
    @SerializedName("can_be_transferred")
    private Boolean canBeTransferred;

    /**
     * Optional. True, if the gift was refunded and isn't available anymore (for regular gifts)
     */
    @SerializedName("was_refunded")
    private Boolean wasRefunded;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver instead of the gift; omitted if the gift cannot be converted to Telegram Stars (for regular gifts)
     */
    @SerializedName("convert_star_count")
    private Integer convertStarCount;

    /**
     * Optional. Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift (for regular gifts)
     */
    @SerializedName("prepaid_upgrade_star_count")
    private Integer prepaidUpgradeStarCount;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift (for unique gifts)
     */
    @SerializedName("transfer_star_count")
    private Integer transferStarCount;

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now (for unique gifts)
     */
    @SerializedName("next_transfer_date")
    private Integer nextTransferDate;

    /**
     * Optional. True, if the gift's upgrade was purchased after the gift was sent; for gifts received on behalf of business accounts only (for regular gifts)
     */
    @SerializedName("is_upgrade_separate")
    private Boolean isUpgradeSeparate;

    /**
     * Optional. Unique number reserved for this gift when upgraded. (for regular gifts)
     */
    @SerializedName("unique_gift_number")
    private Integer uniqueGiftNumber;

    public String getType() {
        return type;
    }

    public Gift getGift() {
        return gift;
    }

    public UniqueGift getUniqueGift() {
        return uniqueGift;
    }

    public String getOwnedGiftId() {
        return ownedGiftId;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public Integer getSendDate() {
        return sendDate;
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

    public Boolean getIsSaved() {
        return isSaved;
    }

    public Boolean getCanBeUpgraded() {
        return canBeUpgraded;
    }

    public Boolean getCanBeTransferred() {
        return canBeTransferred;
    }

    public Boolean getWasRefunded() {
        return wasRefunded;
    }

    public Integer getConvertStarCount() {
        return convertStarCount;
    }

    public Integer getPrepaidUpgradeStarCount() {
        return prepaidUpgradeStarCount;
    }

    public Integer getTransferStarCount() {
        return transferStarCount;
    }

    public Integer getNextTransferDate() {
        return nextTransferDate;
    }

    public Boolean getIsUpgradeSeparate() {
        return isUpgradeSeparate;
    }

    public Integer getUniqueGiftNumber() {
        return uniqueGiftNumber;
    }
}