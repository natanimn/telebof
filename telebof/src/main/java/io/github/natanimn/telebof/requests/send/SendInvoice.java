package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.log.BotLog;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendInvoice class. Returns the sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendInvoice
 */
public class SendInvoice extends SendBuilder<SendInvoice, Message> {
    /**
     * Required
     * @param chatId chat id
     * @param title title
     * @param description description
     * @param payload payload
     * @param currency currency
     * @param prices prices
     * @param api api
     */
    public SendInvoice(Object chatId, String title, String description, String payload,
                       String currency, LabeledPrice[] prices, Api api) {
        super(chatId, api, "sendInvoice");
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("currency", currency);
        add("prices", prices);
    }

    /**
     * Optional
     * @param providerToken Payment provider token, obtained via @BotFather. Pass an empty string for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice providerToken(String providerToken){
        return add("provider_token", providerToken);
    }

    /**
     * Optional
     * @param maxTipAmount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145.
     *                       See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice maxTipAmount(int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    /**
     * Optional
     * @param suggestedTipAmounts A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified. The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
     * @return {@link SendInvoice}
     */
    public SendInvoice suggestedTipAmounts(Integer[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", suggestedTipAmounts);
    }

    /**
     * Optional
     * @param startParameter Unique deep-linking parameter.
     *                        If left empty, forwarded copies of the sent message will have a Pay button, allowing multiple users to pay directly from the forwarded message, using the same invoice.
     *                        If non-empty, forwarded copies of the sent message will have a URL button with a deep link to the bot (instead of a Pay button), with the value used as the start parameter
     * @return {@link SendInvoice}
     */
    public SendInvoice startParameter(String startParameter) {
        return add("start_parameter", startParameter);
    }

    /**
     * Optional
     * @param providerData JSON-serialized data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of required fields should be provided by the payment provider.
     * @return {@link SendInvoice}
     */
    public SendInvoice providerData(String providerData) {
        return add("provider_data", providerData);
    }

    /**
     * Optional
     * @param photoUrl URL of the product photo for the invoice.
     *                  Can be a photo of the goods or a marketing image for a service.
     *                  People like it better when they see what they are paying for.
     * @return {@link SendInvoice}
     */
    public SendInvoice photoUrl(String photoUrl) {
        return add("photo_url", photoUrl);
    }

    /**
     * Optional
     * @param photoSize Photo size in bytes
     * @return {@link SendInvoice}
     */
    public SendInvoice photoSize(int photoSize) {
        return add("photo_size", photoSize);
    }

    /**
     * Optional
     * @param photoWidth Photo width
     * @return {@link SendInvoice}
     */
    public SendInvoice photoWidth(int photoWidth) {
        return add("photo_width", photoWidth);
    }

    /**
     * Optional
     * @param photoHeight Photo height
     * @return {@link SendInvoice}
     */
    public SendInvoice photoHeight(int photoHeight) {
        return add("photo_height", photoHeight);
    }

    /**
     * Optional
     * @param needName Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needName(boolean needName) {
        return add("need_name", needName);
    }

    /**
     * Optional
     * @param needPhoneNumber Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needPhoneNumber(boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    /**
     * Optional
     * @param needEmail Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needEmail(boolean needEmail) {
        return add("need_email", needEmail);
    }

    /**
     * Optional
     * @param needShippingAddress Pass True if you require the user's shipping address to complete the order.
     *                             Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needShippingAddress(boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    /**
     * Optional
     * @param sendPhoneNumberToProvider Pass True if the user's phone number should be sent to the provider.
     *                                     Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice sendPhoneNumberToProvider(boolean sendPhoneNumberToProvider) {
        return add("send_phone_number_to_provider", sendPhoneNumberToProvider);
    }

    /**
     * Optional
     * @param sendEmailToProvider Pass True if the user's email address should be sent to the provider.
     *                               Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice sendEmailToProvider(boolean sendEmailToProvider) {
        return add("send_email_to_provider", sendEmailToProvider);
    }

    /**
     * Optional
     * @param isFlexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice isFlexible(boolean isFlexible) {
        return add("is_flexible", isFlexible);
    }

    /*
     * Not implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendInvoice businessConnectionId(String businessConnectionId) {
        BotLog.warn("`sendInvoice` method doesn't support business_connection_id");
        return this;
    }
}
