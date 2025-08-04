package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class AnswerPreCheckoutQuery extends AbstractBaseRequest<AnswerPreCheckoutQuery, Boolean> {
    public AnswerPreCheckoutQuery(String preCheckoutQueryId, boolean ok, RequestSender requestSender) {
        super(requestSender, "answerPreCheckoutQuery");
        add("pre_checkout_query_id", preCheckoutQueryId);
        add("ok", ok);
    }

    public AnswerPreCheckoutQuery errorMessage(String errorMessage) {
        return add("error_message", errorMessage);
    }
}
