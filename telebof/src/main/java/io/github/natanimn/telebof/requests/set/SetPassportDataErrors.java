package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.passport.PassportElementError;

/**
 * SetPassportDataErrors class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setPassportDataErrors
 */
public class SetPassportDataErrors extends AbstractBaseRequest<SetPassportDataErrors, Boolean> {
    /**
     * Required
     * @param userId user id
     * @param errors errors
     * @param api api
     */
    public SetPassportDataErrors(long userId, PassportElementError[] errors, Api api) {
        super(api, "setPassportDataErrors");
        add("user_id", userId);
        add("errors", errors);
    }

}
