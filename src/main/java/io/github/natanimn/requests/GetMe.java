package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.User;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetMe extends AbstractBaseRequest<GetMe, User> {
    public GetMe(RequestSender requestSender) {
        super(requestSender, "getMe", User.class);
    }

}
