package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.util.List;

/**
 * Describes a service message about a regular gift that was sent or received.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class GiftInfo {
    /**
     * Information about the gift
     */
    public Gift gift;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    public String owned_gift_id;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver by converting the gift; omitted if conversion to Telegram Stars is impossible
     */
    public Integer convert_star_count;

    /**
     * Optional. Number of Telegram Stars that were prepaid by the sender for the ability to upgrade the gift
     */
    public Integer prepaid_upgrade_star_count;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift
     */
    public Boolean can_be_upgraded;

    /**
     * Optional. Text of the message that was added to the gift
     */
    public String text;

    /**
     * Optional. Special entities that appear in the text
     */
    public List<MessageEntity> entities;

    /**
     * Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them
     */
    public Boolean is_private;
}