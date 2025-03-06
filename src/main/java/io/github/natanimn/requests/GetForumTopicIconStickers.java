package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;
import io.github.natanimn.types.Sticker;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetForumTopicIconStickers extends AbstractBaseRequest<GetForumTopicIconStickers, List<Sticker> > {
    private static final Type responseType = TypeToken.getParameterized(List.class, Sticker.class).getType();
    public GetForumTopicIconStickers(RequestSender requestSender) {
        super(requestSender, "getForumTopicIconStickers", responseType);
    }

}
