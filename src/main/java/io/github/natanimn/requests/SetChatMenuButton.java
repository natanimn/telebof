package io.github.natanimn.requests;

import io.github.natanimn.types.keyboard.MenuButton;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetChatMenuButton extends AbstractBaseRequest<SetChatMenuButton, Boolean> {
    public SetChatMenuButton(RequestSender requestSender) {
        super(requestSender, "setChatMenuButton");
    }

    public SetChatMenuButton chatId(long chatId) {
        return add("chat_id", chatId);
    }

    public SetChatMenuButton menuButton(MenuButton menuButton) {
        return add("menu_button", menuButton);
    }

}
