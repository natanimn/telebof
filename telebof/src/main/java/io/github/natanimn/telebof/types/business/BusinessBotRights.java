package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the rights of a business bot.
 * @author Natanim
 * @since 19 August 20025
 * @version 1.3.0
 */
public class BusinessBotRights {
    @SerializedName("can_reply")
    private Boolean canReply;

    @SerializedName("can_read_messages")
    private Boolean canReadMessages;

    @SerializedName("can_delete_sent_messages")
    private Boolean canDeleteSentMessages;

    @SerializedName("can_delete_all_messages")
    private Boolean canDeleteAllMessages;

    @SerializedName("can_edit_name")
    private Boolean canEditName;

    @SerializedName("can_edit_bio")
    private Boolean canEditBio;

    @SerializedName("can_edit_profile_photo")
    private Boolean canEditProfilePhoto;

    @SerializedName("can_edit_username")
    private Boolean canEditUsername;

    @SerializedName("can_change_gift_settings")
    private Boolean canChangeGiftSettings;

    @SerializedName("can_view_gifts_and_stars")
    private Boolean canViewGiftsAndStars;

    @SerializedName("can_convert_gifts_to_stars")
    private Boolean canConvertGiftsToStars;

    @SerializedName("can_transfer_and_upgrade_gifts")
    private Boolean canTransferAndUpgradeGifts;

    @SerializedName("can_transfer_stars")
    private Boolean canTransferStars;

    @SerializedName("can_manage_stories")
    private Boolean canManageStories;

    /**
     * Gets whether the bot can reply to messages.
     * @return True, if the bot can send and edit messages in the chats that had incoming messages in the last 24 hours
     */
    public Boolean getCanReply() {
        return canReply;
    }

    /**
     * Gets whether the bot can read messages.
     * @return True, if the bot can mark incoming messages as read
     */
    public Boolean getCanReadMessages() {
        return canReadMessages;
    }

    /**
     * Gets whether the bot can delete sent messages.
     * @return True, if the bot can delete messages sent by the bot
     */
    public Boolean getCanDeleteSentMessages() {
        return canDeleteSentMessages;
    }

    /**
     * Gets whether the bot can delete all messages.
     * @return True, if the bot can delete all messages in managed chats
     */
    public Boolean getCanDeleteAllMessages() {
        return canDeleteAllMessages;
    }

    /**
     * Gets whether the bot can edit name.
     * @return True, if the bot can edit the first and last name of the business account
     */
    public Boolean getCanEditName() {
        return canEditName;
    }

    /**
     * Gets whether the bot can edit bio.
     * @return True, if the bot can edit the bio of the business account
     */
    public Boolean getCanEditBio() {
        return canEditBio;
    }

    /**
     * Gets whether the bot can edit profile photo.
     * @return True, if the bot can edit the profile photo of the business account
     */
    public Boolean getCanEditProfilePhoto() {
        return canEditProfilePhoto;
    }

    /**
     * Gets whether the bot can edit username.
     * @return True, if the bot can edit the username of the business account
     */
    public Boolean getCanEditUsername() {
        return canEditUsername;
    }

    /**
     * Gets whether the bot can change gift settings.
     * @return True, if the bot can change the privacy settings pertaining to gifts for the business account
     */
    public Boolean getCanChangeGiftSettings() {
        return canChangeGiftSettings;
    }

    /**
     * Gets whether the bot can view gifts and stars.
     * @return True, if the bot can view gifts and the amount of Telegram Stars owned by the business account
     */
    public Boolean getCanViewGiftsAndStars() {
        return canViewGiftsAndStars;
    }

    /**
     * Gets whether the bot can convert gifts to stars.
     * @return True, if the bot can convert regular gifts owned by the business account to Telegram Stars
     */
    public Boolean getCanConvertGiftsToStars() {
        return canConvertGiftsToStars;
    }

    /**
     * Gets whether the bot can transfer and upgrade gifts.
     * @return True, if the bot can transfer and upgrade gifts owned by the business account
     */
    public Boolean getCanTransferAndUpgradeGifts() {
        return canTransferAndUpgradeGifts;
    }

    /**
     * Gets whether the bot can transfer stars.
     * @return True, if the bot can transfer Telegram Stars received by the business account to its own account,
     * or use them to upgrade and transfer gifts
     */
    public Boolean getCanTransferStars() {
        return canTransferStars;
    }

    /**
     * Gets whether the bot can manage stories.
     * @return True, if the bot can post, edit and delete stories on behalf of the business account
     */
    public Boolean getCanManageStories() {
        return canManageStories;
    }
}