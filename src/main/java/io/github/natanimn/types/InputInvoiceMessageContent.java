package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class InputInvoiceMessageContent implements Serializable {
    private String title, description, payload, provider_token, currency, provider_data, photo_url;
    private List<LabeledPrice> prices;
    private List<Integer> suggested_tip_amount;
    private Integer max_tip_amount, photo_width, photo_height, photo_size;
    private Boolean need_name, need_phone_number, need_email, is_flexible, send_phone_number_to_provider,
            need_shipping_address, send_email_to_provider;

    public InputInvoiceMessageContent(String title, String description, String payload,
                                      String currency, LabeledPrice[] prices){
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.currency = currency;
        this.prices = List.of(prices);
    }

    public InputInvoiceMessageContent providerToken(String providerToken){
        this.provider_token = providerToken;
        return this;
    }
    public InputInvoiceMessageContent maxTipAmount(int maxTipAmount) {
        this.max_tip_amount = maxTipAmount;
        return this;
    }

    public InputInvoiceMessageContent suggestedTipAmounts(Integer[] suggestedTipAmounts) {
        this.suggested_tip_amount = List.of(suggestedTipAmounts);
        return this;
    }

    public InputInvoiceMessageContent providerData(String providerData) {
        this.provider_data = providerData;
        return this;
    }

    public InputInvoiceMessageContent photoUrl(String photoUrl) {
        this.photo_url = photoUrl;
        return this;
    }

    public InputInvoiceMessageContent photoSize(int photoSize) {
        this.photo_size = photoSize;
        return this;
    }

    public InputInvoiceMessageContent photoWidth(int photoWidth) {
        this.photo_width = photoWidth;
        return this;
    }

    public InputInvoiceMessageContent photoHeight(int photoHeight) {
        this.photo_height = photoHeight;
        return this;
    }

    public InputInvoiceMessageContent needName(Boolean needName) {
        this.need_name = needName;
        return this;
    }

    public InputInvoiceMessageContent needPhoneNumber(Boolean needPhoneNumber) {
        this.need_phone_number = needPhoneNumber;
        return this;
    }

    public InputInvoiceMessageContent needEmail(Boolean needEmail) {
        this.need_email = needEmail;
        return this;
    }

    public InputInvoiceMessageContent needShippingAddress(Boolean needShippingAddress) {
        this.need_shipping_address = needShippingAddress;
        return this;
    }

    public InputInvoiceMessageContent sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.send_phone_number_to_provider = sendPhoneNumberToProvider;
        return this;
    }

    public InputInvoiceMessageContent sendEmailToProvider(Boolean sendEmailToProvider) {
        this.send_email_to_provider = sendEmailToProvider;
        return this;
    }

    public InputInvoiceMessageContent isFlexible(Boolean isFlexible) {
        this.is_flexible = isFlexible;
        return this;
    }

}
