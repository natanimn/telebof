package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.Sticker;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetCustomEmojiStickers class. Returns a list of {@link Sticker}
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getCustomEmojiStickers
 */
public class GetCustomEmojiStickers extends AbstractBaseRequest<GetCustomEmojiStickers, List<Sticker>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, Sticker.class).getType();

    /**
     * Required
     * @param custom_emoji_ids custom emoji ids
     * @param api api
     */
    public GetCustomEmojiStickers(String[] custom_emoji_ids, Api api) {
        super(api, "getCustomEmojiStickers", responseType);
        add("custom_emoji_ids", List.of(custom_emoji_ids));
    }

}
