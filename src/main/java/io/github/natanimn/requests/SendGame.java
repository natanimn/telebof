package io.github.natanimn.requests;

import io.github.natanimn.types.Message;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendGame extends DefaultParameters<SendGame, Message> {
    public SendGame(long chatId, String gameShortName, RequestSender requestSender) {
        super(chatId, requestSender, "sendGame");
        add("game_short_name", gameShortName);
    }

}
