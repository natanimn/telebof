package io.github.natanimn.types;

import io.github.natanimn.enums.MenuButtonType;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
