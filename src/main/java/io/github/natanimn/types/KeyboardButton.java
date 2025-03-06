package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class KeyboardButton implements Serializable {
    private String text;
    private KeyboardButtonRequestUsers request_users;
    private KeyboardButtonRequestChat request_chat;
    private KeyboardButtonPollType request_poll;
    private Boolean request_contact, request_location;
    private WebAppInfo wep_app;


    public KeyboardButton(String text) {
        this.text = text;
    }

    public KeyboardButton requestUser(KeyboardButtonRequestUsers requestUsers) {
        this.request_users = requestUsers;
        return this;
    }

    public KeyboardButton requestChat(KeyboardButtonRequestChat requestChat) {
        this.request_chat = requestChat;
        return this;
    }

    public KeyboardButton requestContact(boolean requestContact) {
        this.request_contact = requestContact;
        return this;
    }

    public KeyboardButton requestLocation(boolean requestLocation) {
        this.request_location = requestLocation;
        return this;
    }

    public KeyboardButton requestPoll(KeyboardButtonPollType requestPoll) {
        this.request_poll = requestPoll;
        return this;
    }

    public KeyboardButton webApp(WebAppInfo webApp) {
        this.wep_app = webApp;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        KeyboardButton that = (KeyboardButton) object;
        return Objects.equals(text, that.text) && Objects.equals(request_users, that.request_users) &&
                Objects.equals(request_chat, that.request_chat) && Objects.equals(request_poll, that.request_poll) &&
                Objects.equals(request_contact, that.request_contact) &&
                Objects.equals(request_location, that.request_location) && Objects.equals(wep_app, that.wep_app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, request_users, request_chat, request_poll, request_contact, request_location, wep_app);
    }
}
