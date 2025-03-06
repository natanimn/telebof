package io.github.natanimn.requests;

import io.github.natanimn.types.LabeledPrice;
import io.github.natanimn.types.Message;
import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendInvoice extends DefaultParameters<SendInvoice, Message> {
    public SendInvoice(Object chatId, String title, String description, String payload,
                       String currency, LabeledPrice[] prices, RequestSender requestSender) {
        super(chatId, requestSender, "sendInvoice");
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("currency", currency);
        add("prices", prices);
    }

    public SendInvoice providerToken(String providerToken){
        return add("provider_token", providerToken);
    }
    public SendInvoice maxTipAmount(int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    public SendInvoice suggestedTipAmounts(int[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", List.of(suggestedTipAmounts));
    }

    public SendInvoice startParameter(String startParameter) {
        return add("start_parameter", startParameter);
    }

    public SendInvoice providerData(String providerData) {
        return add("provider_data", providerData);
    }

    public SendInvoice photoUrl(String photoUrl) {
        return add("photo_url", photoUrl);
    }

    public SendInvoice photoSize(int photoSize) {
        return add("photo_size", photoSize);
    }

    public SendInvoice photoWidth(int photoWidth) {
        return add("photo_width", photoWidth);
    }

    public SendInvoice photoHeight(int photoHeight) {
        return add("photo_height", photoHeight);
    }

    public SendInvoice needName(boolean needName) {
        return add("need_name", needName);
    }

    public SendInvoice needPhoneNumber(boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    public SendInvoice needEmail(boolean needEmail) {
        return add("need_email", needEmail);
    }

    public SendInvoice needShippingAddress(boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    public SendInvoice sendPhoneNumberToProvider(boolean sendPhoneNumberToProvider) {
        return add("send_phone_number_to_provider", sendPhoneNumberToProvider);
    }

    public SendInvoice sendEmailToProvider(boolean sendEmailToProvider) {
        return add("send_email_to_provider", sendEmailToProvider);
    }

    public SendInvoice isFlexible(boolean isFlexible) {
        return add("is_flexible", isFlexible);
    }

}
