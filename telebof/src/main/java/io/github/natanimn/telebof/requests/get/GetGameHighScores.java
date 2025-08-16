package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.media_and_service.GameHighScore;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetGameHighScores class. Returns a list of {@link GameHighScore}.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class GetGameHighScores extends AbstractBaseRequest<GetGameHighScores, List<GameHighScore>> {
    private static final Type responseType = TypeToken.getParameterized(List.class, GameHighScore.class).getType();

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param message_id message id
     * @param requestSender request sender
     * @see BotContext#getGameHighScores(long, long, int)
     */
    public GetGameHighScores(long chat_id, long user_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "getGameHighScores", responseType);
        add("user_id", user_id);
        add("message_id", message_id);
    }

    /**
     * Required
     * @param inline_message_id inline message id
     * @param user_id user id
     * @param requestSender request sender
     * @see BotContext#getGameHighScores(String, long)
     */
    public GetGameHighScores(String inline_message_id, long user_id, RequestSender requestSender) {
        super(requestSender, "getGameHighScores", responseType);
        add("user_id", user_id);
        add("inline_message_id", inline_message_id);
    }

}
