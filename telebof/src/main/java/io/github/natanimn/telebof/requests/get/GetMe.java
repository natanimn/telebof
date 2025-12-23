package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class GetMe extends AbstractBaseRequest<GetMe, User> {
    public GetMe(Api api) {
        super(api, "getMe", User.class);
    }

}
