package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendGame class. Returns the sent {@link Message}
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#sendGame
 */
public class SendGame extends SendBuilder<SendGame, Message> {
    /**
     * Required
     * @param chat_id chat id
     * @param game_short_name game short name
     * @param api api
     */
    public SendGame(long chat_id, String game_short_name, Api api) {
        super(chat_id, api, "sendGame");
        add("game_short_name", game_short_name);
    }

}
