package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import java.util.List;

/**
 * This object describes a gift received and owned by a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class OwnedGift {
    /**
     * Type of the gift, always "regular" or "unique"
     */
    public String type;

    /**
     * Information about the regular gift (for type "regular")
     */
    public Gift gift;

    /**
     * Information about the unique gift (for type "unique")
     */
    public UniqueGift unique_gift;

    /**
     * Optional. Unique identifier of the gift for the bot; for gifts received on behalf of business accounts only
     */
    public String owned_gift_id;

    /**
     * Optional. Sender of the gift if it is a known user
     */
    public User sender_user;

    /**
     * Date the gift was sent in Unix time
     */
    public Integer send_date;

    /**
     * Optional. Text of the message that was added to the gift (for regular gifts)
     */
    public String text;

    /**
     * Optional. Special entities that appear in the text (for regular gifts)
     */
    public List<MessageEntity> entities;

    /**
     * Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them (for regular gifts)
     */
    public Boolean is_private;

    /**
     * Optional. True, if the gift is displayed on the account's profile page; for gifts received on behalf of business accounts only
     */
    public Boolean is_saved;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift; for gifts received on behalf of business accounts only (for regular gifts)
     */
    public Boolean can_be_upgraded;

    /**
     * Optional. True, if the gift can be transferred to another owner; for gifts received on behalf of business accounts only (for unique gifts)
     */
    public Boolean can_be_transferred;

    /**
     * Optional. True, if the gift was refunded and isn't available anymore (for regular gifts)
     */
    public Boolean was_refunded;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver instead of the gift; omitted if the gift cannot be converted to Telegram Stars (for regular gifts)
     */
    public Integer convert_star_count;

    /**
     * Optional. Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift (for regular gifts)
     */
    public Integer prepaid_upgrade_star_count;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift (for unique gifts)
     */
    public Integer transfer_star_count;

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now (for unique gifts)
     */
    public Integer next_transfer_date;
}