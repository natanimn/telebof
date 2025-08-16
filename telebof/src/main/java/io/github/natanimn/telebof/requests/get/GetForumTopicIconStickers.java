package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.media_and_service.Sticker;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetForumTopicIconStickers class. Returns a list of {@link Sticker}
 * @author Natanim
 * @since  3 March 2025
 * @version 0.9
 * @see BotContext#getForumTopicIconStickers
 */
public class GetForumTopicIconStickers extends AbstractBaseRequest<GetForumTopicIconStickers, List<Sticker> > {
    private static final Type responseType = TypeToken.getParameterized(List.class, Sticker.class).getType();

    /**
     * Required
     * @param requestSender request sender
     */
    public GetForumTopicIconStickers(RequestSender requestSender) {
        super(requestSender, "getForumTopicIconStickers", responseType);
    }

}
