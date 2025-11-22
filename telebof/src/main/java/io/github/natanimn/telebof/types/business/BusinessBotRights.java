package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the rights of a business bot.
 * @author Natanim
 * @since 19 August 20025
 * @version 1.3.0
 */
public class BusinessBotRights {
    /**
     * Optional. True, if the bot can send and edit messages in the  chats that had incoming messages in the last 24 hours
     */
    @SerializedName("can_reply")
    private Boolean canReply;

    /**
     * Optional. True, if the bot can mark incoming  messages as read
     */
    @SerializedName("can_read_messages")
    private Boolean canReadMessages;

    /**
     * Optional. True, if the bot can delete messages sent by the bot
     */
    @SerializedName("can_delete_sent_messages")
    private Boolean canDeleteSentMessages;

    /**
     * Optional. True, if the bot can delete all  messages in managed chats
     */
    @SerializedName("can_delete_all_messages")
    private Boolean canDeleteAllMessages;

    /**
     * Optional. True, if the bot can edit the first and last name of the business account
     */
    @SerializedName("can_edit_name")
    private Boolean canEditName;

    /**
     * Optional. True, if the bot can edit the bio of the business account
     */
    @SerializedName("can_edit_bio")
    private Boolean canEditBio;

    /**
     * True, if the bot can edit the profile photo of the business account
     */
    @SerializedName("can_edit_profile_photo")
    private Boolean canEditProfilePhoto;

    /**
     * True, if the bot can edit the username of the business account
     */
    @SerializedName("can_edit_username")
    private Boolean canEditUsername;

    /**
     * True, if the bot can change the privacy settings pertaining to gifts for the business account
     */
    @SerializedName("can_change_gift_settings")
    private Boolean canChangeGiftSettings;

    /**
     * True, if the bot can view gifts and the amount of Telegram Stars owned by the business account
     */
    @SerializedName("can_view_gifts_and_stars")
    private Boolean canViewGiftsAndStars;

    /**
     * True, if the bot can convert regular gifts owned by the business account to Telegram Stars
     */
    @SerializedName("can_convert_gifts_to_stars")
    private Boolean canConvertGiftsToStars;

    /**
     * True, if the bot can transfer and upgrade gifts owned by the business account
     */
    @SerializedName("can_transfer_and_upgrade_gifts")
    private Boolean canTransferAndUpgradeGifts;

    /**
     * True, if the bot can transfer Telegram Stars received by the business account to its own account, or use them to upgrade and transfer gifts
     */
    @SerializedName("can_transfer_stars")
    private Boolean canTransferStars;

    /**
     * True, if the bot can post, edit and delete stories on behalf of the business account
     */
    @SerializedName("can_manage_stories")
    private Boolean canManageStories;

    public Boolean getCanReply() {
        return canReply;
    }

    public Boolean getCanReadMessages() {
        return canReadMessages;
    }

    public Boolean getCanDeleteSentMessages() {
        return canDeleteSentMessages;
    }

    public Boolean getCanDeleteAllMessages() {
        return canDeleteAllMessages;
    }

    public Boolean getCanEditName() {
        return canEditName;
    }

    public Boolean getCanEditBio() {
        return canEditBio;
    }

    public Boolean getCanEditProfilePhoto() {
        return canEditProfilePhoto;
    }

    public Boolean getCanEditUsername() {
        return canEditUsername;
    }

    public Boolean getCanChangeGiftSettings() {
        return canChangeGiftSettings;
    }

    public Boolean getCanViewGiftsAndStars() {
        return canViewGiftsAndStars;
    }

    public Boolean getCanConvertGiftsToStars() {
        return canConvertGiftsToStars;
    }

    public Boolean getCanTransferAndUpgradeGifts() {
        return canTransferAndUpgradeGifts;
    }

    public Boolean getCanTransferStars() {
        return canTransferStars;
    }

    public Boolean getCanManageStories() {
        return canManageStories;
    }
}