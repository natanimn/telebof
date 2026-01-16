package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.payments.LabeledPrice;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Represents the content of an invoice message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputInvoiceMessageContent implements InputMessageContent {
    private final String title;
    private final String description;
    private final String payload;
    private final String currency;
    private final List<LabeledPrice> prices;

    @SerializedName("provider_token")
    private String providerToken;

    @SerializedName("provider_data")
    private String providerData;

    @SerializedName("photo_url")
    private String photoUrl;

    @SerializedName("photo_size")
    private Integer photoSize;

    @SerializedName("photo_width")
    private Integer photoWidth;

    @SerializedName("photo_height")
    private Integer photoHeight;

    @SerializedName("max_tip_amount")
    private Integer maxTipAmount;

    @SerializedName("suggested_tip_amounts")
    private List<Integer> suggestedTipAmounts;

    @SerializedName("need_name")
    private Boolean needName;

    @SerializedName("need_phone_number")
    private Boolean needPhoneNumber;

    @SerializedName("need_email")
    private Boolean needEmail;

    @SerializedName("need_shipping_address")
    private Boolean needShippingAddress;

    @SerializedName("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider;

    @SerializedName("send_email_to_provider")
    private Boolean sendEmailToProvider;

    @SerializedName("is_flexible")
    private Boolean isFlexible;

    public InputInvoiceMessageContent(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.currency = currency;
        this.prices = List.of(prices);
    }

    /**
     * @param providerToken Payment provider token
     * @return this
     */
    public InputInvoiceMessageContent setProviderToken(String providerToken) {
        this.providerToken = providerToken;
        return this;
    }

    /**
     * @param providerData Data about the invoice, which will be shared with the payment provider.
     * @return this
     */
    public InputInvoiceMessageContent setProviderData(String providerData) {
        this.providerData = providerData;
        return this;
    }

    /**
     * @param photoUrl URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     * @return this
     */
    public InputInvoiceMessageContent setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    /**
     * @param photoSize Photo size in bytes
     * @return this
     */
    public InputInvoiceMessageContent setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
        return this;
    }

    /**
     * @param photoWidth Photo width
     * @return this
     */
    public InputInvoiceMessageContent setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    /**
     * @param photoHeight Photo height
     * @return this
     */
    public InputInvoiceMessageContent setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    /**
     * @param maxTipAmount The maximum accepted amount for tips in the smallest units of the currency. Defaults to 0. Not supported for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setMaxTipAmount(Integer maxTipAmount) {
        this.maxTipAmount = maxTipAmount;
        return this;
    }

    /**
     * @param suggestedTipAmounts Array of suggested amounts of tip in the smallest units of the currency. At most 4 suggested tip amounts can be specified.
     * @return this
     */
    public InputInvoiceMessageContent setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
        this.suggestedTipAmounts = suggestedTipAmounts;
        return this;
    }

    /**
     * @param needName Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setNeedName(Boolean needName) {
        this.needName = needName;
        return this;
    }

    /**
     * @param needPhoneNumber Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setNeedPhoneNumber(Boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
        return this;
    }

    /**
     * @param needEmail Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
        return this;
    }

    /**
     * @param needShippingAddress Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
        return this;
    }

    /**
     * @param sendPhoneNumberToProvider Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
        return this;
    }

    /**
     * @param sendEmailToProvider Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setSendEmailToProvider(Boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
        return this;
    }

    /**
     * @param flexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return this
     */
    public InputInvoiceMessageContent setFlexible(Boolean flexible) {
        this.isFlexible = flexible;
        return this;
    }
}