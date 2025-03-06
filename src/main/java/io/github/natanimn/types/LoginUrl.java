package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class LoginUrl implements Serializable {
    public String url, forward_text, bot_username;
    public Boolean request_write_access;

    public LoginUrl url(String url){
        this.url = url;
        return this;
    }

    public LoginUrl forwardText(String forwardText){
        this.forward_text = forwardText;
        return this;
    }

    public LoginUrl botUsername(String botUsername){
        this.bot_username = botUsername;
        return this;
    }

    public LoginUrl requestWriteAccess(boolean requestWriteAccess){
        this.request_write_access = requestWriteAccess;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        LoginUrl loginUrl = (LoginUrl) object;
        return Objects.equals(url, loginUrl.url) && Objects.equals(forward_text, loginUrl.forward_text) &&
                Objects.equals(bot_username, loginUrl.bot_username) && Objects.equals(request_write_access, loginUrl.request_write_access);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, forward_text, bot_username, request_write_access);
    }
}
