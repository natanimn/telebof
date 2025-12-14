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
 * @version 1.3.0
 * @see BotContext#answerShippingQuery
 */
public class AnswerShippingQuery extends AbstractBaseRequest<AnswerShippingQuery, Boolean> {
    /**
     * Required
     * @param shippingQueryId shipping query id
     * @param ok ok
     * @param api api
     */
    public AnswerShippingQuery(String shippingQueryId, boolean ok, Api api) {
        super(api, "answerShippingQuery");
        add("shipping_query_id", shippingQueryId);
        add("ok", ok);
    }

    /**
     * Optional
     * @param shippingOptions <b>Required if ok is True.</b><br>
     *                        A JSON-serialized array of available shipping options.
     * @return {@link AnswerShippingQuery}
     */
    public AnswerShippingQuery shippingOptions(ShippingOption[] shippingOptions) {
        return add("shipping_options", shippingOptions);
    }

    /**
     * Optional
     * @param errorMessage <b>Required if ok is False.</b><br>
     *                      Error message in human-readable form that explains why it is impossible to complete the order (e.g. “Sorry, delivery to your desired address is unavailable”).
     *                      Telegram will display this message to the user.
     * @return {@link AnswerShippingQuery}
     */
    public AnswerShippingQuery errorMessage(String errorMessage) {
        return add("error_message", errorMessage);
    }

}
