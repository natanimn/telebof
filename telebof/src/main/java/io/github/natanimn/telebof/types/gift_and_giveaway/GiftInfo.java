package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes a service message about a regular gift that was sent or received.
 * @param gift Information about the gift
 * @param ownedGiftId Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
 * @param convertStarCount Optional. Number of Telegram Stars that can be claimed by the receiver by converting the gift; omitted if conversion to Telegram Stars is impossible
 * @param prepaidUpgradeStarCount Optional. Number of Telegram Stars that were prepaid by the sender for the ability to upgrade the gift
 * @param canBeUpgraded Optional. True, if the gift can be upgraded to a unique gift
 * @param text Optional. Text of the message that was added to the gift
 * @param entities Optional. Special entities that appear in the text
 * @param isPrivate Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them
 * @author Natanim
 * @since 19 August 2025
 * @version 1.2.4
 */
public record GiftInfo(
        Gift gift,
        @SerializedName("owned_gift_id") String ownedGiftId,
        @SerializedName("convert_star_count") Integer convertStarCount,
        @SerializedName("prepaid_upgrade_star_count") Integer prepaidUpgradeStarCount,
        @SerializedName("can_be_upgraded") Boolean canBeUpgraded,
        String text,
        List<MessageEntity> entities,
        @SerializedName("is_private") Boolean isPrivate
) {}