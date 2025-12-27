package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotLog;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendContact class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendContact extends SendBuilder<SendContact, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param phoneNumber phone number
     * @param firstName first name
     * @param api api
     */
    public SendContact(Object chatId, String phoneNumber, String firstName, Api api) {
        super(chatId, api, "sendContact", Message.class);
        add("phone_number", phoneNumber);
        add("first_name", firstName);
    }

    /**
     * Optional
     * @param lastName Contact's last name
     * @return {@link SendContact}
     */
    public SendContact lastName(String lastName) {
        return add("last_name", lastName);
    }

    /**
     * Optional
     * @param vcard Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes
     * @return {@link SendContact}
     */
    public SendContact vcard(String vcard) {
        return add("vcard", vcard);
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendContact parseMode(ParseMode parseMode) {
        BotLog.warn("`sendContact` method doesn't support parse_mode");
        return this;
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendContact disableWebPagePreview(boolean disableWebPagePreview) {
        BotLog.warn("`sendContact` method doesn't support disable_web_page_preview");
        return this;
    }
}
