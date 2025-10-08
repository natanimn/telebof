package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object describes a gift received and owned by a user or a chat.
 * @param type Type of the gift, always "regular" or "unique"
 * @param gift Information about the regular gift (for type "regular")
 * @param uniqueGift Information about the unique gift (for type "unique")
 * @param ownedGiftId Optional. Unique identifier of the gift for the bot; for gifts received on behalf of business accounts only
 * @param senderUser Optional. Sender of the gift if it is a known user
 * @param sendDate Date the gift was sent in Unix time
 * @param text Optional. Text of the message that was added to the gift (for regular gifts)
 * @param entities Optional. Special entities that appear in the text (for regular gifts)
 * @param isPrivate Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them (for regular gifts)
 * @param isSaved Optional. True, if the gift is displayed on the account's profile page; for gifts received on behalf of business accounts only
 * @param canBeUpgraded Optional. True, if the gift can be upgraded to a unique gift; for gifts received on behalf of business accounts only (for regular gifts)
 * @param canBeTransferred Optional. True, if the gift can be transferred to another owner; for gifts received on behalf of business accounts only (for unique gifts)
 * @param wasRefunded Optional. True, if the gift was refunded and isn't available anymore (for regular gifts)
 * @param convertStarCount Optional. Number of Telegram Stars that can be claimed by the receiver instead of the gift; omitted if the gift cannot be converted to Telegram Stars (for regular gifts)
 * @param prepaidUpgradeStarCount Optional. Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift (for regular gifts)
 * @param transferStarCount Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift (for unique gifts)
 * @param nextTransferDate Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now (for unique gifts)
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record OwnedGift(
        String type,
        Gift gift,
        @SerializedName("unique_gift") UniqueGift uniqueGift,
        @SerializedName("owned_gift_id") String ownedGiftId,
        @SerializedName("sender_user") User senderUser,
        @SerializedName("send_date") Integer sendDate,
        String text,
        List<MessageEntity> entities,
        @SerializedName("is_private") Boolean isPrivate,
        @SerializedName("is_saved") Boolean isSaved,
        @SerializedName("can_be_upgraded") Boolean canBeUpgraded,
        @SerializedName("can_be_transferred") Boolean canBeTransferred,
        @SerializedName("was_refunded") Boolean wasRefunded,
        @SerializedName("convert_star_count") Integer convertStarCount,
        @SerializedName("prepaid_upgrade_star_count") Integer prepaidUpgradeStarCount,
        @SerializedName("transfer_star_count") Integer transferStarCount,
        @SerializedName("next_transfer_date") Integer nextTransferDate
) {}