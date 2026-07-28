package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a phone contact.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}