package io.github.natanimn.telebof.types.inline;

import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputContactMessageContent implements Serializable {
    private String phone_number, first_name, last_name, vcard;

    public InputContactMessageContent(String phone_number, String first_name){
        this.phone_number = phone_number;
        this.first_name = first_name;
    }
    public InputContactMessageContent lastName(String lastName) {
        this.last_name = lastName;
        return this;
    }

    public InputContactMessageContent vcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

}
