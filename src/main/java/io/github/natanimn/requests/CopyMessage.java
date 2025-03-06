package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.Markup;
import io.github.natanimn.types.MessageEntity;
import io.github.natanimn.types.MessageId;
import io.github.natanimn.types.ReplyParameters;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class CopyMessage extends AbstractBaseRequest<CopyMessage, MessageId> {

    public CopyMessage(Object chat, Object fromChatId, int messageId, RequestSender requestSender) {
        super(chat, requestSender, "copyMessage", MessageId.class);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    public CopyMessage messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public CopyMessage parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode != null?parseMode.name():null);
    }

    public CopyMessage disableWebPagePreview(boolean disableWebPagePreview) {
        return add("disable_web_page_preview", disableWebPagePreview);
    }

    public CopyMessage disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public CopyMessage protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public CopyMessage replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public CopyMessage allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public CopyMessage replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public CopyMessage replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public CopyMessage businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public CopyMessage caption(String cap) {
        return add("caption", cap);
    }

    public CopyMessage captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public CopyMessage showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }
}
