package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A text with a bank card number.
 * @author Natanim
 * @since 2.1
 */
public class RichTextBankCardNumber implements RichText {
    /**
     * Type of the rich text, always “bank_card_number”
     */
    private final String type = "bank_card_number";

    private final RichText text;

    @SerializedName("bank_card_number")
    private final String bankCardNumber;

    /**
     * Required
     * @param text The text
     * @param bankCardNumber The bank card number
     */
    public RichTextBankCardNumber(String text, String bankCardNumber){
        this.text = new RichTextImpl(text, type);
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * Required
     * @param text The text
     * @param bankCardNumber The bank card number
     */
    public RichTextBankCardNumber(RichText text, String bankCardNumber){
        this.text = text;
        this.bankCardNumber = bankCardNumber;
    }
}
