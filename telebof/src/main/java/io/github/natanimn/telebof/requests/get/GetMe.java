package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetMe extends AbstractBaseRequest<GetMe, User> {
    public GetMe(RequestSender requestSender) {
        super(requestSender, "getMe", User.class);
    }

}
