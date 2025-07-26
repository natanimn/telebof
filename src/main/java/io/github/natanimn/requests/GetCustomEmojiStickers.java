package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.media_and_service.Sticker;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetCustomEmojiStickers extends AbstractBaseRequest<GetCustomEmojiStickers, List<Sticker>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, Sticker.class).getType();

    public GetCustomEmojiStickers(String[] customEmojiIds, RequestSender requestSender) {
        super(requestSender, "getCustomEmojiStickers", responseType);
        add("custom_emoji_ids", List.of(customEmojiIds));
    }

}
