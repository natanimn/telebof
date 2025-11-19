package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.payments.LabeledPrice;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Represents the content of an invoice message to be sent as the result of an inline query.
 * @param title Product name, 1-32 characters
 * @param description Product description, 1-255 characters
 * @param payload Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
 * @param currency Three-letter ISO 4217 currency code, see more on currencies. Pass "XTR" for payments in Telegram Stars.
 * @param prices Price breakdown. Must contain exactly one item for payments in Telegram Stars.
 * @param providerToken Optional. Payment provider token
 * @param providerData Optional. Data about the invoice, which will be shared with the payment provider.
 * @param photoUrl Optional. URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
 * @param photoSize Optional. Photo size in bytes
 * @param photoWidth Optional. Photo width
 * @param photoHeight Optional. Photo height
 * @param maxTipAmount Optional. The maximum accepted amount for tips in the smallest units of the currency. Defaults to 0. Not supported for payments in Telegram Stars.
 * @param suggestedTipAmounts Optional. Array of suggested amounts of tip in the smallest units of the currency. At most 4 suggested tip amounts can be specified.
 * @param needName Optional. Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
 * @param needPhoneNumber Optional. Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
 * @param needEmail Optional. Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
 * @param needShippingAddress Optional. Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
 * @param sendPhoneNumberToProvider Optional. Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
 * @param sendEmailToProvider Optional. Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
 * @param isFlexible Optional. Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputInvoiceMessageContent(
        String title,
        String description,
        String payload,
        String currency,
        LabeledPrice[] prices,
        @SerializedName("provider_token") String providerToken,
        @SerializedName("provider_data") String providerData,
        @SerializedName("photo_url") String photoUrl,
        @SerializedName("photo_size") Integer photoSize,
        @SerializedName("photo_width") Integer photoWidth,
        @SerializedName("photo_height") Integer photoHeight,
        @SerializedName("max_tip_amount") Integer maxTipAmount,
        @SerializedName("suggested_tip_amounts") List<Integer> suggestedTipAmounts,
        @SerializedName("need_name") Boolean needName,
        @SerializedName("need_phone_number") Boolean needPhoneNumber,
        @SerializedName("need_email") Boolean needEmail,
        @SerializedName("need_shipping_address") Boolean needShippingAddress,
        @SerializedName("send_phone_number_to_provider") Boolean sendPhoneNumberToProvider,
        @SerializedName("send_email_to_provider") Boolean sendEmailToProvider,
        @SerializedName("is_flexible") Boolean isFlexible
) implements InputMessageContent {

    /**
     * Creates a new InputInvoiceMessageContent builder
     * @param title Product name, 1-32 characters
     * @param description Product description, 1-255 characters
     * @param payload Bot-defined invoice payload, 1-128 bytes
     * @param currency Three-letter ISO 4217 currency code
     * @param prices Price breakdown
     */
    public static InputInvoiceMessageContentBuilder builder(String title, String description, String payload,
                                                            String currency, LabeledPrice[] prices) {
        return new InputInvoiceMessageContentBuilder(title, description, payload, currency, prices);
    }

    /**
     * Builder class for InputInvoiceMessageContent
     */
    public static class InputInvoiceMessageContentBuilder {
        private final String title;
        private final String description;
        private final String payload;
        private final String currency;
        private final LabeledPrice[] prices;
        private String providerToken;
        private String providerData;
        private String photoUrl;
        private Integer photoSize;
        private Integer photoWidth;
        private Integer photoHeight;
        private Integer maxTipAmount;
        private List<Integer> suggestedTipAmounts;
        private Boolean needName;
        private Boolean needPhoneNumber;
        private Boolean needEmail;
        private Boolean needShippingAddress;
        private Boolean sendPhoneNumberToProvider;
        private Boolean sendEmailToProvider;
        private Boolean isFlexible;

        public InputInvoiceMessageContentBuilder(String title, String description, String payload,
                                                 String currency, LabeledPrice[] prices) {
            this.title = title;
            this.description = description;
            this.payload = payload;
            this.currency = currency;
            this.prices = prices;
        }

        public InputInvoiceMessageContentBuilder providerToken(String providerToken) {
            this.providerToken = providerToken;
            return this;
        }

        public InputInvoiceMessageContentBuilder providerData(String providerData) {
            this.providerData = providerData;
            return this;
        }

        public InputInvoiceMessageContentBuilder photoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

        public InputInvoiceMessageContentBuilder photoSize(Integer photoSize) {
            this.photoSize = photoSize;
            return this;
        }

        public InputInvoiceMessageContentBuilder photoWidth(Integer photoWidth) {
            this.photoWidth = photoWidth;
            return this;
        }

        public InputInvoiceMessageContentBuilder photoHeight(Integer photoHeight) {
            this.photoHeight = photoHeight;
            return this;
        }

        public InputInvoiceMessageContentBuilder maxTipAmount(Integer maxTipAmount) {
            this.maxTipAmount = maxTipAmount;
            return this;
        }

        public InputInvoiceMessageContentBuilder suggestedTipAmounts(List<Integer> suggestedTipAmounts) {
            this.suggestedTipAmounts = suggestedTipAmounts;
            return this;
        }

        public InputInvoiceMessageContentBuilder needName(Boolean needName) {
            this.needName = needName;
            return this;
        }

        public InputInvoiceMessageContentBuilder needPhoneNumber(Boolean needPhoneNumber) {
            this.needPhoneNumber = needPhoneNumber;
            return this;
        }

        public InputInvoiceMessageContentBuilder needEmail(Boolean needEmail) {
            this.needEmail = needEmail;
            return this;
        }

        public InputInvoiceMessageContentBuilder needShippingAddress(Boolean needShippingAddress) {
            this.needShippingAddress = needShippingAddress;
            return this;
        }

        public InputInvoiceMessageContentBuilder sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
            this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
            return this;
        }

        public InputInvoiceMessageContentBuilder sendEmailToProvider(Boolean sendEmailToProvider) {
            this.sendEmailToProvider = sendEmailToProvider;
            return this;
        }

        public InputInvoiceMessageContentBuilder isFlexible(Boolean isFlexible) {
            this.isFlexible = isFlexible;
            return this;
        }

        public InputInvoiceMessageContent build() {
            return new InputInvoiceMessageContent(
                    title, description, payload, currency, prices,
                    providerToken, providerData, photoUrl, photoSize, photoWidth, photoHeight,
                    maxTipAmount, suggestedTipAmounts, needName, needPhoneNumber, needEmail,
                    needShippingAddress, sendPhoneNumberToProvider, sendEmailToProvider, isFlexible
            );
        }
    }
}