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
 * @version 1.3.0
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
     * @param chatId Unique identifier for the target private chat. If not specified, default bot's menu button will be changed
     * @return {@link SetChatMenuButton}
     */
    public SetChatMenuButton chatId(long chatId) {
        return add("chat_id", chatId);
    }

    /**
     * Optional
     * @param menuButton A JSON-serialized object for the bot's new menu button. Defaults to {@link MenuButtonType#DEFAULT}
     * @return {@link SetChatMenuButton}
     */
    public SetChatMenuButton menuButton(MenuButton menuButton) {
        return add("menu_button", menuButton);
    }

}
