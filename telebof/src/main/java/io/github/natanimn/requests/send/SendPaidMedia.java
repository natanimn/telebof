package io.github.natanimn.requests.send;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.input.InputPaidMedia;
import io.github.natanimn.types.keyboard.Markup;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import io.github.natanimn.types.keyboard.ReplyParameters;

import java.util.List;

/**
 * SendPaidMedia class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#sendPaidMedia}
 */
public class SendPaidMedia extends AbstractBaseRequest<SendPaidMedia, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param star_count star count
     * @param media input media
     * @param requestSender request sender
     */
    public SendPaidMedia(Object chat_id, short star_count, InputPaidMedia[] media, RequestSender requestSender){
        super(chat_id, requestSender, "sendPaidMedia", Message.class);
        add("star_count", star_count);
        add("media", List.of(media));
        for (InputPaidMedia im: media){
            if (im.hasFile()) setHasMultipart(true);
        }
    }

    /**
     * Optional
     * @param caption Media caption, 0-1024 characters after entities parsing
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param caption_entities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the media caption.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia parseMode(ParseMode parse_mode) {
        return add("parse_mode",  parse_mode);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia showCaptionAboveMedia(boolean show_caption_above_media) {
        return add("show_caption_above_media", show_caption_above_media);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param payload Bot-defined paid media payload, 0-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia payload(String payload){
        return add("payload", payload);
    }

}
