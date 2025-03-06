package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class RefundStarPayment extends AbstractBaseRequest<RefundStarPayment, Boolean> {
    public RefundStarPayment(long user_id, String telegram_payment_charge_id, RequestSender requestSender){
        super(requestSender, "refundStarPayment");
        add("user_id", user_id);
        add("telegram_payment_charge_id", telegram_payment_charge_id);
    }

}
