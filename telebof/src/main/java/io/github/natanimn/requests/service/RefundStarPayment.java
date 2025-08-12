package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

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
     * @param requestSender request sender
     */
    public RefundStarPayment(long user_id, String telegram_payment_charge_id, RequestSender requestSender){
        super(requestSender, "refundStarPayment");
        add("user_id", user_id);
        add("telegram_payment_charge_id", telegram_payment_charge_id);
    }

}
