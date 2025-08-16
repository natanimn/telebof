package io.github.natanimn.telebof.requests.answer;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * AnswerCallbackQuery class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#answerCallbackQuery
 */
public class AnswerCallbackQuery extends AbstractBaseRequest<AnswerCallbackQuery, Boolean> {
    /**
     * Required
     * @param callback_query_id callback query id
     * @param requestSender request sender
     */
    public AnswerCallbackQuery(String callback_query_id, RequestSender requestSender) {
        super(requestSender, "answerCallbackQuery");
        add("callback_query_id", callback_query_id);
    }

    /**
     * Optional
     * @param text Text of the notification. If not specified, nothing will be shown to the user, 0-200 characters
     * @return {@link AnswerCallbackQuery}
     */
    public AnswerCallbackQuery text(String text){
        return add("text", text);
    }

    /**
     * Optional
     * @param show_alert If True, an alert will be shown by the client instead of a notification at the top of the chat screen. Defaults to false.
     * @return {@link AnswerCallbackQuery}
     */
    public AnswerCallbackQuery showAlert(boolean show_alert){
        return add("show_alert", show_alert);
    }

    /**
     * Optional
     * @param url URL that will be opened by the user's client.
     *            If you have created a <a href="https://core.telegram.org/bots/api#game">Game</a> and accepted the conditions via @BotFather, specify the URL that opens your game<br>
     *            <b>note</b> that this will only work if the query comes from a <a href="https://core.telegram.org/bots/api#inlinekeyboardbutton">callback_game</a> button.<br>
     *            Otherwise, you may use links like t.me/your_bot?start=XXXX that open your bot with a parameter.
     * @return {@link AnswerCallbackQuery}
     */
    public AnswerCallbackQuery url(String url){
        return add("url", url);
    }

    /**
     * Optional
     * @param cache_time The maximum amount of time in seconds that the result of the callback query may be cached client-side.
     *                   Telegram apps will support caching starting in version 3.14. Defaults to 0.
     * @return {@link AnswerCallbackQuery}
     */
    public AnswerCallbackQuery cacheTime(int cache_time){
        return add("cache_time", cache_time);
    }

}
