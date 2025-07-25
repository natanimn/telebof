package io.github.natanimn.requests;

import io.github.natanimn.types.LabeledPrice;
import java.util.List;

/**
 * @author Natanim
 * @since March 3, 2025
 * @version 0.6
 */
public class CreateInvoiceLink extends AbstractBaseRequest<CreateInvoiceLink, String> {
    public CreateInvoiceLink(Object chatId, String title, String description, String payload,
                             String currency, LabeledPrice[] prices, RequestSender requestSender) {
        super(chatId, requestSender, "createInvoiceLink", Object.class);
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("currency", currency);
        add("prices", List.of(prices));
    }

    public CreateInvoiceLink providerToken(String providerToken){
        return add("provider_token", providerToken);
    }
    public CreateInvoiceLink maxTipAmount(int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    public CreateInvoiceLink suggestedTipAmounts(int[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", List.of(suggestedTipAmounts));
    }

    public CreateInvoiceLink providerData(String providerData) {
        return add("provider_data", providerData);
    }

    public CreateInvoiceLink photoUrl(String photoUrl) {
        return add("photo_url", photoUrl);
    }

    public CreateInvoiceLink photoSize(int photoSize) {
        return add("photo_size", photoSize);
    }

    public CreateInvoiceLink photoWidth(int photoWidth) {
        return add("photo_width", photoWidth);
    }

    public CreateInvoiceLink photoHeight(int photoHeight) {
        return add("photo_height", photoHeight);
    }

    public CreateInvoiceLink needName(boolean needName) {
        return add("need_name", needName);
    }

    public CreateInvoiceLink needPhoneNumber(boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    public CreateInvoiceLink needEmail(boolean needEmail) {
        return add("need_email", needEmail);
    }

    public CreateInvoiceLink needShippingAddress(boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    public CreateInvoiceLink sendPhoneNumberToProvider(boolean sendPhoneNumberToProvider) {
        return add("send_phone_number_to_provider", sendPhoneNumberToProvider);
    }

    public CreateInvoiceLink sendEmailToProvider(boolean sendEmailToProvider) {
        return add("send_email_to_provider", sendEmailToProvider);
    }

    public CreateInvoiceLink isFlexible(boolean isFlexible) {
        return add("is_flexible", isFlexible);
    }

    /**
     * @param subscription_period The number of seconds the subscription will be active for before the next payment.
     * The currency must be set to “XTR” (Telegram Stars) if the parameter is used.
     * Currently, it must always be 2592000 (30 days) if specified.
     * Any number of subscriptions can be active for a given bot at the same time, including multiple concurrent
     * subscriptions from the same user. Subscription price must not exceed 10000 Telegram Stars.
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
