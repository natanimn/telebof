package io.github.natanimn.types.bot;

/**
 * Represents the scope of bot commands, covering all private chats.
 * @author Natanim
 * @since 3 March 2025
 */
public class BotCommandScopeAllPrivateChats extends BotCommandScope {
    public BotCommandScopeAllPrivateChats() {
        super("all_private_chats");
    }
}
