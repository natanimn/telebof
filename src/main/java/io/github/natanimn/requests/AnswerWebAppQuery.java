package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.InlineQueryResult;
import io.github.natanimn.types.SentWebAppMessage;

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
