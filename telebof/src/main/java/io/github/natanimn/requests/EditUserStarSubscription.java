package io.github.natanimn.requests;

/**
 * A class for sending request of `editUserStarSubscription`
 * @author Natanim
 * @since July 25, 2025
 */
public class EditUserStarSubscription extends AbstractBaseRequest<EditUserStarSubscription, Boolean>{
    public EditUserStarSubscription(Long user_id, String telegram_charge_id, boolean is_canceled, RequestSender rs){
        super(rs, "editUserStarSubscription");
        add("user_id", user_id);
        add("telegram_charge_id", telegram_charge_id);
        add("is_canceled", is_canceled);
    }

}
