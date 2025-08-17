package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.payments.ShippingOption;

import java.util.List;

/**
 * AnswerShippingQuery class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#answerShippingQuery
 */
public class AnswerShippingQuery extends AbstractBaseRequest<AnswerShippingQuery, Boolean> {
    /**
     * Required
     * @param shipping_query_id shipping query id
     * @param ok ok
     * @param api api
     */
    public AnswerShippingQuery(String shipping_query_id, boolean ok, Api api) {
        super(api, "answerShippingQuery");
        add("shipping_query_id", shipping_query_id);
        add("ok", ok);
    }

    /**
     * Optional
     * @param shipping_options <b>Required if ok is True.</b><br>
     *                        A JSON-serialized array of available shipping options.
     * @return {@link AnswerShippingQuery}
     */
    public AnswerShippingQuery shippingOptions(ShippingOption[] shipping_options) {
        return add("shipping_options", List.of(shipping_options));
    }

    /**
     * Optional
     * @param error_message <b>Required if ok is False.</b><br>
     *                      Error message in human-readable form that explains why it is impossible to complete the order (e.g. “Sorry, delivery to your desired address is unavailable”).
     *                      Telegram will display this message to the user.
     * @return {@link AnswerShippingQuery}
     */
    public AnswerShippingQuery errorMessage(String error_message) {
        return add("error_message", error_message);
    }

}
