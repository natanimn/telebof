package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.passport.PassportElementError;

/**
 * SetPassportDataErrors class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setPassportDataErrors}
 */
public class SetPassportDataErrors extends AbstractBaseRequest<SetPassportDataErrors, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param errors errors
     * @param requestSender request sender
     */
    public SetPassportDataErrors(long user_id, PassportElementError[] errors, RequestSender requestSender) {
        super(requestSender, "setPassportDataErrors");
        add("user_id", user_id);
        add("errors", errors);
    }

}
