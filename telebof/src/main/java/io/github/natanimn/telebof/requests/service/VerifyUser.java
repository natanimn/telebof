package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Verifies a user on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 1.3.0
 */
public class VerifyUser extends AbstractBaseRequest<VerifyUser, Boolean> {
    /**
     * @param userId Unique identifier of the target user
     * @param api Request
     */
    public VerifyUser(long userId, Api api){
        super(api, "verifyUser");
        add("user_id", userId);
    }

    /**
     * Optional
     * @param customDescription Custom description for the verification; 0-70 characters. Must be empty if the organization
     *                           isn't allowed to provide a custom verification description.
     * @return {@link #VerifyUser}
     */
    public VerifyUser customDescription(String customDescription){
        return add("custom_description", customDescription);
    }
}
