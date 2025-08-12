package io.github.natanimn.requests.answer;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.media_and_service.SentWebAppMessage;

/**
 * AnswerWebAppQuery class. Returns {@link SentWebAppMessage} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#answerWebAppQuery}
 */
public class AnswerWebAppQuery extends AbstractBaseRequest<AnswerWebAppQuery, SentWebAppMessage> {
    /**
     * Required
     * @param web_app_query_id web app query id
     * @param result result
     * @param requestSender request sender
     */
    public AnswerWebAppQuery(String web_app_query_id, InlineQueryResult result, RequestSender requestSender) {
        super(requestSender, "answerWebAppQuery", SentWebAppMessage.class);
        add("web_app_query_id", web_app_query_id);
        add("result", result);
    }

}
