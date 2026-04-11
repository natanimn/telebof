package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * GetManagedBotToken class. Returns the token as String on success.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class GetManagedBotToken extends AbstractBaseRequest<GetManagedBotToken, String> {
    public GetManagedBotToken(long userId, Api api){
        super(api, "getManagedBotToken", String.class);
        add("user_id", userId);
    }
}
