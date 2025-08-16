package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.BotLog;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;

/**
 * SendInvoice class. Returns the sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#sendInvoice
 */
public class SendInvoice extends SendBuilder<SendInvoice, Message> {
    /**
     * Required
     * @param chat_id chat id
     * @param title title
     * @param description description
     * @param payload payload
     * @param currency currency
     * @param prices prices
     * @param requestSender request sender
     */
    public SendInvoice(Object chat_id, String title, String description, String payload,
                       String currency, LabeledPrice[] prices, RequestSender requestSender) {
        super(chat_id, requestSender, "sendInvoice");
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("currency", currency);
        add("prices", prices);
    }

    /**
     * Optional
     * @param provider_token Payment provider token, obtained via @BotFather. Pass an empty string for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice providerToken(String provider_token){
        return add("provider_token", provider_token);
    }

    /**
     * Optional
     * @param max_tip_amount The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     *                       For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145.
     *                       See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     *                       Defaults to 0. Not supported for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice maxTipAmount(int max_tip_amount) {
        return add("max_tip_amount", max_tip_amount);
    }

    /**
     * Optional
     * @param suggested_tip_amounts A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double).
     *                              At most 4 suggested tip amounts can be specified. The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
     * @return {@link SendInvoice}
     */
    public SendInvoice suggestedTipAmounts(int[] suggested_tip_amounts) {
        return add("suggested_tip_amounts", List.of(suggested_tip_amounts));
    }

    /**
     * Optional
     * @param start_parameter Unique deep-linking parameter.
     *                        If left empty, forwarded copies of the sent message will have a Pay button, allowing multiple users to pay directly from the forwarded message, using the same invoice.
     *                        If non-empty, forwarded copies of the sent message will have a URL button with a deep link to the bot (instead of a Pay button), with the value used as the start parameter
     * @return {@link SendInvoice}
     */
    public SendInvoice startParameter(String start_parameter) {
        return add("start_parameter", start_parameter);
    }

    /**
     * Optional
     * @param provider_data JSON-serialized data about the invoice, which will be shared with the payment provider.
     *                      A detailed description of required fields should be provided by the payment provider.
     * @return {@link SendInvoice}
     */
    public SendInvoice providerData(String provider_data) {
        return add("provider_data", provider_data);
    }

    /**
     * Optional
     * @param photo_url URL of the product photo for the invoice.
     *                  Can be a photo of the goods or a marketing image for a service.
     *                  People like it better when they see what they are paying for.
     * @return {@link SendInvoice}
     */
    public SendInvoice photoUrl(String photo_url) {
        return add("photo_url", photo_url);
    }

    /**
     * Optional
     * @param photo_size Photo size in bytes
     * @return {@link SendInvoice}
     */
    public SendInvoice photoSize(int photo_size) {
        return add("photo_size", photo_size);
    }

    /**
     * Optional
     * @param photo_width Photo width
     * @return {@link SendInvoice}
     */
    public SendInvoice photoWidth(int photo_width) {
        return add("photo_width", photo_width);
    }

    /**
     * Optional
     * @param photo_height Photo height
     * @return {@link SendInvoice}
     */
    public SendInvoice photoHeight(int photo_height) {
        return add("photo_height", photo_height);
    }

    /**
     * Optional
     * @param need_name Pass True if you require the user's full name to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needName(boolean need_name) {
        return add("need_name", need_name);
    }

    /**
     * Optional
     * @param need_phone_number Pass True if you require the user's phone number to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needPhoneNumber(boolean need_phone_number) {
        return add("need_phone_number", need_phone_number);
    }

    /**
     * Optional
     * @param need_email Pass True if you require the user's email address to complete the order. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needEmail(boolean need_email) {
        return add("need_email", need_email);
    }

    /**
     * Optional
     * @param need_shipping_address Pass True if you require the user's shipping address to complete the order.
     *                             Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice needShippingAddress(boolean need_shipping_address) {
        return add("need_shipping_address", need_shipping_address);
    }

    /**
     * Optional
     * @param send_phone_number_to_provider Pass True if the user's phone number should be sent to the provider.
     *                                     Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice sendPhoneNumberToProvider(boolean send_phone_number_to_provider) {
        return add("send_phone_number_to_provider", send_phone_number_to_provider);
    }

    /**
     * Optional
     * @param send_email_to_provider Pass True if the user's email address should be sent to the provider.
     *                               Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice sendEmailToProvider(boolean send_email_to_provider) {
        return add("send_email_to_provider", send_email_to_provider);
    }

    /**
     * Optional
     * @param is_flexible Pass True if the final price depends on the shipping method. Ignored for payments in Telegram Stars.
     * @return {@link SendInvoice}
     */
    public SendInvoice isFlexible(boolean is_flexible) {
        return add("is_flexible", is_flexible);
    }

    /*
     * Not implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendInvoice businessConnectionId(String business_connection_id) {
        BotLog.warn("`sendInvoice` method doesn't support business_connection_id");
        return this;
    }
}
