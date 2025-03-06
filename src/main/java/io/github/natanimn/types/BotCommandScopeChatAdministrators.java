package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotCommandScopeChatAdministrators extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatAdministrators(Object chatId) {
        super("chat_administrators");
        this.chat_id = chatId;
    }
}
