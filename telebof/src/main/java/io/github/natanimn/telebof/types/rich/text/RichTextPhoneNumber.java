package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A text with a phone number.
 * @author Natanim
 * @since 2.1
 */
public class RichTextPhoneNumber implements RichText {
    /**
     * Type of the rich text, always “phone_number”
     */
    private final String type = "phone_number";

    private final RichText text;

    @SerializedName("phone_number")
    private final String phoneNumber;

    /**
     * Required
     * @param text The text
     * @param phoneNumber The phone number
     */
    public RichTextPhoneNumber(String text, String phoneNumber){
        this.text = new RichTextImpl(text, type);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Required
     * @param text The text
     * @param phoneNumber The phone number
     */
    public RichTextPhoneNumber(RichText text, String phoneNumber){
        this.text = text;
        this.phoneNumber = phoneNumber;
    }
}
