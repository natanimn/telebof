package io.github.natanimn.requests.send;

import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;

/**
 * SendGame class. Returns the sent {@link Message}
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#sendGame}
 */
public class SendGame extends SendBuilder<SendGame, Message> {
    /**
     * Required
     * @param chat_id chat id
     * @param game_short_name game short name
     * @param requestSender request sender
     */
    public SendGame(long chat_id, String game_short_name, RequestSender requestSender) {
        super(chat_id, requestSender, "sendGame");
        add("game_short_name", game_short_name);
    }

}
