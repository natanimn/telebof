package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.business.BusinessIntro;
import io.github.natanimn.telebof.types.business.BusinessLocation;
import io.github.natanimn.telebof.types.business.BusinessOpeningHours;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;
import io.github.natanimn.telebof.types.media_and_service.Birthdate;
import io.github.natanimn.telebof.types.media_and_service.Location;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;

/**
 * This object contains full information about a chat.
 * @param id Unique identifier for this chat
 * @param type Type of the chat
 * @param title Title, for supergroups, channels and group chats
 * @param username Username, for private chats, supergroups and channels if available
 * @param firstName First name of the other party in a private chat
 * @param lastName Last name of the other party in a private chat
 * @param isForum True, if the supergroup chat is a forum
 * @param isDirectMessages True, if the chat is the direct messages chat of a channel
 * @param photo Chat photo
 * @param activeUsernames If non-empty, the list of all active chat usernames
 * @param emojiStatusCustomEmojiId Custom emoji identifier of the emoji status of the chat or the other party in a private chat
 * @param bio Bio of the other party in a private chat
 * @param hasPrivateForwards True, if privacy settings of the other party in the private chat allows to use tg://user?id=<user_id> links only in chats with the user
 * @param hasRestrictedVoiceAndVideoMessages True, if the privacy settings of the other party restrict sending voice and video note messages in the private chat
 * @param joinToSendMessages True, if users need to join the supergroup before they can send messages
 * @param joinByRequest True, if all users directly joining the supergroup without using an invite link need to be approved by supergroup administrators
 * @param description Description, for groups, supergroups and channel chats
 * @param inviteLink Primary invite link, for groups, supergroups and channel chats
 * @param pinnedMessage The most recent pinned message (by sending date)
 * @param permissions Default chat member permissions, for groups and supergroups
 * @param slowModeDelay For supergroups, the minimum allowed delay between consecutive messages sent by each unprivileged user, in seconds
 * @param messageAutoDeleteTime The time after which all messages sent to the chat will be automatically deleted, in seconds
 * @param hasAggressiveAntiSpamEnabled True, if aggressive anti-spam checks are enabled in the supergroup
 * @param hasHiddenMembers True, if non-administrators can only get the list of bots and administrators in the chat
 * @param hasProtectedContent True, if messages from the chat can't be forwarded to other chats
 * @param stickerSetName For supergroups, name of the group sticker set
 * @param canSetStickerSet True, if the bot can change the group sticker set
 * @param linkedChatId Unique identifier for the linked chat
 * @param location For supergroups, the location to which the supergroup is connected
 * @param emojiStatusExpirationDate Expiration date of the emoji status of the chat or the other party in a private chat, in Unix time, if any
 * @param availableReactions List of available reactions allowed in the chat
 * @param hasVisibleHistory True, if new chat members will have access to old messages
 * @param accentColorId Identifier of the accent color for the chat name and backgrounds
 * @param maxReactionCount The maximum number of reactions that can be set on a message in the chat
 * @param backgroundCustomEmojiId Custom emoji identifier of the emoji chosen by the chat for the reply header and link preview background
 * @param profileAccentColorId Identifier of the accent color for the chat's profile background
 * @param profileBackgroundCustomEmojiId Custom emoji identifier of the emoji chosen by the chat for its profile background
 * @param unrestrictBoostCount For supergroups, the minimum number of boosts that a non-administrator user needs to add in order to ignore slow mode and chat permissions
 * @param customEmojiStickerSetName For supergroups, the name of the group's custom emoji sticker set
 * @param businessIntro For private chats with business accounts, the intro of the business
 * @param businessLocation For private chats with business accounts, the location of the business
 * @param businessOpeningHours For private chats with business accounts, the opening hours of the business
 * @param personalChat For private chats, the personal channel of the user
 * @param birthdate For private chats, the date of birth of the user
 * @param canSendPaidMedia True, if paid media messages can be sent or forwarded to the channel chat
 * @param acceptedGiftTypes Information about types of gifts that are accepted by the chat or by the corresponding user for private chats
 * @param parentChat Optional. Information about the corresponding channel chat, for direct messages chats only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatFullInfo(
        long id,
        ChatType type,
        String title,
        String username,
        @SerializedName("first_name") String firstName,
        @SerializedName("last_name") String lastName,
        @SerializedName("is_forum") Boolean isForum,
        @SerializedName("is_direct_messages") Boolean isDirectMessages,
        ChatPhoto photo,
        @SerializedName("active_usernames") List<String> activeUsernames,
        @SerializedName("emoji_status_custom_emoji_id") String emojiStatusCustomEmojiId,
        String bio,
        @SerializedName("has_private_forwards") Boolean hasPrivateForwards,
        @SerializedName("has_restricted_voice_and_video_messages") Boolean hasRestrictedVoiceAndVideoMessages,
        @SerializedName("join_to_send_messages") Boolean joinToSendMessages,
        @SerializedName("join_by_request") Boolean joinByRequest,
        String description,
        @SerializedName("invite_link") String inviteLink,
        @SerializedName("pinned_message") Message pinnedMessage,
        ChatPermissions permissions,
        @SerializedName("slow_mode_delay") Integer slowModeDelay,
        @SerializedName("message_auto_delete_time") Integer messageAutoDeleteTime,
        @SerializedName("has_aggressive_anti_spam_enabled") Boolean hasAggressiveAntiSpamEnabled,
        @SerializedName("has_hidden_members") Boolean hasHiddenMembers,
        @SerializedName("has_protected_content") Boolean hasProtectedContent,
        @SerializedName("sticker_set_name") String stickerSetName,
        @SerializedName("can_set_sticker_set") Boolean canSetStickerSet,
        @SerializedName("linked_chat_id") Long linkedChatId,
        Location location,
        @SerializedName("emoji_status_expiration_date") Integer emojiStatusExpirationDate,
        @SerializedName("available_reactions") List<ReactionType> availableReactions,
        @SerializedName("has_visible_history") Boolean hasVisibleHistory,
        @SerializedName("accent_color_id") Integer accentColorId,
        @SerializedName("max_reaction_count") Integer maxReactionCount,
        @SerializedName("background_custom_emoji_id") String backgroundCustomEmojiId,
        @SerializedName("profile_accent_color_id") Integer profileAccentColorId,
        @SerializedName("profile_background_custom_emoji_id") String profileBackgroundCustomEmojiId,
        @SerializedName("unrestrict_boost_count") Integer unrestrictBoostCount,
        @SerializedName("custom_emoji_sticker_set_name") String customEmojiStickerSetName,
        @SerializedName("business_intro") BusinessIntro businessIntro,
        @SerializedName("business_location") BusinessLocation businessLocation,
        @SerializedName("business_opening_hours") BusinessOpeningHours businessOpeningHours,
        @SerializedName("personal_chat") Chat personalChat,
        Birthdate birthdate,
        @SerializedName("can_send_paid_media") Boolean canSendPaidMedia,
        AcceptedGiftTypes acceptedGiftTypes,
        @SerializedName("parent_chat") Boolean parentChat
) {}