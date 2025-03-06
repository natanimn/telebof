package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.ReplyParameters;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendVenue extends AbstractBaseRequest<SendVenue, Message> {

    public SendVenue(Object chatId, double latitude, double longitude, String title, String address, RequestSender requestSender) {
        super(chatId, requestSender, "sendVenue", Message.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("title", title);
        add("address", address);
    }

    public SendVenue foursquareId(String foursquareId){
        return add("foursquare_id", foursquareId);
    }

    public SendVenue foursquareType(String foursquareType){
        return add("foursquare_type", foursquareType);
    }

    public SendVenue googlePlaceId(String googlePlaceId){
        return add("google_place_id", googlePlaceId);
    }

    public SendVenue googlePlaceType(String googlePlaceType){
        return add("google_place_type", googlePlaceType);
    }

    public SendVenue disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendVenue protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public SendVenue replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public SendVenue  allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public SendVenue replyParameters(ReplyParameters parameters){
        return add("reply_parameters", parameters);
    }

    public SendVenue businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    public SendVenue messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }
}
