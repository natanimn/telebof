package io.github.natanimn.requests;

import io.github.natanimn.types.passport.PassportElementError;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetPassportDataErrors extends AbstractBaseRequest<SetPassportDataErrors, Boolean> {
    public SetPassportDataErrors(long userId, PassportElementError[] errors, RequestSender requestSender) {
        super(requestSender, "setPassportDataErrors");
        add("user_id", userId);
        add("errors", errors);
    }

}
