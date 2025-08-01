package io.github.natanimn.types.bot;

/**
 * Represents the scope of bot commands, covering all group and supergroup chats.
 * @author Natanim
 * @since 3 March 2025
 */
public class BotCommandScopeAllGroupChats extends BotCommandScope {
    public BotCommandScopeAllGroupChats() {
        super("all_group_chats");
    }
}
