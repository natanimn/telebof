package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.log.BotLog;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * SendSticker class.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendSticker extends SendBuilder<SendSticker, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param sticker sticker
     * @param api api
     * @see BotContext#sendSticker(Object, File)
     */
    public SendSticker(Object chatId, File sticker, Api api) {
        super(chatId, api, "sendSticker");
        add("sticker", sticker);
    }

    /**
     * Required
     * @param chatId chat id
     * @param sticker sticker
     * @param api api
     * @see BotContext#sendSticker(Object, String)
     */
    public SendSticker(Object chatId, String sticker, Api api) {
        super(chatId, api, "sendSticker");
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
