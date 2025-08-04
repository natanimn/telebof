package io.github.natanimn.types.bot;

/**
 * Represents the scope of bot commands, covering all administrators of a specific group or supergroup chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class BotCommandScopeChatAdministrators extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatAdministrators(Object chatId) {
        super("chat_administrators");
        this.chat_id = chatId;
    }
}
