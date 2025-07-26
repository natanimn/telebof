package io.github.natanimn.requests;

import io.github.natanimn.types.payments.ShippingOption;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class AnswerShippingQuery extends AbstractBaseRequest<AnswerShippingQuery, Boolean> {
    public AnswerShippingQuery(String shippingQueryId, boolean ok, RequestSender requestSender) {
        super(requestSender, "answerShippingQuery");
        add("shipping_query_id", shippingQueryId);
        add("ok", ok);
    }

    public AnswerShippingQuery shippingOptions(ShippingOption[] shippingOptions) {
        return add("shipping_options", List.of(shippingOptions));
    }
    public AnswerShippingQuery errorMessage(String errorMessage) {
        return add("error_message", errorMessage);
    }

}
