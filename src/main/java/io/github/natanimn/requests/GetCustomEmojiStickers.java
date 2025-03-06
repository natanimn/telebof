package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.Util;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.Sticker;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetCustomEmojiStickers extends AbstractBaseRequest<GetCustomEmojiStickers, List<Sticker>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, Sticker.class).getType();

    public GetCustomEmojiStickers(String[] customEmojiIds, RequestSender requestSender) {
        super(requestSender, "getCustomEmojiStickers", responseType);
        add("custom_emoji_ids", List.of(customEmojiIds));
    }

}
