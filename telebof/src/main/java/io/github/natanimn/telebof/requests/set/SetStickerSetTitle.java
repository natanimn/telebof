package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * SetStickerSetTitle class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setStickerSetTitle
 */
public class SetStickerSetTitle extends AbstractBaseRequest<SetStickerSetTitle, Boolean> {
    /**
     * Required
     * @param name name
     * @param title title
     * @param requestSender request sender
     */
    public SetStickerSetTitle(String name, String title, RequestSender requestSender) {
        super(requestSender, "setStickerSetTitle");
        add("name", name);
        add("title", title);
    }

}
