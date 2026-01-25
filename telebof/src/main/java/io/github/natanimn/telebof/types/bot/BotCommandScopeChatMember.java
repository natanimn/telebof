package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the scope of bot commands, covering a specific member of a group or supergroup chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BotCommandScopeChatMember extends BotCommandScope {
    @SerializedName("chat_id")
    private Object chatId;

    public BotCommandScopeChatMember(Object chatId) {
        super("chat_member");
        this.chatId = chatId;
    }
}
