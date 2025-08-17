package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import java.util.List;

/**
 * CreateInvoiceLink class. Returns the created invoice link as String on success.
 * @author Natanim
 * @since March 3, 2025
 * @version 0.9
 * @see BotContext#createInvoiceLink
 */
public class CreateInvoiceLink extends AbstractBaseRequest<CreateInvoiceLink, String> {
    /**
     * Required
     * @param title title
     * @param description description
     * @param payload payload
     * @param currency currency
     * @param prices prices
     * @param api api
     */
    public CreateInvoiceLink(String title, String description, String payload,
                             String currency, LabeledPrice[] prices, Api api) {
        super(api, "createInvoiceLink", Object.class);
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("currency", currency);
        add("prices", List.of(prices));
    }

    /**
     * Optional
     * @param provider_token Payment provider token, obtained via @BotFather. Pass an empty string for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink providerToken(String provider_token){
        return add("provider_token", provider_token);
    }

    /**
     * Optional
     * @param max_tip_amount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145.
     *                       See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>,
     *                       it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink maxTipAmount(int max_tip_amount) {
        return add("max_tip_amount", max_tip_amount);
    }

    /**
     * Optional
     * @param suggested_tip_amounts A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified.
     *                              The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink suggestedTipAmounts(int[] suggested_tip_amounts) {
        return add("suggested_tip_amounts", List.of(suggested_tip_amounts));
    }

    /**
     * Optional
     * @param provider_data JSON-serialized data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of required fields should be provided by the payment provider.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink providerData(String provider_data) {
        return add("provider_data", provider_data);
    }

    /**
     * Optional
     * @param photo_url URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoUrl(String photo_url) {
        return add("photo_url", photo_url);
    }

    /**
     * Optional
     * @param photo_size Photo size in bytes
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoSize(int photo_size) {
        return add("photo_size", photo_size);
    }

    /**
     * Optional
     * @param photo_width Photo width
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoWidth(int photo_width) {
        return add("photo_width", photo_width);
    }

    /**
     * Optional
     * @param photo_height Photo height
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoHeight(int photo_height) {
        return add("photo_height", photo_height);
    }

    /**
     * Optional
     * @param need_name Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needName(boolean need_name) {
        return add("need_name", need_name);
    }

    /**
     * Optional
     * @param need_phone_number Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needPhoneNumber(boolean need_phone_number) {
        return add("need_phone_number", need_phone_number);
    }

    /**
     * Optional
     * @param need_email Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needEmail(boolean need_email) {
        return add("need_email", need_email);
    }

    /**
     * Optional
     * @param need_shipping_address Pass True if you require the user's shipping address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needShippingAddress(boolean need_shipping_address) {
        return add("need_shipping_address", need_shipping_address);
    }

    /**
     * Optional
     * @param send_phone_number_to_provider Pass True if the user's phone number should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink sendPhoneNumberToProvider(boolean send_phone_number_to_provider) {
        return add("send_phone_number_to_provider", send_phone_number_to_provider);
    }

    /**
     * Optional
     * @param send_email_to_provider Pass True if the user's email address should be sent to the provider. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink sendEmailToProvider(boolean send_email_to_provider) {
        return add("send_email_to_provider", send_email_to_provider);
    }

    /**
     * Optional
     * @param is_flexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink isFlexible(boolean is_flexible) {
        return add("is_flexible", is_flexible);
    }

    /**
     * @param subscription_period The number of seconds the subscription will be active for before the next payment.
     *                            The currency must be set to “XTR” (Telegram Stars) if the parameter is used.
     *                            Currently, it must always be 2592000 (30 days) if specified.
     *                            Any number of subscriptions can be active for a given bot at the same time, including multiple concurrent
     *                            subscriptions from the same user. Subscription price must not exceed 10000 Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink subscriptionPeriod(Integer subscription_period){
        return add("subscription_period", subscription_period);
    }

    /**
     * @param business_connection_id Unique identifier of the business connection on behalf of which the link will be created.
     * For payments in Telegram Stars only.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
