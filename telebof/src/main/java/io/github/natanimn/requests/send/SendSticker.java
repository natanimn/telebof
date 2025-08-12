package io.github.natanimn.requests.send;

import io.github.natanimn.BotLog;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * SendSticker class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 *
 */
public class SendSticker extends SendBuilder<SendSticker, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param sticker sticker
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#sendSticker(Object, File)}
     */
    public SendSticker(Object chat_id, File sticker, RequestSender requestSender) {
        super(chat_id, requestSender, "sendSticker");
        add("sticker", sticker);
    }

    /**
     * Required
     * @param chat_id chat id
     * @param sticker sticker
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#sendSticker(Object, String)}
     */
    public SendSticker(Object chat_id, String sticker, RequestSender requestSender) {
        super(chat_id, requestSender, "sendSticker");
        add("sticker", sticker);
    }

    /**
     * Optional
     * @param emoji Emoji associated with the sticker; only for just uploaded stickers
     * @return {@link SendSticker}
     */
    public SendSticker emoji(String emoji) {
        return add("emoji", emoji);
    }

    /*
     * Not implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendSticker parseMode(@NotNull ParseMode parseM) {
        BotLog.warn("`sendSticker` method does not support parseMode option.");
        return this;
    }

}
