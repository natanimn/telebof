package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetBusinessAccountUsername class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountUsername
 */
public class SetBusinessAccountUsername extends AbstractBaseRequest<SetBusinessAccountUsername, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param api api
     */
    public SetBusinessAccountUsername(String businessConnectionId, Api api){
        super(api, "setBusinessAccountUsername", Boolean.class);
        add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param username The new value of the username for the business account; 0-32 characters
     * @return {@link SetBusinessAccountUsername}
     */
    public SetBusinessAccountUsername username(String username){
        return add("username", username);
    }
}
