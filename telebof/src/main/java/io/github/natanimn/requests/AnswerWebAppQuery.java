package io.github.natanimn.requests;

import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.media_and_service.SentWebAppMessage;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class AnswerWebAppQuery extends AbstractBaseRequest<AnswerWebAppQuery, SentWebAppMessage> {
    public AnswerWebAppQuery(String webAppQueryId, InlineQueryResult result, RequestSender requestSender) {
        super(requestSender, "answerWebAppQuery", SentWebAppMessage.class);
        add("web_app_query_id", webAppQueryId);
        add("result", result);
    }

}
