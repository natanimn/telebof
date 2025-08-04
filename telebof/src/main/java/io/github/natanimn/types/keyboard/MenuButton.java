package io.github.natanimn.types.keyboard;

import io.github.natanimn.enums.MenuButtonType;
import io.github.natanimn.types.web.WebAppInfo;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class MenuButton implements Serializable {
    public String type, text;
    public WebAppInfo web_app;

    public MenuButton(@NotNull MenuButtonType type) {
        this.type = type.name().toLowerCase();
    }

    public MenuButton text(String text){
        this.text = text;
        return this;
    }

    public MenuButton webApp(WebAppInfo web_app) {
        this.web_app = web_app;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MenuButton that = (MenuButton) object;
        return Objects.equals(type, that.type) && Objects.equals(web_app, that.web_app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, web_app);
    }
}
