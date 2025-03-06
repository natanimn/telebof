package io.github.natanimn.requests;

import io.github.natanimn.types.Markup;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.ReplyParameters;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendLocation extends AbstractBaseRequest<SendLocation, Message> {
    public SendLocation(Object chatId, double latitude, double longitude, RequestSender requestSender) {
        super(chatId, requestSender, "sendLocation", Message.class);
        add("longitude", longitude);
        add("latitude", latitude);
    }

    public SendLocation horizontalAccuracy(double horizontalAccuracy) {
        return add("horizontal_accuracy", horizontalAccuracy);
    }

    public SendLocation livePeriod(int livePeriod){
        return add("live_period", livePeriod);
    }

    public SendLocation heading(int heading){
        return add("heading", heading);
    }

    public SendLocation proximityAlertRadius(int proximityAlertRadius){
        return add("proximity_alert_radius", proximityAlertRadius);
    }

    public SendLocation disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendLocation protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public SendLocation replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public SendLocation  allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public SendLocation replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    public SendLocation replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public SendLocation businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public SendLocation messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }
}
