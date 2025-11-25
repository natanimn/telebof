package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.checklist.Checklist;
import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.updates.Poll;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.payments.PaidMediaInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about a message that is being replied to, which may come from another chat or forum topic.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ExternalReplyInfo {
    /**
     * Origin of the message replied to by the given message
     */
    private MessageOrigin origin;

    /**
     * Optional. Chat the original message belongs to. Available only if the chat is a supergroup or a channel.
     */
    private Chat chat;

    /**
     * Optional. Unique message identifier inside the original chat. Available only if the original chat is a supergroup or a channel.
     */
    @SerializedName("message_id")
    private Integer messageId;

    /**
     * Optional. Options used for link preview generation for the original message, if it is a text message
     */
    @SerializedName("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    /**
     * Optional. Message is an animation, information about the animation
     */
    private Animation animation;

    /**
     * Optional. Message is an audio file, information about the file
     */
    private Audio audio;

    /**
     * Optional. Message is a general file, information about the file
     */
    private Document document;

    /**
     * Optional. Message is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * Optional. Message is a sticker, information about the sticker
     */
    private Sticker sticker;

    /**
     * Optional. Message is a forwarded story
     */
    private Story story;

    /**
     * Optional. Message is a video, information about the video
     */
    private Video video;

    /**
     * Optional. Message is a video note, information about the video message
     */
    @SerializedName("video_note")
    private VideoNote videoNote;

    /**
     * Optional. Message is a voice message, information about the file
     */
    private Voice voice;

    /**
     * Optional. Message is a shared contact, information about the contact
     */
    private Contact contact;

    /**
     * Optional. Message is a dice with random value
     */
    private Dice dice;

    /**
     * Optional. Message is a game, information about the game.
     */
    private Game game;

    /**
     * Optional. Message is a native poll, information about the poll
     */
    private Poll poll;

    /**
     * Optional. Message is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Optional. Message is a shared location, information about the location
     */
    private Location location;

    /**
     * Optional. Message is an invoice for a payment, information about the invoice.
     */
    private Invoice invoice;

    /**
     * Optional. True, if the message media is covered by a spoiler animation
     */
    @SerializedName("has_media_spoiler")
    private Boolean hasMediaSpoiler;

    /**
     * Optional. Message contains paid media; information about the paid media
     */
    @SerializedName("paid_media")
    private PaidMediaInfo paidMedia;

    /**
     * Optional. Message is a checklist
     */
    private Checklist checklist;

    public MessageOrigin getOrigin() {
        return origin;
    }

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Story getStory() {
        return story;
    }

    public Video getVideo() {
        return video;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Voice getVoice() {
        return voice;
    }

    public Contact getContact() {
        return contact;
    }

    public Dice getDice() {
        return dice;
    }

    public Game getGame() {
        return game;
    }

    public Poll getPoll() {
        return poll;
    }

    public Venue getVenue() {
        return venue;
    }

    public Location getLocation() {
        return location;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Boolean getHasMediaSpoiler() {
        return hasMediaSpoiler;
    }

    public PaidMediaInfo getPaidMedia() {
        return paidMedia;
    }

    public Checklist getChecklist() {
        return checklist;
    }
}