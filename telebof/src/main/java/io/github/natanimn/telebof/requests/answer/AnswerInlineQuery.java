package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.inline.InlineQueryResultsButton;

/**
 * AnswerInlineQuery clas. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#answerInlineQuery
 */
public class AnswerInlineQuery extends AbstractBaseRequest<AnswerInlineQuery, Boolean> {
    /**
     * Required
     * @param inlineQueryId inline query id
     * @param results results
     * @param api api
     */
    public AnswerInlineQuery(String inlineQueryId, InlineQueryResult[] results, Api api) {
        super(api, "answerInlineQuery");
        add("inline_query_id", inlineQueryId);
        add("results", results);
    }

    /**
     * Optional
     * @param cacheTime The maximum amount of time in seconds that the result of the inline query may be cached on the server. Defaults to 300.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery cacheTime(int cacheTime) {
        return add("cache_time", cacheTime);
    }

    /**
     * Optional
     * @param isPersonal Pass True if results may be cached on the server side only for the user that sent the query.
     *                    By default, results may be returned to any user who sends the same query.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery isPersonal(boolean isPersonal) {
        return add("is_personal", isPersonal);
    }

    /**
     * Optional
     * @param nextOffset Pass the offset that a client should send in the next query with the same text to receive more results.
     *                    Pass an empty string if there are no more results or if you don't support pagination.
     *                    Offset length can't exceed 64 bytes.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery nextOffset(String nextOffset) {
        return add("next_offset", nextOffset);
    }

    /**
     * Optional
     * @param button A JSON-serialized object describing a button to be shown above inline query results
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery button(InlineQueryResultsButton button){
        return add("button", button);
    }

}
