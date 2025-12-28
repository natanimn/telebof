package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendGame class. Returns the sent {@link Message}
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendGame
 */
public class SendGame extends SendBuilder<SendGame, Message> {
    /**
     * Required
     * @param chatId chat id
     * @param gameShortName game short name
     * @param api api
     */
    public SendGame(long chatId, String gameShortName, Api api) {
        super(chatId, api, "sendGame");
        add("game_short_name", gameShortName);
    }

}
