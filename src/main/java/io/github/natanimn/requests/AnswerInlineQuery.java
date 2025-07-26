package io.github.natanimn.requests;

import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.inline.InlineQueryResultsButton;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class AnswerInlineQuery extends AbstractBaseRequest<AnswerInlineQuery, Boolean> {

    public AnswerInlineQuery(String inlineQueryId, InlineQueryResult[] results, RequestSender requestSender) {
        super(requestSender, "answerInlineQuery");
        add("inline_query_id", inlineQueryId);
        add("results", List.of(results));
    }

    public AnswerInlineQuery cacheTime(int cacheTime) {
        return add("cache_time", cacheTime);
    }

    public AnswerInlineQuery isPersonal(boolean isPersonal) {
        return add("is_personal", isPersonal);
    }

    public AnswerInlineQuery nextOffset(String nextOffset) {
        return add("next_offset", nextOffset);
    }

    public AnswerInlineQuery button(InlineQueryResultsButton button){
        return add("button", button);
    }

}
