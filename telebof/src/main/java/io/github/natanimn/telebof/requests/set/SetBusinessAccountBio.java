package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetBusinessAccountBio class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountBio
 */
public class SetBusinessAccountBio extends AbstractBaseRequest<SetBusinessAccountBio, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param api api
     */
    public SetBusinessAccountBio(String businessConnectionId, Api api){
        super(api, "setBusinessAccountBio", Boolean.class);
        add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param bio The new value of the bio for the business account; 0-140 characters
     * @return {@link SetBusinessAccountBio}
     */
    public SetBusinessAccountBio bio(String bio){
        return add("bio", bio);
    }
}
