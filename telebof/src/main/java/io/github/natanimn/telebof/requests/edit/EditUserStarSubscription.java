package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * A class for sending request of `editUserStarSubscription`
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */
public class EditUserStarSubscription extends AbstractBaseRequest<EditUserStarSubscription, Boolean> {
    public EditUserStarSubscription(long userId, String telegramChargeId, boolean isCanceled, Api rs){
        super(rs, "editUserStarSubscription");
        add("user_id", userId);
        add("telegram_charge_id", telegramChargeId);
        add("is_canceled", isCanceled);
    }

}
