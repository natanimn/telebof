package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.media_and_service.SentWebAppMessage;

/**
 * AnswerWebAppQuery class. Returns {@link SentWebAppMessage} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#answerWebAppQuery
 */
public class AnswerWebAppQuery extends AbstractBaseRequest<AnswerWebAppQuery, SentWebAppMessage> {
    /**
     * Required
     * @param webAppQueryId web app query id
     * @param result result
     * @param api api
     */
    public AnswerWebAppQuery(String webAppQueryId, InlineQueryResult result, Api api) {
        super(api, "answerWebAppQuery", SentWebAppMessage.class);
        add("web_app_query_id", webAppQueryId);
        add("result", result);
    }

}
