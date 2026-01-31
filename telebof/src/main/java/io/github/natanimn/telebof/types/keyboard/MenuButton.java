package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.MenuButtonType;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.web.WebAppInfo;

import java.io.Serializable;

/**
 * This object describes the bot's menu button in a private chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class MenuButton implements Serializable {
    private MenuButtonType type;
    private String text;

    @SerializedName("web_app")
    private WebAppInfo webApp;

    public MenuButton(){}

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
    public MenuButton setText(String text){
        this.text = text;
        return this;
    }

    /**
     * Optional
     * @param webApp Description of the Web App that will be launched when the user presses the button.
     *                The Web App will be able to send an arbitrary message on behalf of the user using the method {@link BotContext#answerWebAppQuery(String, InlineQueryResult)}.
     *                Alternatively, a t.me link to a Web App of the bot can be specified in the object instead of the Web App's URL,
     *                in which case the Web App will be opened as if the user pressed the link.
     * @return {@link MenuButton}
     */
    public MenuButton setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
        return this;
    }

    public MenuButtonType getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }
}
