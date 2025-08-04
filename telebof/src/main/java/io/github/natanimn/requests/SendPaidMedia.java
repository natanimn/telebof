package io.github.natanimn.requests;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.input.InputPaidMedia;
import io.github.natanimn.types.keyboard.Markup;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import io.github.natanimn.types.keyboard.ReplyParameters;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendPaidMedia extends AbstractBaseRequest<SendPaidMedia, Message> {
    public SendPaidMedia(Object chat_id, int star_count, InputPaidMedia[] media, RequestSender requestSender){
        super(chat_id, requestSender, "sendPaidMedia", Message.class);
        add("star_count", star_count);
        add("media", List.of(media));
        for (InputPaidMedia im: media){
            if (im.isFile()){
                add(im.getInputFile().file.getName(), im.getInputFile().file);
                setContentType(im.getInputFile().contentType);
                setHasMultipart(true);
            }
            if (im.hasThumbnailFile()){
                add(im.getThumbnailFile().file.getName(), im.getThumbnailFile().file);
                setContentType(im.getThumbnailFile().contentType);
                setHasMultipart(true);
            }
        }
    }


    public SendPaidMedia caption(String cap) {
        return add("caption", cap);
    }

    public SendPaidMedia captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public SendPaidMedia parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    public SendPaidMedia disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendPaidMedia protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    public SendPaidMedia replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public SendPaidMedia replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public SendPaidMedia showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

    public SendPaidMedia businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public SendPaidMedia payload(String payload){
        return add("payload", payload);
    }

}
