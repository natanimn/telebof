package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class AnswerCallbackQuery extends AbstractBaseRequest<AnswerCallbackQuery, Boolean> {

    public AnswerCallbackQuery(String callbackQueryId, RequestSender requestSender) {
        super(requestSender, "answerCallbackQuery");
        add("callback_query_id", callbackQueryId);
    }

    public AnswerCallbackQuery text(String text){
        return add("text", text);
    }

    public AnswerCallbackQuery showAlert(boolean showAlert){
        return add("show_alert", showAlert);
    }

    public AnswerCallbackQuery url(String url){
        return add("url", url);
    }

    public AnswerCallbackQuery cacheTime(int cacheTime){
        return add("cache_time", cacheTime);
    }

}
