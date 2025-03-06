package io.github.natanimn.requests;

import io.github.natanimn.types.PassportElementError;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetPassportDataErrors extends AbstractBaseRequest<SetPassportDataErrors, Boolean> {
    public SetPassportDataErrors(long userId, PassportElementError[] errors, RequestSender requestSender) {
        super(requestSender, "setPassportDataErrors");
        add("user_id", userId);
        add("errors", errors);
    }

}
