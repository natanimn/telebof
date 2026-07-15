package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ChatJoinRequestResult;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * AnswerChatJoinRequestQuery class. Returns True on success.
 * @author Natanim
 * @since 2.1
 * @see BotContext#answerChatJoinRequestQuery
 */
public class AnswerChatJoinRequestQuery extends AbstractBaseRequest<AnswerChatJoinRequestQuery, Boolean> {
    public AnswerChatJoinRequestQuery(String chatJoinRequestQueryId, ChatJoinRequestResult result, Api api){
        super(api, "answerChatJoinRequestQuery");
        add("chat_join_request_query_id", chatJoinRequestQueryId);
        add("result", result);
    }
}
