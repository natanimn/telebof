package io.github.natanimn.requests.set;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.keyboard.MenuButton;

/**
 * SetChatMenuButton class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#setChatMenuButton}
 */
public class SetChatMenuButton extends AbstractBaseRequest<SetChatMenuButton, Boolean> {
    /**
     * Required
     * @param requestSender request sender
     */
    public SetChatMenuButton(RequestSender requestSender) {
        super(requestSender, "setChatMenuButton");
    }

    /**
     * Optional
     * @param chat_id Unique identifier for the target private chat. If not specified, default bot's menu button will be changed
     * @return {@link SetChatMenuButton}
     */
    public SetChatMenuButton chatId(long chat_id) {
        return add("chat_id", chat_id);
    }

    /**
     * Optional
     * @param menu_button A JSON-serialized object for the bot's new menu button. Defaults to {@link io.github.natanimn.enums.MenuButtonType#DEFAULT}
     * @return {@link SetChatMenuButton}
     */
    public SetChatMenuButton menuButton(MenuButton menu_button) {
        return add("menu_button", menu_button);
    }

}
