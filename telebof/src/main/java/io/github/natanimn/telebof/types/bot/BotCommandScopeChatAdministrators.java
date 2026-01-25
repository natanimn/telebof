package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the scope of bot commands, covering all administrators of a specific group or supergroup chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BotCommandScopeChatAdministrators extends BotCommandScope {
    @SerializedName("chat_id")
    private Object chatId;
    public BotCommandScopeChatAdministrators(Object chatId) {
        super("chat_administrators");
        this.chatId = chatId;
    }
}
