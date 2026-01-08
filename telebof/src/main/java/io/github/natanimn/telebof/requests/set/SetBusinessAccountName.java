package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetBusinessAccountName class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountName
 */
public class SetBusinessAccountName extends AbstractBaseRequest<SetBusinessAccountName, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param firstName first name
     * @param api api
     */
    public SetBusinessAccountName(String businessConnectionId, String firstName, Api api){
        super(api, "setBusinessAccountName", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("first_name", firstName);
    }

    /**
     * Optional
     * @param lastName The new value of the last name for the business account; 0-64 characters
     * @return {@link SetBusinessAccountName}
     */
    public SetBusinessAccountName lastName(String lastName){
        return add("last_name", lastName);
    }
}
