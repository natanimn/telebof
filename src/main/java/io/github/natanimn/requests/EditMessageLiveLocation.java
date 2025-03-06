package io.github.natanimn.requests;

import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.Message;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EditMessageLiveLocation extends AbstractBaseRequest<EditMessageLiveLocation, Message> {
    public EditMessageLiveLocation(Object chatId, double latitude, double longitude, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "editMessageLiveLocation", Message.class);
       
        add("latitude", latitude);
        add("longitude", longitude);
        add("message_id", messageId);
    }

    public EditMessageLiveLocation(String inlineMessageId, double latitude, double longitude, RequestSender requestSender) {
        super(requestSender, "editMessageLiveLocation", Message.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageLiveLocation horizontalAccuracy(double horizontalAccuracy){
        return add("horizontal_accuracy", horizontalAccuracy);
    }

    public EditMessageLiveLocation heading(int heading){
        return add("heading", heading);
    }

    public EditMessageLiveLocation proximityAlertRadius(int proximityAlertRadius){
        return add("proximity_alert_radius", proximityAlertRadius);
    }

    public EditMessageLiveLocation replyMarkup(InlineKeyboardMarkup markup) {
        return add("reply_markup", markup);
    }

    public EditMessageLiveLocation livePeriod(int live_period){
        return add("live_period", live_period);
    }

    public EditMessageLiveLocation businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
