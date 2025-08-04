package io.github.natanimn.types.bot;

/**
 * This class is part of {@link BotCommandScope}.
 * Represents the scope of bot commands, covering all group and supergroup chat administrators.
 * @author Natanim
 * @since 3 March 2025
 */
public class BotCommandScopeAllChatAdministrators extends BotCommandScope {
    public BotCommandScopeAllChatAdministrators() {
        super("all_chat_administrators");
    }
}
