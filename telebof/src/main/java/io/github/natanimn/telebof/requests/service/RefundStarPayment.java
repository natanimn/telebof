package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * RefundStarPayment class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class RefundStarPayment extends AbstractBaseRequest<RefundStarPayment, Boolean> {
    /**
     * Required
     * @param userId user id
     * @param telegramPaymentChargeId telegram payment charge id
     * @param api api
     */
    public RefundStarPayment(long userId, String telegramPaymentChargeId, Api api){
        super(api, "refundStarPayment");
        add("user_id", userId);
        add("telegram_payment_charge_id", telegramPaymentChargeId);
    }

}
