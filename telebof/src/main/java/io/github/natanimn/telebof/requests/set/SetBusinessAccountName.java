package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetBusinessAccountName class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountName
 */
public class SetBusinessAccountName extends AbstractBaseRequest<SetBusinessAccountName, Boolean> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param first_name first name
     * @param api api
     */
    public SetBusinessAccountName(String business_connection_id, String first_name, Api api){
        super(api, "setBusinessAccountName", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("first_name", first_name);
    }

    /**
     * Optional
     * @param last_name The new value of the last name for the business account; 0-64 characters
     * @return {@link SetBusinessAccountName}
     */
    public SetBusinessAccountName lastName(String last_name){
        return add("last_name", last_name);
    }
}
