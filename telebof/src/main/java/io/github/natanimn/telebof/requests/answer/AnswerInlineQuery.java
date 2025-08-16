package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.inline.InlineQueryResultsButton;

import java.util.List;

/**
 * AnswerInlineQuery clas. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#answerInlineQuery
 */
public class AnswerInlineQuery extends AbstractBaseRequest<AnswerInlineQuery, Boolean> {
    /**
     * Required
     * @param inline_query_id inline query id
     * @param results results
     * @param requestSender request sender
     */
    public AnswerInlineQuery(String inline_query_id, InlineQueryResult[] results, RequestSender requestSender) {
        super(requestSender, "answerInlineQuery");
        add("inline_query_id", inline_query_id);
        add("results", List.of(results));
    }

    /**
     * Optional
     * @param cache_time The maximum amount of time in seconds that the result of the inline query may be cached on the server. Defaults to 300.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery cacheTime(int cache_time) {
        return add("cache_time", cache_time);
    }

    /**
     * Optional
     * @param is_personal Pass True if results may be cached on the server side only for the user that sent the query.
     *                    By default, results may be returned to any user who sends the same query.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery isPersonal(boolean is_personal) {
        return add("is_personal", is_personal);
    }

    /**
     * Optional
     * @param next_offset Pass the offset that a client should send in the next query with the same text to receive more results.
     *                    Pass an empty string if there are no more results or if you don't support pagination.
     *                    Offset length can't exceed 64 bytes.
     * @return {@link AnswerInlineQuery}
     */
    public AnswerInlineQuery nextOffset(String next_offset) {
        return add("next_offset", next_offset);
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
