package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteStickerSet
 */
public class DeleteStickerSet extends AbstractBaseRequest<DeleteStickerSet, Boolean> {
    /**
     * Required
     * @param name name
     * @param requestSender request sender
     */
    public DeleteStickerSet(String name, RequestSender requestSender) {
        super(requestSender, "deleteStickerSet");
        add("name", name);
    }

}
