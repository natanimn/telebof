package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputPaidMedia;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.ReplyParameters;

/**
 * SendPaidMedia class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendPaidMedia
 */
public class SendPaidMedia extends AbstractBaseRequest<SendPaidMedia, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param starCount star count
     * @param media input media
     * @param api api
     */
    public SendPaidMedia(Object chatId, int starCount, InputPaidMedia[] media, Api api){
        super(chatId, api, "sendPaidMedia", Message.class);
        add("star_count", starCount);
        add("media", media);
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
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the media caption.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia showCaptionAboveMedia(boolean showCaptionAboveMedia) {
        return add("show_caption_above_media", showCaptionAboveMedia);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param payload Bot-defined paid media payload, 0-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia payload(String payload){
        return add("payload", payload);
    }


    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    /**
     * Optional
     * @param suggestedPostParameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link SendPaidMedia}
     */
    public SendPaidMedia suggestedPostParameters(SuggestedPostParameters suggestedPostParameters){
        return add("suggested_post_parameters", suggestedPostParameters);
    }
}
