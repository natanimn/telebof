package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class RefundStarPayment extends AbstractBaseRequest<RefundStarPayment, Boolean> {
    public RefundStarPayment(long user_id, String telegram_payment_charge_id, RequestSender requestSender){
        super(requestSender, "refundStarPayment");
        add("user_id", user_id);
        add("telegram_payment_charge_id", telegram_payment_charge_id);
    }

}
