package io.github.natanimn.requests;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.enums.PollType;
import io.github.natanimn.types.InputPollOption;
import io.github.natanimn.types.Markup;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;
import io.github.natanimn.types.ReplyParameters;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A class for sending <b>poll</b> to telegram.
 * @author Natanim Negash
 */

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendPoll extends AbstractBaseRequest<SendPoll, Message> {

    public SendPoll(Object chatId, String question, InputPollOption[] options, RequestSender requestSender) {
        super(chatId, requestSender, "sendPoll", Message.class);
        add("question", question);
        add("options", List.of(options));
    }

    public SendPoll isAnonymous(boolean isAnonymous){
        return add("is_anonymous", isAnonymous);
    }

    public SendPoll type(PollType type){
        return add("type", type.name().toLowerCase());
    }

    public SendPoll allowsMultipleAnswers(boolean allowsMultipleAnswers){
        return add("allows_multiple_answers", allowsMultipleAnswers);
    }

    public SendPoll correctOptionId(int correctOptionId){
        return add("correct_option_id", correctOptionId);
    }

    public SendPoll explanation(String explanation){
        return add("explanation", explanation);
    }

    public SendPoll explanationParseMode(@NotNull ParseMode explanationParseMode){
        return add("explanation_parse_mode", explanationParseMode.name().toLowerCase());
    }

    public SendPoll explanationEntities(MessageEntity[] explanationEntities){
        return add("explanation_entities", List.of(explanationEntities));
    }

    public SendPoll openPeriod(int openPeriod){
        return add("open_period", openPeriod);
    }

    public SendPoll closeDate(int closeDate){
        return add("close_date", closeDate);
    }

    public SendPoll isClosed(boolean isClosed){
        return add("is_closed", isClosed);
    }

    public SendPoll disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendPoll protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }


    @Deprecated(since = "v1.5.0")
    public SendPoll replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }


    @Deprecated(since = "v1.5.0")
    public SendPoll  allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public SendPoll replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public SendPoll replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }


    public SendPoll businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public SendPoll questionParseMode(@NotNull ParseMode question_parse_mode){
        return add("question_parse_mode", question_parse_mode.name());
    }

    public SendPoll questionEntities(MessageEntity[] question_entities){
        return add("question_entities", question_entities);
    }

    public SendPoll messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }

}
