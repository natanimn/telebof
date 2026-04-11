package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ReplaceManagedBotToken class. Returns the new token as String on success.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class ReplaceManagedBotToken extends AbstractBaseRequest<ReplaceManagedBotToken, String> {
    public ReplaceManagedBotToken(long userId, Api api){
        super(api, "replaceManagedBotToken", String.class);
        add("user_id", userId);
    }
}
