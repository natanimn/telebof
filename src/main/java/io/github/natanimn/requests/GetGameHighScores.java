package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;
import io.github.natanimn.types.GameHighScore;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetGameHighScores extends AbstractBaseRequest<GetGameHighScores, List<GameHighScore>> {
    private static final Type responseType = TypeToken.getParameterized(List.class, GameHighScore.class).getType();

    public GetGameHighScores(long chatId, long userId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "getGameHighScores", responseType);
        add("user_id", userId);
        add("message_id", messageId);
    }

    public GetGameHighScores(String inlineMessageId, long userId, RequestSender requestSender) {
        super(requestSender, "getGameHighScores", responseType);
        add("user_id", userId);
        add("inline_message_id", inlineMessageId);

    }

}
