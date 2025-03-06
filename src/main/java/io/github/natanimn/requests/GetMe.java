package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.User;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetMe extends AbstractBaseRequest<GetMe, User> {
    public GetMe(RequestSender requestSender) {
        super(requestSender, "getMe", User.class);
    }

}
