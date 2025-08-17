package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * RefundStarPayment class. Returns True on success.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.9
 */
public class RefundStarPayment extends AbstractBaseRequest<RefundStarPayment, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param telegram_payment_charge_id telegram payment charge id
     * @param api api
     */
    public RefundStarPayment(long user_id, String telegram_payment_charge_id, Api api){
        super(api, "refundStarPayment");
        add("user_id", user_id);
        add("telegram_payment_charge_id", telegram_payment_charge_id);
    }

}
