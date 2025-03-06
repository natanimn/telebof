package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Map;

/**
 * Natanim Negash
 *  3 March 2025
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
