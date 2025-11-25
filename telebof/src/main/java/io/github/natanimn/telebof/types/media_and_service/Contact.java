package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a phone contact.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Contact {
    /**
     * Contact's phone number
     */
    @SerializedName("phone_number")
    private String phoneNumber;

    /**
     * Contact's first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Optional. Contact's last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Optional. Additional data about the contact in the form of a vCard
     */
    private String vcard;

    /**
     * Optional. Contact's user identifier in Telegram.
     */
    @SerializedName("user_id")
    private Long userId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getVcard() {
        return vcard;
    }

    public Long getUserId() {
        return userId;
    }
}