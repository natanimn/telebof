package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * Verifies a user on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 0.8
 */
public class VerifyUser extends AbstractBaseRequest<VerifyUser, Boolean> {
    /**
     * @param user_id Unique identifier of the target user
     * @param rs Request
     */
    public VerifyUser(long user_id, RequestSender rs){
        super(rs, "verifyUser");
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param custom_description Custom description for the verification; 0-70 characters. Must be empty if the organization
     *                           isn't allowed to provide a custom verification description.
     * @return {@link #VerifyUser}
     */
    public VerifyUser customDescription(String custom_description){
        return add("custom_description", custom_description);
    }
}
