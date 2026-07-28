package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This object contains information about the creation, token update, or owner update of a bot that is managed by the current bot.
 * @author Natanim
 * @since 1.6.0
 */
@Getter
public class ManagedBotUpdated implements TelegramUpdate, JsonFormatter {
    /**
     * User that created the bot
     */
    private User user;

    /**
     * Information about the bot. Token of the bot can be fetched using the method getManagedBotToken.
     */
    private User bot;

}
