package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
