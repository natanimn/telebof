package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SendChatJoinRequestWebApp class. Returns True on success.
 * @author Natanim
 * @since 2.1
 * @see BotContext#sendChatJoinRequestWebApp
 */
public class SendChatJoinRequestWebApp extends AbstractBaseRequest<SendChatJoinRequestWebApp, Boolean> {
    public SendChatJoinRequestWebApp(String chatJoinRequestQueryId, String webAppUrl, Api api){
        super(api, "sendChatJoinRequestWebApp");
        add("chat_join_request_query_id", chatJoinRequestQueryId);
        add("web_app_url", webAppUrl);
    }
}
