package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Removes verification from a user who is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 1.3.0
 */
public class RemoveUserVerification extends AbstractBaseRequest<RemoveUserVerification, Boolean> {
    /**
     * @param userId Unique identifier of the target user
     * @param api api
     */
    public RemoveUserVerification(long userId, Api api){
        super(api, "removeUserVerification");
        add("user_id", userId);
    }

}
