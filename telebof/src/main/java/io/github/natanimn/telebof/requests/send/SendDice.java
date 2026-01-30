package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.log.BotLog;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendDice class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendDice
 */
public class SendDice extends SendBuilder<SendDice, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public SendDice(Object chatId, Api api) {
        super(chatId, api, "sendDice", Message.class);
    }

    /**
     * Optional
     * @param emoji Emoji on which the dice throw animation is based.
     *              Currently, must be one of “🎲”, “🎯”, “🏀”, “⚽”, “🎳”, or “🎰”. Dice can have values 1-6 for “🎲”, “🎯” and “🎳”,
     *              values 1-5 for “🏀” and “⚽”, and values 1-64 for “🎰”. Defaults to “🎲”
     * @return {@link SendDice}
     */
    public SendDice emoji(String emoji) {
        return add("emoji", emoji);
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendDice disableWebPagePreview(boolean disableWebPagePreview) {
        BotLog.warn("`sendDice` method doesn't support disable_web_page_preview");
        return this;
    }
}
