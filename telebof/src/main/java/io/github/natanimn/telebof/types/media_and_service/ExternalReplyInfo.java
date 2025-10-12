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
 * @param origin Origin of the message replied to by the given message
 * @param chat Optional. Chat the original message belongs to. Available only if the chat is a supergroup or a channel.
 * @param messageId Optional. Unique message identifier inside the original chat. Available only if the original chat is a supergroup or a channel.
 * @param linkPreviewOptions Optional. Options used for link preview generation for the original message, if it is a text message
 * @param animation Optional. Message is an animation, information about the animation
 * @param audio Optional. Message is an audio file, information about the file
 * @param document Optional. Message is a general file, information about the file
 * @param photo Optional. Message is a photo, available sizes of the photo
 * @param sticker Optional. Message is a sticker, information about the sticker
 * @param story Optional. Message is a forwarded story
 * @param video Optional. Message is a video, information about the video
 * @param videoNote Optional. Message is a video note, information about the video message
 * @param voice Optional. Message is a voice message, information about the file
 * @param contact Optional. Message is a shared contact, information about the contact
 * @param dice Optional. Message is a dice with random value
 * @param game Optional. Message is a game, information about the game.
 * @param poll Optional. Message is a native poll, information about the poll
 * @param venue Optional. Message is a venue, information about the venue
 * @param location Optional. Message is a shared location, information about the location
 * @param invoice Optional. Message is an invoice for a payment, information about the invoice.
 * @param hasMediaSpoiler Optional. True, if the message media is covered by a spoiler animation
 * @param paidMedia Optional. Message contains paid media; information about the paid media
 * @param checklist Optional. Message is a checklist
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ExternalReplyInfo(
        MessageOrigin origin,
        Chat chat,
        @SerializedName("message_id") Integer messageId,
        @SerializedName("link_preview_options") LinkPreviewOptions linkPreviewOptions,
        Animation animation,
        Audio audio,
        Document document,
        List<PhotoSize> photo,
        Sticker sticker,
        Story story,
        Video video,
        @SerializedName("video_note") VideoNote videoNote,
        Voice voice,
        Contact contact,
        Dice dice,
        Game game,
        Poll poll,
        Venue venue,
        Location location,
        Invoice invoice,
        @SerializedName("has_media_spoiler") Boolean hasMediaSpoiler,
        @SerializedName("paid_media") PaidMediaInfo paidMedia,
        Checklist checklist
) {}