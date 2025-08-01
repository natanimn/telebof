package io.github.natanimn.requests;

import io.github.natanimn.types.updates.Message;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendGame extends DefaultParameters<SendGame, Message> {
    public SendGame(long chatId, String gameShortName, RequestSender requestSender) {
        super(chatId, requestSender, "sendGame");
        add("game_short_name", gameShortName);
    }

}
