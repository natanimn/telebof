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
 * @version 1.3.0
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
     * @param providerToken Payment provider token, obtained via @BotFather. Pass an empty string for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink providerToken(String providerToken){
        return add("provider_token", providerToken);
    }

    /**
     * Optional
     * @param maxTipAmount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145.
     *                       See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>,
     *                       it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink maxTipAmount(int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    /**
     * Optional
     * @param suggestedTipAmounts A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified.
     *                              The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink suggestedTipAmounts(Integer[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", suggestedTipAmounts);
    }

    /**
     * Optional
     * @param providerData JSON-serialized data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of required fields should be provided by the payment provider.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink providerData(String providerData) {
        return add("provider_data", providerData);
    }

    /**
     * Optional
     * @param photoUrl URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoUrl(String photoUrl) {
        return add("photo_url", photoUrl);
    }

    /**
     * Optional
     * @param photoSize Photo size in bytes
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoSize(int photoSize) {
        return add("photo_size", photoSize);
    }

    /**
     * Optional
     * @param photoWidth Photo width
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoWidth(int photoWidth) {
        return add("photo_width", photoWidth);
    }

    /**
     * Optional
     * @param photoHeight Photo height
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink photoHeight(int photoHeight) {
        return add("photo_height", photoHeight);
    }

    /**
     * Optional
     * @param needName Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needName(boolean needName) {
        return add("need_name", needName);
    }

    /**
     * Optional
     * @param needPhoneNumber Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link CreateInvoiceLink}
     */
    public CreateInvoiceLink needPhoneNumber(boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
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
