package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object contains information about the bot that was created to be managed by the current bot.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class ManagedBotCreated {
    /**
     * Information about the bot. The bot's token can be fetched using the method getManagedBotToken.
     */
    private User bot;

    public User getBot() {
        return bot;
    }
}
