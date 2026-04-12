package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.enums.PollType;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputPollOption;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.ReplyParameters;

/**
 * SendPoll class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.6.0
 * @see BotContext#sendPoll
 */
public class SendPoll extends AbstractBaseRequest<SendPoll, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param question question
     * @param options options
     * @param api api
     */
    public SendPoll(Object chatId, String question, InputPollOption[] options, Api api) {
        super(chatId, api, "sendPoll", Message.class);
        add("question", question);
        add("options", options);
    }

    /**
     * Optional
     * @param isAnonymous True, if the poll needs to be anonymous, defaults to True
     * @return {@link SendPoll}
     */
    public SendPoll isAnonymous(boolean isAnonymous){
        return add("is_anonymous", isAnonymous);
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
     * @param allowsMultipleAnswers True, if the poll allows multiple answers, ignored for polls in quiz mode, defaults to False
     * @return {@link SendPoll}
     */
    public SendPoll allowsMultipleAnswers(boolean allowsMultipleAnswers){
        return add("allows_multiple_answers", allowsMultipleAnswers);
    }

    /**
     * Optional
     * @param correctOptionIds A JSON-serialized list of monotonically increasing 0-based identifiers of the correct answer options, required for polls in quiz mode
     * @return {@link SendPoll}
     */
    public SendPoll correctOptionIds(int[] correctOptionIds){
        return add("correct_option_ids", correctOptionIds);
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
     * @param explanationParseMode Mode for parsing entities in the explanation.
     * @return {@link SendPoll}
     */
    public SendPoll explanationParseMode(ParseMode explanationParseMode){
        return add("explanation_parse_mode", explanationParseMode);
    }

    /**
     * Optional
     * @param explanationEntities A JSON-serialized list of special entities that appear in the poll explanation.
     *                             It can be specified instead of explanation_parse_mode
     * @return {@link SendPoll}
     */
    public SendPoll explanationEntities(MessageEntity[] explanationEntities){
        return add("explanation_entities", explanationEntities);
    }

    /**
     * Optional
     * @param openPeriod Amount of time in seconds the poll will be active after creation, 5-600. Can't be used together with close_date.
     * @return {@link SendPoll}
     */
    public SendPoll openPeriod(int openPeriod){
        return add("open_period", openPeriod);
    }

    /**
     * Optional
     * @param closeDate Point in time (Unix timestamp) when the poll will be automatically closed.
     *                   Must be at least 5 and no more than 600 seconds in the future. Can't be used together with open_period.
     * @return {@link SendPoll}
     */
    public SendPoll closeDate(int closeDate){
        return add("close_date", closeDate);
    }

    /**
     * Optional
     * @param isClosed Pass True if the poll needs to be immediately closed. This can be useful for poll preview.
     * @return {@link SendPoll}
     */
    public SendPoll isClosed(boolean isClosed){
        return add("is_closed", isClosed);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendPoll}
     */
    public SendPoll disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link SendPoll}
     */
    public SendPoll protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param allowPaidBroadcast Pass True to allow up to 1000 messages per second, ignoring broadcasting limits for a fee of 0.1 Telegram Stars per message.
     *                             The relevant Stars will be withdrawn from the bot's balance
     * @return {@link SendPoll}
     */
    public SendPoll allowPaidBroadcast(boolean allowPaidBroadcast){
        return add("allow_paid_broadcast", allowPaidBroadcast);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link SendPoll}
     */
    public SendPoll replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendPoll}
     */
    public SendPoll replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendPoll}
     */
    public SendPoll businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param questionParseMode Mode for parsing entities in the question.
     * @return {@link SendPoll}
     */
    public SendPoll questionParseMode(ParseMode questionParseMode){
        return add("question_parse_mode", questionParseMode);
    }

    /**
     * Optional
     * @param questionEntities A JSON-serialized list of special entities that appear in the poll question.
     *                          It can be specified instead of question_parse_mode
     * @return {@link SendPoll}
     */
    public SendPoll questionEntities(MessageEntity[] questionEntities){
        return add("question_entities", questionEntities);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link SendPoll}
     */
    public SendPoll messageEffectId(String messageEffectId){
        return add("message_effect_id ", messageEffectId);
    }

    /**
     * Optional
     * @param allowsRevoting Pass True, if the poll allows to change chosen answer options, defaults to False for quizzes and to True for regular polls
     * @return {@link SendPoll}
     */
    public SendPoll allowsRevoting(Boolean allowsRevoting){
        return add("allows_revoting", allowsRevoting);
    }

    /**
     * Optional
     * @param shuffleOptions Pass True, if the poll options must be shown in random order
     * @return {@link SendPoll}
     */
    public SendPoll shuffleOptions(Boolean shuffleOptions){
        return add("shuffle_options", shuffleOptions);
    }

    /**
     * Optional
     * @param allowAddingOptions Pass True, if answer options can be added to the poll after creation; not supported for anonymous polls and quizzes
     * @return {@link SendPoll}
     */
    public SendPoll allowAddingOptions(Boolean allowAddingOptions){
        return add("allow_adding_options", allowAddingOptions);
    }

    /**
     * Optional
     * @param hideResultsUntilCloses Pass True, if poll results must be shown only after the poll closes
     * @return {@link SendPoll}
     */
    public SendPoll hideResultsUntilCloses(Boolean hideResultsUntilCloses){
        return add("hide_results_until_closes", hideResultsUntilCloses);
    }

    /**
     * Optional
     * @param description Description of the poll to be sent, 0-1024 characters after entities parsing
     * @return {@link SendPoll}
     */
    public SendPoll description(String description){
        return add("description", description);
    }

    /**
     * Optional
     * @param descriptionParseMode Mode for parsing entities in the poll description.
     * @return {@link SendPoll}
     */
    public SendPoll descriptionParseMode(ParseMode descriptionParseMode){
        return add("description_parse_mode", descriptionParseMode);
    }

    /**
     * Optional
     * @param descriptionEntities A JSON-serialized list of special entities that appear in the poll description, which can be specified instead of {@link #descriptionParseMode(ParseMode)}
     * @return {@link SendPoll}
     */
    public SendPoll descriptionEntities(MessageEntity[] descriptionEntities){
        return add("description_entities", descriptionEntities);
    }
}
