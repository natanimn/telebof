package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.updates.Poll;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.payments.PaidMediaInfo;

import java.util.List;

/**
 * This object contains information about a message that is being replied to, which may come from another chat or forum topic.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ExternalReplyInfo {
    /**
     * Origin of the message replied to by the given message
     */
    public MessageOrigin origin;

    /**
     * Optional. Chat the original message belongs to. Available only if the chat is a supergroup or a channel.
     */
    public Chat chat;

    /**
     * Optional. Unique message identifier inside the original chat. Available only if the original chat is a supergroup or a channel.
     */
    public Integer message_id;

    /**
     * Optional. Options used for link preview generation for the original message, if it is a text message
     */
    public LinkPreviewOptions link_preview_options;

    /**
     * Optional. Message is an animation, information about the animation
     */
    public Animation animation;

    /**
     * Optional. Message is an audio file, information about the file
     */
    public Audio audio;

    /**
     * Optional. Message is a general file, information about the file
     */
    public Document document;

    /**
     * Optional. Message is a photo, available sizes of the photo
     */
    public List<PhotoSize> photo;

    /**
     * Optional. Message is a sticker, information about the sticker
     */
    public Sticker sticker;

    /**
     * Optional. Message is a forwarded story
     */
    public Story story;

    /**
     * Optional. Message is a video, information about the video
     */
    public Video video;

    /**
     * Optional. Message is a video note, information about the video message
     */
    public VideoNote video_note;

    /**
     * Optional. Message is a voice message, information about the file
     */
    public Voice voice;

    /**
     * Optional. Message is a shared contact, information about the contact
     */
    public Contact contact;

    /**
     * Optional. Message is a dice with random value
     */
    public Dice dice;

    /**
     * 	Optional. Message is a game, information about the game.
     */
    public Game game;

    /**
     * Optional. Message is a native poll, information about the poll
     */
    public Poll poll;

    /**
     * Optional. Message is a venue, information about the venue
     */
    public Venue venue;

    /**
     * Optional. Message is a shared location, information about the location
     */
    public Location location;

    /**
     * Optional. Message is an invoice for a payment, information about the invoice.
     */
    public Invoice invoice;

    /**
     * Optional. True, if the message media is covered by a spoiler animation
     */
    public Boolean has_media_spoiler;

    /**
     * Optional. Message contains paid media; information about the paid media
     */
    public PaidMediaInfo paid_media;

}
