package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SetGameScore class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SetGameScore extends AbstractBaseRequest<SetGameScore, Object> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param score score
     * @param message_id message id
     * @param requestSender request sender
     * @see BotContext#setGameScore(long, long, int, int)
     */
    public SetGameScore(long chat_id, long user_id, int score, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "setGameScore", Message.class);
        add("user_id", user_id);
        add("message_id", message_id);
        add("score", score);
    }

    /**
     * Required
     * @param inline_message_id inline message id
     * @param user_id user id
     * @param score score
     * @param requestSender request sender
     * @see BotContext#setGameScore(String, long, int)
     */
    public SetGameScore(String inline_message_id, long user_id, int score, RequestSender requestSender) {
        super(requestSender, "setGameScore", Boolean.class);
        add("user_id", user_id);
        add("inline_message_id", inline_message_id);
        add("score",score);
    }

    /**
     * Optional
     * @param force Pass True if the high score is allowed to decrease. This can be useful when fixing mistakes or banning cheaters
     * @return {@link SetGameScore}
     */
    public SetGameScore force(boolean force) {
        return add("force", force);
    }

    /**
     * Optional
     * @param disable_edit_message Pass True if the game message should not be automatically edited to include the current scoreboard
     * @return {@link SetGameScore}
     */
    public SetGameScore disableEditMessage(boolean disable_edit_message) {
        return add("disable_edit_message", disable_edit_message);
    }

}
