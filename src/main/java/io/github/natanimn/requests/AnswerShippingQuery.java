package io.github.natanimn.requests;

import io.github.natanimn.types.ShippingOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
