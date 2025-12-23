package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.media_and_service.GameHighScore;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetGameHighScores class. Returns a list of {@link GameHighScore}.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class GetGameHighScores extends AbstractBaseRequest<GetGameHighScores, List<GameHighScore>> {
    private static final Type responseType = TypeToken.getParameterized(List.class, GameHighScore.class).getType();

    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param messageId message id
     * @param api api
     * @see BotContext#getGameHighScores(long, long, int)
     */
    public GetGameHighScores(Object chatId, long userId, int messageId, Api api) {
        super(chatId, api, "getGameHighScores", responseType);
        add("user_id", userId);
        add("message_id", messageId);
    }

    /**
     * Required
     * @param inlineMessageId inline message id
     * @param userId user id
     * @param api api
     * @see BotContext#getGameHighScores(String, long)
     */
    public GetGameHighScores(String inlineMessageId, long userId, Api api) {
        super(api, "getGameHighScores", responseType);
        add("user_id", userId);
        add("inline_message_id", inlineMessageId);
    }

}
