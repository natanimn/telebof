package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.types.payments.LabeledPrice;
import java.util.List;


/**
 * Represents the content of an invoice message to be sent as the result of an inline query.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputInvoiceMessageContent implements InputMessageContent {
    private String title;
    private String description;
    private String payload;
    private String provider_token;
    private String currency;
    private String provider_data;
    private String photo_url;
    private List<LabeledPrice> prices;
    private List<Integer> suggested_tip_amount;
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
        this.prices = List.of(prices);
    }

    /**
     * Optional
     * @param provider_token
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent providerToken(String provider_token){
        this.provider_token = provider_token;
        return this;
    }

    /**
     *
     * @param max_tip_amount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>,
     *                       it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent maxTipAmount(int max_tip_amount) {
        this.max_tip_amount = max_tip_amount;
        return this;
    }

    /**
     * Optional
     * @param suggested_tip_amounts array of suggested amounts of tip in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified.
     *                              The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed {@link #maxTipAmount}.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent suggestedTipAmounts(Integer[] suggested_tip_amounts) {
        this.suggested_tip_amount = List.of(suggested_tip_amounts);
        return this;
    }

    /**
     * Optional
     * @param provider_data data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of the required fields should be provided by the payment provider.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent providerData(String provider_data) {
        this.provider_data = provider_data;
        return this;
    }

    /**
     * Optional
     * @param photo_url URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoUrl(String photo_url) {
        this.photo_url = photo_url;
        return this;
    }

    /**
     * Optional
     * @param photo_size Photo size in bytes
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoSize(int photo_size) {
        this.photo_size = photo_size;
        return this;
    }

    /**
     * Optional
     * @param photo_width Photo width
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoWidth(int photo_width) {
        this.photo_width = photo_width;
        return this;
    }

    /**
     * Optional
     * @param photo_height Photo height
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent photoHeight(int photo_height) {
        this.photo_height = photo_height;
        return this;
    }

    /**
     * Optional
     * @param need_name Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needName(Boolean need_name) {
        this.need_name = need_name;
        return this;
    }

    /**
     * Optional
     * @param need_phone_number Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needPhoneNumber(Boolean need_phone_number) {
        this.need_phone_number = need_phone_number;
        return this;
    }

    /**
     * Optional
     * @param need_email Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needEmail(Boolean need_email) {
        this.need_email = need_email;
        return this;
    }

    /**
     * Optional
     * @param need_shipping_address Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent needShippingAddress(Boolean need_shipping_address) {
        this.need_shipping_address = need_shipping_address;
        return this;
    }

    /**
     * Optional
     * @param send_phone_number_to_provider Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent sendPhoneNumberToProvider(Boolean send_phone_number_to_provider) {
        this.send_phone_number_to_provider = send_phone_number_to_provider;
        return this;
    }

    /**
     * Optional
     * @param send_email_to_provider Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent sendEmailToProvider(Boolean send_email_to_provider) {
        this.send_email_to_provider = send_email_to_provider;
        return this;
    }

    /**
     * Optional
     * @param is_flexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return {@link InputInvoiceMessageContent}
     */
    public InputInvoiceMessageContent isFlexible(Boolean is_flexible) {
        this.is_flexible = is_flexible;
        return this;
    }
}
