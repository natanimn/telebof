package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a phone contact.
 * @param phoneNumber Contact's phone number
 * @param firstName Contact's first name
 * @param lastName Optional. Contact's last name
 * @param vcard Optional. Additional data about the contact in the form of a vCard
 * @param userId Optional. Contact's user identifier in Telegram.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Contact(
        @SerializedName("phone_number") String phoneNumber,
        @SerializedName("first_name") String firstName,
        @SerializedName("last_name") String lastName,
        String vcard,
        @SerializedName("user_id") Long userId
) {}