package io.github.natanimn.types;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class BotCommandScopeChat extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChat(Object chatId) {
        super("chat");
        this.chat_id = chatId;
    }
}
