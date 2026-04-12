package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object contains information about the creation, token update, or owner update of a bot that is managed by the current bot.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class ManagedBotUpdated implements TelegramUpdate{
    /**
     * User that created the bot
     */
    private User user;

    /**
     * Information about the bot. Token of the bot can be fetched using the method getManagedBotToken.
     */
    private User bot;

    public User getUser() {
        return user;
    }

    public User getBot() {
        return bot;
    }
}
