package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class ChatPermissions implements Serializable {
    /**
     * Optional. True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
     */
    @SerializedName("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Optional. True, if the user is allowed to send audios
     */
    @SerializedName("can_send_audios")
    private Boolean canSendAudios;

    /**
     * Optional. True, if the user is allowed to send documents
     */
    @SerializedName("can_send_documents")
    private Boolean canSendDocuments;

    /**
     * Optional. True, if the user is allowed to send photos
     */
    @SerializedName("can_send_photos")
    private Boolean canSendPhotos;

    /**
     * Optional. True, if the user is allowed to send videos
     */
    @SerializedName("can_send_videos")
    private Boolean canSendVideos;

    /**
     * Optional. True, if the user is allowed to send video notes
     */
    @SerializedName("can_send_video_notes")
    private Boolean canSendVideoNotes;

    /**
     * Optional. True, if the user is allowed to send voice notes
     */
    @SerializedName("can_send_voice_notes")
    private Boolean canSendVoiceNotes;

    /**
     * Optional. True, if the user is allowed to send polls and checklists
     */
    @SerializedName("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots
     */
    @SerializedName("can_send_other_messages")
    private Boolean canSendOtherMessages;

    /**
     * Optional. True, if the user is allowed to add web page previews to their messages
     */
    @SerializedName("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    /**
     * Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
     */
    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Optional. True, if the user is allowed to invite new users to the chat
     */
    @SerializedName("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
     */
    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * Optional. True, if the user is allowed to create forum topics. If omitted defaults to the value of can_pin_messages
     */
    @SerializedName("can_manage_topics")
    private Boolean canManageTopics;

    /**
     * Optional. True, if the user is allowed to edit their own tag
     */
    @SerializedName("can_edit_tag")
    private Boolean canEditTag;

    /**
     * Optional. True, if the user is allowed to react to messages. If omitted, defaults to the value of can_send_messages.
     */
    @SerializedName("can_react_to_messages")
    private Boolean canReactToMessages;
}