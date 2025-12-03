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
    /**
     * Product name, 1-32 characters
     */
    private final String title;

    /**
     * Product description, 1-255 characters
     */
    private final String description;

    /**
     * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
     */
    private final String payload;

    /**
     * Three-letter ISO 4217 currency code, see more on currencies. Pass "XTR" for payments in Telegram Stars.
     */
    private final String currency;

    /**
     * Price breakdown. Must contain exactly one item for payments in Telegram Stars.
     */
    private final LabeledPrice[] prices;

    /**
     * Optional. Payment provider token
     */
    @SerializedName("provider_token")
    private String providerToken;

    /**
     * Optional. Data about the invoice, which will be shared with the payment provider.
     */
    @SerializedName("provider_data")
    private String providerData;

    /**
     * Optional. URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     */
    @SerializedName("photo_url")
    private String photoUrl;

    /**
     * Optional. Photo size in bytes
     */
    @SerializedName("photo_size")
    private Integer photoSize;

    /**
     * Optional. Photo width
     */
    @SerializedName("photo_width")
    private Integer photoWidth;

    /**
     * Optional. Photo height
     */
    @SerializedName("photo_height")
    private Integer photoHeight;

    /**
     * Optional. The maximum accepted amount for tips in the smallest units of the currency. Defaults to 0. Not supported for payments in Telegram Stars.
     */
    @SerializedName("max_tip_amount")
    private Integer maxTipAmount;

    /**
     * Optional. Array of suggested amounts of tip in the smallest units of the currency. At most 4 suggested tip amounts can be specified.
     */
    @SerializedName("suggested_tip_amounts")
    private List<Integer> suggestedTipAmounts;

    /**
     * Optional. Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     */
    @SerializedName("need_name")
    private Boolean needName;

    /**
     * Optional. Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     */
    @SerializedName("need_phone_number")
    private Boolean needPhoneNumber;

    /**
     * Optional. Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     */
    @SerializedName("need_email")
    private Boolean needEmail;

    /**
     * Optional. Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
     */
    @SerializedName("need_shipping_address")
    private Boolean needShippingAddress;

    /**
     * Optional. Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
     */
    @SerializedName("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider;

    /**
     * Optional. Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
     */
    @SerializedName("send_email_to_provider")
    private Boolean sendEmailToProvider;

    /**
     * Optional. Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     */
    @SerializedName("is_flexible")
    private Boolean isFlexible;

    public InputInvoiceMessageContent(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.currency = currency;
        this.prices = prices;
    }

    public void setProviderToken(String providerToken) {
        this.providerToken = providerToken;
    }

    public void setProviderData(String providerData) {
        this.providerData = providerData;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
    }

    public void setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
    }

    public void setMaxTipAmount(Integer maxTipAmount) {
        this.maxTipAmount = maxTipAmount;
    }

    public void setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
        this.suggestedTipAmounts = suggestedTipAmounts;
    }

    public void setNeedName(Boolean needName) {
        this.needName = needName;
    }

    public void setNeedPhoneNumber(Boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
    }

    public void setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
    }

    public void setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
    }

    public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
    }

    public void setSendEmailToProvider(Boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
    }

    public void setFlexible(Boolean flexible) {
        isFlexible = flexible;
    }
}