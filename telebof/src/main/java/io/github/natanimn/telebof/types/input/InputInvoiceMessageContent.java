package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.payments.LabeledPrice;
import java.util.List;


/**
 * Represents the content of an invoice message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputInvoiceMessageContent implements InputMessageContent {
    private String title;
    private String description;
    private String payload;
    private String provider_token;
    private String currency;
    private String provider_data;
    private String photo_url;
    private LabeledPrice[] prices;
    private Integer[] suggested_tip_amount;
    private Integer max_tip_amount;
    private Integer photo_width;
    private Integer photo_height;
    private Integer photo_size;
    private Boolean need_name;
    private Boolean need_phone_number;
    private Boolean need_email;
    private Boolean is_flexible;
    private Boolean send_phone_number_to_provider;
    private Boolean need_shipping_address;
    private Boolean send_email_to_provider;

    /**
     * Required
     * @param title Product name, 1-32 characters
     * @param description Product description, 1-255 characters
     * @param payload Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @param currency Three-letter ISO 4217 currency code, see <a href="https://core.telegram.org/bots/payments#supported-currencies">more on currencies.</a>
     *                 Pass “XTR” for payments in Telegram Stars.
     * @param prices Price breakdown. Must contain exactly one item for payments in <a href="https://t.me/BotNews/90">Telegram Stars.</a>
     */
    public InputInvoiceMessageContent(String title, String description, String payload,
                                      String currency, LabeledPrice[] prices){
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.currency = currency;
        this.prices = prices;
    }

    /**
     * Optional
     * @param providerToken
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent providerToken(String providerToken){
        this.provider_token = providerToken;
        return this;
    }

    /**
     *
     * @param maxTipAmount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>,
     *                       it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent maxTipAmount(int maxTipAmount) {
        this.max_tip_amount = maxTipAmount;
        return this;
    }

    /**
     * Optional
     * @param suggestedTipAmounts array of suggested amounts of tip in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified.
     *                              The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed {@link #maxTipAmount}.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent suggestedTipAmounts(Integer[] suggestedTipAmounts) {
        this.suggested_tip_amount = suggestedTipAmounts;
        return this;
    }

    /**
     * Optional
     * @param providerData data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of the required fields should be provided by the payment provider.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent providerData(String providerData) {
        this.provider_data = providerData;
        return this;
    }

    /**
     * Optional
     * @param photoUrl URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoUrl(String photoUrl) {
        this.photo_url = photoUrl;
        return this;
    }

    /**
     * Optional
     * @param photoSize Photo size in bytes
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoSize(int photoSize) {
        this.photo_size = photoSize;
        return this;
    }

    /**
     * Optional
     * @param photoWidth Photo width
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoWidth(int photoWidth) {
        this.photo_width = photoWidth;
        return this;
    }

    /**
     * Optional
     * @param photoHeight Photo height
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoHeight(int photoHeight) {
        this.photo_height = photoHeight;
        return this;
    }

    /**
     * Optional
     * @param needName Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needName(Boolean needName) {
        this.need_name = needName;
        return this;
    }

    /**
     * Optional
     * @param needPhoneNumber Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needPhoneNumber(Boolean needPhoneNumber) {
        this.need_phone_number = needPhoneNumber;
        return this;
    }

    /**
     * Optional
     * @param needEmail Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needEmail(Boolean needEmail) {
        this.need_email = needEmail;
        return this;
    }

    /**
     * Optional
     * @param needShippingAddress Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needShippingAddress(Boolean needShippingAddress) {
        this.need_shipping_address = needShippingAddress;
        return this;
    }

    /**
     * Optional
     * @param sendPhoneNumberToProvider Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.send_phone_number_to_provider = sendPhoneNumberToProvider;
        return this;
    }

    /**
     * Optional
     * @param sendEmailToProvider Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent sendEmailToProvider(Boolean sendEmailToProvider) {
        this.send_email_to_provider = sendEmailToProvider;
        return this;
    }

    /**
     * Optional
     * @param isFlexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent isFlexible(Boolean isFlexible) {
        this.is_flexible = isFlexible;
        return this;
    }
}
