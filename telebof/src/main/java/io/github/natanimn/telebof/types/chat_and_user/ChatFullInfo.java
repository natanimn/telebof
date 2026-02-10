package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.business.BusinessIntro;
import io.github.natanimn.telebof.types.business.BusinessLocation;
import io.github.natanimn.telebof.types.business.BusinessOpeningHours;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;
import io.github.natanimn.telebof.types.gift_and_giveaway.UniqueGiftColors;
import io.github.natanimn.telebof.types.media_and_service.Audio;
import io.github.natanimn.telebof.types.media_and_service.Birthdate;
import io.github.natanimn.telebof.types.media_and_service.Location;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;

/**
 * This object contains full information about a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.4.0
 */
public class ChatFullInfo {
    /**
     * Unique identifier for this chat
     */
    private long id;

    /**
     * Type of the chat
     */
    private ChatType type;

    /**
     * Title, for supergroups, channels and group chats
     */
    private String title;

    /**
     * Username, for private chats, supergroups and channels if available
     */
    private String username;

    /**
     * First name of the other party in a private chat
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Last name of the other party in a private chat
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * True, if the supergroup chat is a forum
     */
    @SerializedName("is_forum")
    private Boolean isForum;

    /**
     * True, if the chat is the direct messages chat of a channel
     */
    @SerializedName("is_direct_messages")
    private Boolean isDirectMessages;

    /**
     * Chat photo
     */
    private ChatPhoto photo;

    /**
     * If non-empty, the list of all active chat usernames
     */
    @SerializedName("active_usernames")
    private List<String> activeUsernames;

    /**
     * Custom emoji identifier of the emoji status of the chat or the other party in a private chat
     */
    @SerializedName("emoji_status_custom_emoji_id")
    private String emojiStatusCustomEmojiId;

    /**
     * Bio of the other party in a private chat
     */
    private String bio;

    /**
     * True, if privacy settings of the other party in the private chat allows to use tg://user?id=<user_id> links only in chats with the user
     */
    @SerializedName("has_private_forwards")
    private Boolean hasPrivateForwards;

    /**
     * True, if the privacy settings of the other party restrict sending voice and video note messages in the private chat
     */
    @SerializedName("has_restricted_voice_and_video_messages")
    private Boolean hasRestrictedVoiceAndVideoMessages;

    /**
     * True, if users need to join the supergroup before they can send messages
     */
    @SerializedName("join_to_send_messages")
    private Boolean joinToSendMessages;

    /**
     * True, if all users directly joining the supergroup without using an invite link need to be approved by supergroup administrators
     */
    @SerializedName("join_by_request")
    private Boolean joinByRequest;

    /**
     * Description, for groups, supergroups and channel chats
     */
    private String description;

    /**
     * Primary invite link, for groups, supergroups and channel chats
     */
    @SerializedName("invite_link")
    private String inviteLink;

    /**
     * The most recent pinned message (by sending date)
     */
    @SerializedName("pinned_message")
    private Message pinnedMessage;

    /**
     * Default chat member permissions, for groups and supergroups
     */
    private ChatPermissions permissions;

    /**
     * For supergroups, the minimum allowed delay between consecutive messages sent by each unprivileged user, in seconds
     */
    @SerializedName("slow_mode_delay")
    private Integer slowModeDelay;

    /**
     * The time after which all messages sent to the chat will be automatically deleted, in seconds
     */
    @SerializedName("message_auto_delete_time")
    private Integer messageAutoDeleteTime;

    /**
     * True, if aggressive anti-spam checks are enabled in the supergroup
     */
    @SerializedName("has_aggressive_anti_spam_enabled")
    private Boolean hasAggressiveAntiSpamEnabled;

    /**
     * True, if non-administrators can only get the list of bots and administrators in the chat
     */
    @SerializedName("has_hidden_members")
    private Boolean hasHiddenMembers;

    /**
     * True, if messages from the chat can't be forwarded to other chats
     */
    @SerializedName("has_protected_content")
    private Boolean hasProtectedContent;

    /**
     * For supergroups, name of the group sticker set
     */
    @SerializedName("sticker_set_name")
    private String stickerSetName;

    /**
     * True, if the bot can change the group sticker set
     */
    @SerializedName("can_set_sticker_set")
    private Boolean canSetStickerSet;

    /**
     * Unique identifier for the linked chat
     */
    @SerializedName("linked_chat_id")
    private Long linkedChatId;

    /**
     * For supergroups, the location to which the supergroup is connected
     */
    private Location location;

    /**
     * Expiration date of the emoji status of the chat or the other party in a private chat, in Unix time, if any
     */
    @SerializedName("emoji_status_expiration_date")
    private Integer emojiStatusExpirationDate;

    /**
     * List of available reactions allowed in the chat
     */
    @SerializedName("available_reactions")
    private List<ReactionType> availableReactions;

    /**
     * True, if new chat members will have access to old messages
     */
    @SerializedName("has_visible_history")
    private Boolean hasVisibleHistory;

    /**
     * Identifier of the accent color for the chat name and backgrounds
     */
    @SerializedName("accent_color_id")
    private Integer accentColorId;

    /**
     * The maximum number of reactions that can be set on a message in the chat
     */
    @SerializedName("max_reaction_count")
    private Integer maxReactionCount;

    /**
     * Custom emoji identifier of the emoji chosen by the chat for the reply header and link preview background
     */
    @SerializedName("background_custom_emoji_id")
    private String backgroundCustomEmojiId;

    /**
     * Identifier of the accent color for the chat's profile background
     */
    @SerializedName("profile_accent_color_id")
    private Integer profileAccentColorId;

    /**
     * Custom emoji identifier of the emoji chosen by the chat for its profile background
     */
    @SerializedName("profile_background_custom_emoji_id")
    private String profileBackgroundCustomEmojiId;

    /**
     * For supergroups, the minimum number of boosts that a non-administrator user needs to add in order to ignore slow mode and chat permissions
     */
    @SerializedName("unrestrict_boost_count")
    private Integer unrestrictBoostCount;

    /**
     * For supergroups, the name of the group's custom emoji sticker set
     */
    @SerializedName("custom_emoji_sticker_set_name")
    private String customEmojiStickerSetName;

    /**
     * For private chats with business accounts, the intro of the business
     */
    @SerializedName("business_intro")
    private BusinessIntro businessIntro;

    /**
     * For private chats with business accounts, the location of the business
     */
    @SerializedName("business_location")
    private BusinessLocation businessLocation;

    /**
     * For private chats with business accounts, the opening hours of the business
     */
    @SerializedName("business_opening_hours")
    private BusinessOpeningHours businessOpeningHours;

    /**
     * For private chats, the personal channel of the user
     */
    @SerializedName("personal_chat")
    private Chat personalChat;

    /**
     * For private chats, the date of birth of the user
     */
    private Birthdate birthdate;

    /**
     * True, if paid media messages can be sent or forwarded to the channel chat
     */
    @SerializedName("can_send_paid_media")
    private Boolean canSendPaidMedia;

    /**
     * Information about types of gifts that are accepted by the chat or by the corresponding user for private chats
     */
    @SerializedName("accepted_gift_types")
    private AcceptedGiftTypes acceptedGiftTypes;

    /**
     * Optional. Information about the corresponding channel chat, for direct messages chats only
     */
    @SerializedName("parent_chat")
    private Boolean parentChat;

    /**
     * Optional. For private chats, the rating of the user if any
     */
    private UserRating rating;

    /**
     * Optional. The number of Telegram Stars a general user have to pay to send a message to the chat
     */
    @SerializedName("paid_message_star_count")
    private Integer paidMessageStarCount;

    /**
     * Optional. The color scheme based on a unique gift that must be used for the chat's name, message replies and link previews
     */
    @SerializedName("unique_gift_colors")
    private UniqueGiftColors uniqueGiftColors;

    /**
     * Optional. For private chats, the first audio added to the profile of the user
     */
    @SerializedName("first_profile_audio")
    private Audio firstProfileAudio;

    public long getId() {
        return id;
    }

    public ChatType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getIsForum() {
        return isForum;
    }

    public Boolean getIsDirectMessages() {
        return isDirectMessages;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public List<String> getActiveUsernames() {
        return activeUsernames;
    }

    public String getEmojiStatusCustomEmojiId() {
        return emojiStatusCustomEmojiId;
    }

    public String getBio() {
        return bio;
    }

    public Boolean getHasPrivateForwards() {
        return hasPrivateForwards;
    }

    public Boolean getHasRestrictedVoiceAndVideoMessages() {
        return hasRestrictedVoiceAndVideoMessages;
    }

    public Boolean getJoinToSendMessages() {
        return joinToSendMessages;
    }

    public Boolean getJoinByRequest() {
        return joinByRequest;
    }

    public String getDescription() {
        return description;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public ChatPermissions getPermissions() {
        return permissions;
    }

    public Integer getSlowModeDelay() {
        return slowModeDelay;
    }

    public Integer getMessageAutoDeleteTime() {
        return messageAutoDeleteTime;
    }

    public Boolean getHasAggressiveAntiSpamEnabled() {
        return hasAggressiveAntiSpamEnabled;
    }

    public Boolean getHasHiddenMembers() {
        return hasHiddenMembers;
    }

    public Boolean getHasProtectedContent() {
        return hasProtectedContent;
    }

    public String getStickerSetName() {
        return stickerSetName;
    }

    public Boolean getCanSetStickerSet() {
        return canSetStickerSet;
    }

    public Long getLinkedChatId() {
        return linkedChatId;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getEmojiStatusExpirationDate() {
        return emojiStatusExpirationDate;
    }

    public List<ReactionType> getAvailableReactions() {
        return availableReactions;
    }

    public Boolean getHasVisibleHistory() {
        return hasVisibleHistory;
    }

    public Integer getAccentColorId() {
        return accentColorId;
    }

    public Integer getMaxReactionCount() {
        return maxReactionCount;
    }

    public String getBackgroundCustomEmojiId() {
        return backgroundCustomEmojiId;
    }

    public Integer getProfileAccentColorId() {
        return profileAccentColorId;
    }

    public String getProfileBackgroundCustomEmojiId() {
        return profileBackgroundCustomEmojiId;
    }

    public Integer getUnrestrictBoostCount() {
        return unrestrictBoostCount;
    }

    public String getCustomEmojiStickerSetName() {
        return customEmojiStickerSetName;
    }

    public BusinessIntro getBusinessIntro() {
        return businessIntro;
    }

    public BusinessLocation getBusinessLocation() {
        return businessLocation;
    }

    public BusinessOpeningHours getBusinessOpeningHours() {
        return businessOpeningHours;
    }

    public Chat getPersonalChat() {
        return personalChat;
    }

    public Birthdate getBirthdate() {
        return birthdate;
    }

    public Boolean getCanSendPaidMedia() {
        return canSendPaidMedia;
    }

    public AcceptedGiftTypes getAcceptedGiftTypes() {
        return acceptedGiftTypes;
    }

    public Boolean getParentChat() {
        return parentChat;
    }

    public UserRating getRating() {
        return rating;
    }

    public Integer getPaidMessageStarCount() {
        return paidMessageStarCount;
    }

    public UniqueGiftColors getUniqueGiftColors() {
        return uniqueGiftColors;
    }

    public Audio getFirstProfileAudio(){
        return firstProfileAudio;
    }
}