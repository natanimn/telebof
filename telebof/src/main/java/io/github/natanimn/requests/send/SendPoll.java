package io.github.natanimn.requests.send;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.enums.PollType;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.input.InputPollOption;
import io.github.natanimn.types.keyboard.Markup;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import io.github.natanimn.types.keyboard.ReplyParameters;
import java.util.List;

/**
 * SendPoll class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#sendPoll}
 */
public class SendPoll extends AbstractBaseRequest<SendPoll, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param question question
     * @param options options
     * @param requestSender request sender
     */
    public SendPoll(Object chat_id, String question, InputPollOption[] options, RequestSender requestSender) {
        super(chat_id, requestSender, "sendPoll", Message.class);
        add("question", question);
        add("options", List.of(options));
    }

    /**
     * Optional
     * @param is_anonymous True, if the poll needs to be anonymous, defaults to True
     * @return {@link SendPoll}
     */
    public SendPoll isAnonymous(boolean is_anonymous){
        return add("is_anonymous", is_anonymous);
    }

    /**
     * Optional
     * @param type Poll type, {@link PollType#QUIZ} or {@link PollType#REGULAR}, defaults to {@link PollType#REGULAR}
     * @return {@link SendPoll}
     */
    public SendPoll type(PollType type){
        return add("type", type);
    }

    /**
     * Optional
     * @param allows_multiple_answers True, if the poll allows multiple answers, ignored for polls in quiz mode, defaults to False
     * @return {@link SendPoll}
     */
    public SendPoll allowsMultipleAnswers(boolean allows_multiple_answers){
        return add("allows_multiple_answers", allows_multiple_answers);
    }

    /**
     * Optional
     * @param correct_option_id 0-based identifier of the correct answer option, required for polls in quiz mode
     * @return {@link SendPoll}
     */
    public SendPoll correctOptionId(int correct_option_id){
        return add("correct_option_id", correct_option_id);
    }

    /**
     * Optional
     * @param explanation Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll,
     *                    0-200 characters with at most 2 line feeds after entities parsing
     * @return {@link SendPoll}
     */
    public SendPoll explanation(String explanation){
        return add("explanation", explanation);
    }

    /**
     * Optional
     * @param explanation_parse_mode Mode for parsing entities in the explanation.
     * @return {@link SendPoll}
     */
    public SendPoll explanationParseMode(ParseMode explanation_parse_mode){
        return add("explanation_parse_mode", explanation_parse_mode);
    }

    /**
     * Optional
     * @param explanation_entities A JSON-serialized list of special entities that appear in the poll explanation.
     *                             It can be specified instead of explanation_parse_mode
     * @return {@link SendPoll}
     */
    public SendPoll explanationEntities(MessageEntity[] explanation_entities){
        return add("explanation_entities", List.of(explanation_entities));
    }

    /**
     * Optional
     * @param open_period Amount of time in seconds the poll will be active after creation, 5-600. Can't be used together with close_date.
     * @return {@link SendPoll}
     */
    public SendPoll openPeriod(int open_period){
        return add("open_period", open_period);
    }

    /**
     * Optional
     * @param close_date Point in time (Unix timestamp) when the poll will be automatically closed.
     *                   Must be at least 5 and no more than 600 seconds in the future. Can't be used together with open_period.
     * @return {@link SendPoll}
     */
    public SendPoll closeDate(int close_date){
        return add("close_date", close_date);
    }

    /**
     * Optional
     * @param is_closed Pass True if the poll needs to be immediately closed. This can be useful for poll preview.
     * @return {@link SendPoll}
     */
    public SendPoll isClosed(boolean is_closed){
        return add("is_closed", is_closed);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendPoll}
     */
    public SendPoll disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link SendPoll}
     */
    public SendPoll protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param allow_paid_broadcast Pass True to allow up to 1000 messages per second, ignoring broadcasting limits for a fee of 0.1 Telegram Stars per message.
     *                             The relevant Stars will be withdrawn from the bot's balance
     * @return {@link SendPoll}
     */
    public SendPoll allowPaidBroadcast(boolean allow_paid_broadcast){
        return add("allow_paid_broadcast", allow_paid_broadcast);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link SendPoll}
     */
    public SendPoll replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendPoll}
     */
    public SendPoll replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendPoll}
     */
    public SendPoll businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param question_parse_mode Mode for parsing entities in the question.
     * @return {@link SendPoll}
     */
    public SendPoll questionParseMode(ParseMode question_parse_mode){
        return add("question_parse_mode", question_parse_mode);
    }

    /**
     * Optional
     * @param question_entities A JSON-serialized list of special entities that appear in the poll question.
     *                          It can be specified instead of question_parse_mode
     * @return {@link SendPoll}
     */
    public SendPoll questionEntities(MessageEntity[] question_entities){
        return add("question_entities", question_entities);
    }

    /**
     * Optional
     * @param message_effect_id Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link SendPoll}
     */
    public SendPoll messageEffectId(String message_effect_id){
        return add("message_effect_id ", message_effect_id);
    }

}
