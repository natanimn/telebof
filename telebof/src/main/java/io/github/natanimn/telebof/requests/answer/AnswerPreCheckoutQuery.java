package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * AnswerPreCheckoutQuery class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#answerPreCheckoutQuery
 */
public class AnswerPreCheckoutQuery extends AbstractBaseRequest<AnswerPreCheckoutQuery, Boolean> {
    /**
     * Required
     * @param pre_checkout_query_id pre checkout query id
     * @param ok ok
     * @param api api
     */
    public AnswerPreCheckoutQuery(String pre_checkout_query_id, boolean ok, Api api) {
        super(api, "answerPreCheckoutQuery");
        add("pre_checkout_query_id", pre_checkout_query_id);
        add("ok", ok);
    }

    /**
     * Optional
     * @param error_message <b>Required if ok is False.</b><br>
     *                      Error message in human-readable form that explains the reason for failure to proceed with the checkout
     *                      (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts while you were busy filling out your payment details.
     *                      Please choose a different color or garment!"). Telegram will display this message to the user.
     * @return {@link AnswerPreCheckoutQuery}
     */
    public AnswerPreCheckoutQuery errorMessage(String error_message) {
        return add("error_message", error_message);
    }
}
