package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SetGameScore class.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SetGameScore extends AbstractBaseRequest<SetGameScore, Object> {
    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param score score
     * @param messageId message id
     * @param api api
     * @see BotContext#setGameScore(long, long, int, int)
     */
    public SetGameScore(long chatId, long userId, int score, int messageId, Api api) {
        super(chatId, api, "setGameScore", Message.class);
        add("user_id", userId);
        add("message_id", messageId);
        add("score", score);
    }

    /**
     * Required
     * @param inlineMessageId inline message id
     * @param userId user id
     * @param score score
     * @param api api
     * @see BotContext#setGameScore(String, long, int)
     */
    public SetGameScore(String inlineMessageId, long userId, int score, Api api) {
        super(api, "setGameScore", Boolean.class);
        add("user_id", userId);
        add("inline_message_id", inlineMessageId);
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
     * @param disableEditMessage Pass True if the game message should not be automatically edited to include the current scoreboard
     * @return {@link SetGameScore}
     */
    public SetGameScore disableEditMessage(boolean disableEditMessage) {
        return add("disable_edit_message", disableEditMessage);
    }

}
