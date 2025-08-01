package io.github.natanimn.requests;

import io.github.natanimn.types.keyboard.Markup;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.keyboard.ReplyParameters;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendDice extends AbstractBaseRequest<SendDice, Message> {
    public SendDice(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "sendDice", Message.class);
    }

    public SendDice emoji(String emoji) {
        return add("emoji", emoji);
    }

    public SendDice disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendDice protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public SendDice replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public SendDice allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public SendDice replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public SendDice replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

}
