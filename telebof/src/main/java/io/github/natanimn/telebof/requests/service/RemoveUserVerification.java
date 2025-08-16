package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * Removes verification from a user who is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 0.8
 */
public class RemoveUserVerification extends AbstractBaseRequest<RemoveUserVerification, Boolean> {
    /**
     * @param user_id Unique identifier of the target user
     * @param rs Request sender
     */
    public RemoveUserVerification(long user_id, RequestSender rs){
        super(rs, "removeUserVerification");
        add("user_id", user_id);
    }

}
