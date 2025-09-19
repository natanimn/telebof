package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the rights of a business bot.
 * @param canReply Optional. True, if the bot can send and edit messages in the  chats that had incoming messages in the last 24 hours
 * @param canReadMessages Optional. True, if the bot can mark incoming  messages as read
 * @param canDeleteSentMessages Optional. True, if the bot can delete messages sent by the bot
 * @param canDeleteAllMessages Optional. True, if the bot can delete all  messages in managed chats
 * @param canEditName Optional. True, if the bot can edit the first and last name of the business account
 * @param canEditBio Optional. True, if the bot can edit the bio of the business account
 * @param canEditProfilePhoto True, if the bot can edit the profile photo of the business account
 * @param canEditUsername True, if the bot can edit the username of the business account
 * @param canChangeGiftSettings True, if the bot can change the privacy settings pertaining to gifts for the business account
 * @param canViewGiftsAndStars True, if the bot can view gifts and the amount of Telegram Stars owned by the business account
 * @param canConvertGiftsToStars True, if the bot can convert regular gifts owned by the business account to Telegram Stars
 * @param canTransferAndUpgradeGifts True, if the bot can transfer and upgrade gifts owned by the business account
 * @param canTransferStars True, if the bot can transfer Telegram Stars received by the business account to its own account, or use them to upgrade and transfer gifts
 * @param canManageStories True, if the bot can post, edit and delete stories on behalf of the business account
 * @author Natanim
 * @since 19 August 20025
 * @version 1.2.4
 */
public record BusinessBotRights(
    @SerializedName("can_reply")
     Boolean canReply,

    @SerializedName("can_read_messages")
     Boolean canReadMessages,

    @SerializedName("can_delete_sent_messages")
     Boolean canDeleteSentMessages,

    @SerializedName("can_delete_all_messages")
     Boolean canDeleteAllMessages,

    @SerializedName("can_edit_name")
     Boolean canEditName,

    @SerializedName("can_edit_bio")
     Boolean canEditBio,

    @SerializedName("can_edit_profile_photo")
     Boolean canEditProfilePhoto,

    @SerializedName("can_edit_username")
     Boolean canEditUsername,

    @SerializedName("can_change_gift_settings")
     Boolean canChangeGiftSettings,

    @SerializedName("can_view_gifts_and_stars")
     Boolean canViewGiftsAndStars,

    @SerializedName("can_convert_gifts_to_stars")
     Boolean canConvertGiftsToStars,

    @SerializedName("can_transfer_and_upgrade_gifts")
     Boolean canTransferAndUpgradeGifts,

    @SerializedName("can_transfer_stars")
     Boolean canTransferStars,

    @SerializedName("can_manage_stories")
     Boolean canManageStories
    ){ }
