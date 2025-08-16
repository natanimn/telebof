package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents a phone contact.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Contact {
    /**
     * Contact's phone number
     */
    public String phone_number;

    /**
     * Contact's first name
     */
    public String first_name;

    /**
     * Optional. Contact's last name
     */
    public String last_name;

    /**
     * Optional. Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>
     */
    public String vcard;

    /**
     * Optional. Contact's user identifier in Telegram.
     */
    public Long user_id;

}
