package io.github.natanimn.requests.send;

import io.github.natanimn.BotLog;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;

/**
 * SendContact class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendContact extends SendBuilder<SendContact, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param phone_number phone number
     * @param first_name first name
     * @param requestSender request sender
     */
    public SendContact(Object chat_id, String phone_number, String first_name, RequestSender requestSender) {
        super(chat_id, requestSender, "sendContact", Message.class);
        add("phone_number", phone_number);
        add("first_name", first_name);
    }

    /**
     * Optional
     * @param last_name Contact's last name
     * @return {@link SendContact}
     */
    public SendContact lastName(String last_name) {
        return add("last_name", last_name);
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
    public SendContact parseMode(ParseMode parse_mode) {
        BotLog.warn("`sendContact` method doesn't support parse_mode");
        return this;
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendContact disableWebPagePreview(boolean disable_web_page_preview) {
        BotLog.warn("`sendContact` method doesn't support disable_web_page_preview");
        return this;
    }
}
