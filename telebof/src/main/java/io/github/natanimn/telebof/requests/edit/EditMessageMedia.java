package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputMedia;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * EditMessageMedia class.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class EditMessageMedia extends AbstractBaseRequest<EditMessageMedia, Object> {

    /**
     * Required
     * @param media media
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     * @see BotContext#editMessageMedia(Object, InputMedia, int)
     */
    public EditMessageMedia(InputMedia media, Object chatId, int messageId, Api api) {
        super(chatId, api, "editMessageMedia", Message.class);
        add("media", media);
        add("message_id", messageId);
        if (media.hasFile()) setHasMultipart(true);
    }

    /**
     * Required
     * @param media media
     * @param inlineMessageId inline message id
     * @param api api
     * @see BotContext#editMessageMedia(String, InputMedia)
     */
    public EditMessageMedia(InputMedia media, String inlineMessageId, Api api) {
        super(api, "editMessageMedia", Boolean.class);
        add("media", media);
        add("inline_message_id", inlineMessageId);
        if (media.hasFile()) setHasMultipart(true);

    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for a new inline keyboard.
     * @return {@link EditMessageMedia}
     */
    public EditMessageMedia replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageMedia}
     */
    public EditMessageMedia businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }
}
