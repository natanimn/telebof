package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.passport.PassportElementError;

/**
 * SetPassportDataErrors class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setPassportDataErrors
 */
public class SetPassportDataErrors extends AbstractBaseRequest<SetPassportDataErrors, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param errors errors
     * @param api api
     */
    public SetPassportDataErrors(long user_id, PassportElementError[] errors, Api api) {
        super(api, "setPassportDataErrors");
        add("user_id", user_id);
        add("errors", errors);
    }

}
