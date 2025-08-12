package io.github.natanimn.types.keyboard;

import io.github.natanimn.enums.MenuButtonType;
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object describes the bot's menu button in a private chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class MenuButton implements Serializable {
    public MenuButtonType type;
    public String text;
    public WebAppInfo web_app;

    /**
     * Required
     * @param type Type of the button.
     */
    public MenuButton(MenuButtonType type) {
        this.type = type;
    }

    /**
     * Optional
     * @param text Web app text on the button
     * @return {@link MenuButton}
     */
    public MenuButton text(String text){
        this.text = text;
        return this;
    }

    /**
     * Optional
     * @param web_app Description of the Web App that will be launched when the user presses the button.
     *                The Web App will be able to send an arbitrary message on behalf of the user using the method {@link io.github.natanimn.BotContext#answerWebAppQuery(String, InlineQueryResult)}.
     *                Alternatively, a t.me link to a Web App of the bot can be specified in the object instead of the Web App's URL,
     *                in which case the Web App will be opened as if the user pressed the link.
     * @return {@link MenuButton}
     */
    public MenuButton webApp(WebAppInfo web_app) {
        this.web_app = web_app;
        return this;
    }

}
