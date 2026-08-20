package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
@Setter
@Accessors(chain = true)
@RequiredArgsConstructor
public class InputContactMessageContent implements Serializable {

    /**
     * Contact's phone number
     */
    @SerializedName("phone_number")
    private final String phoneNumber;

    /**
     * Contact's first name
     */
    @SerializedName("first_name")
    private final String firstName;

    /**
     * Optional. Contact's last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    private final String vcard;

}
