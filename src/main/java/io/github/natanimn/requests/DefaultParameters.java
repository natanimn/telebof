package io.github.natanimn.requests;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.Markup;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.ReplyParameters;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;

/**
 * @author Natanim Negash
 */
abstract /**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DefaultParameters<T, R> extends AbstractBaseRequest<T, R> {

    public DefaultParameters(Object chatId, RequestSender requestSender, String methodName) {
        super(chatId, requestSender, methodName, Message.class);
    }

    public DefaultParameters(Object chatId, RequestSender requestSender, String methodName, Type type) {
        super(chatId, requestSender, methodName, type);
    }

    public T messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public T parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode != null?parseMode.name():null);
    }

    public T disableWebPagePreview(boolean disableWebPagePreview) {
        return add("disable_web_page_preview", disableWebPagePreview);
    }

    public T disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public T protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public T replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public T allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public T replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public T replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public T businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public T messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }
}
