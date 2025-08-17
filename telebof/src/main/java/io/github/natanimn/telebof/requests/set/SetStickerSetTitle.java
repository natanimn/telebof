package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
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
     * @param api api
     */
    public SetStickerSetTitle(String name, String title, Api api) {
        super(api, "setStickerSetTitle");
        add("name", name);
        add("title", title);
    }

}
