package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.media_and_service.SentGuestMessage;

/**
 * AnswerGuestQuery class. Returns {@link io.github.natanimn.telebof.types.media_and_service.SentGuestMessage} on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class AnswerGuestQuery extends AbstractBaseRequest<AnswerGuestQuery, SentGuestMessage> {
    public AnswerGuestQuery(String guestQueryId, InlineQueryResult result, Api api){
        super(api, "answerGuestQuery", SentGuestMessage.class);
        add("guest_query_id", guestQueryId);
        add("result", result);
    }
}
