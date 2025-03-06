package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ExternalReplyInfo implements Serializable {
    public MessageOrigin origin;
    public Chat chat;
    public Integer message_id;
    public LinkPreviewOptions link_preview_options;
    public Animation animation;
    public Audio audio;
    public Document document;
    public List<PhotoSize> photo;
    public Sticker sticker;
    public Story story;
    public Video video;
    public VideoNote video_note;
    public Voice voice;
    public Contact contact;
    public Dice dice;
    public Game game;
    public Poll poll;
    public Venue venue;
    public Location location;
    public Invoice invoice;
    public Boolean has_media_spoiler;
    public PaidMediaInfo paid_media;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ExternalReplyInfo that = (ExternalReplyInfo) object;
        return Objects.equals(origin, that.origin) &&
                Objects.equals(chat, that.chat) &&
                Objects.equals(message_id, that.message_id) &&
                Objects.equals(link_preview_options, that.link_preview_options) &&
                Objects.equals(animation, that.animation) &&
                Objects.equals(audio, that.audio) &&
                Objects.equals(document, that.document) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(sticker, that.sticker) &&
                Objects.equals(story, that.story) &&
                Objects.equals(video, that.video) &&
                Objects.equals(video_note, that.video_note) &&
                Objects.equals(voice, that.voice) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(dice, that.dice) &&
                Objects.equals(game, that.game) &&
                Objects.equals(poll, that.poll) &&
                Objects.equals(venue, that.venue) &&
                Objects.equals(location, that.location) &&
                Objects.equals(invoice, that.invoice) &&
                Objects.equals(has_media_spoiler, that.has_media_spoiler) &&
                Objects.equals(paid_media, that.paid_media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, chat, message_id, link_preview_options, animation, audio, document, photo, sticker,
                story, video, video_note, voice, contact, dice, game, poll, venue, location, invoice, has_media_spoiler, paid_media);
    }
}
