package io.github.natanimn.requests.edit;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.input.InputMedia;
import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.updates.Message;

/**
 * EditMessageMedia class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class EditMessageMedia extends AbstractBaseRequest<EditMessageMedia, Object> {

    /**
     * Required
     * @param media media
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#editMessageMedia(Object, InputMedia, int)}
     */
    public EditMessageMedia(InputMedia media, Object chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "editMessageMedia", Message.class);
        add("media", media);
        add("message_id", message_id);
        if (media.hasFile()) setHasMultipart(true);
    }

    /**
     * Required
     * @param media media
     * @param inline_message_id inline message id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#editMessageMedia(String, InputMedia)}
     */
    public EditMessageMedia(InputMedia media, String inline_message_id, RequestSender requestSender) {
        super(requestSender, "editMessageMedia", Boolean.class);
        add("media", media);
        add("inline_message_id", inline_message_id);
        if (media.hasFile()) setHasMultipart(true);

    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for a new inline keyboard.
     * @return {@link EditMessageMedia}
     */
    public EditMessageMedia replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageMedia}
     */
    public EditMessageMedia businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
