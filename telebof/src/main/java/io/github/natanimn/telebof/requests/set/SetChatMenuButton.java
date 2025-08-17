package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.MenuButtonType;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.MenuButton;

/**
 * SetChatMenuButton class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatMenuButton
 */
public class SetChatMenuButton extends AbstractBaseRequest<SetChatMenuButton, Boolean> {
    /**
     * Required
     * @param api api
     */
    public SetChatMenuButton(Api api) {
        super(api, "setChatMenuButton");
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
     * @param menu_button A JSON-serialized object for the bot's new menu button. Defaults to {@link MenuButtonType#DEFAULT}
     * @return {@link SetChatMenuButton}
     */
    public SetChatMenuButton menuButton(MenuButton menu_button) {
        return add("menu_button", menu_button);
    }

}
