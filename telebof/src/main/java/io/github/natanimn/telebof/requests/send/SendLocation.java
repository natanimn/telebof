package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.ReplyParameters;

/**
 * SendLocation class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendLocation extends AbstractBaseRequest<SendLocation, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param latitude latitude
     * @param longitude longitude
     * @param api api
     */
    public SendLocation(Object chatId, double latitude, double longitude, Api api) {
        super(chatId, api, "sendLocation", Message.class);
        add("longitude", longitude);
        add("latitude", latitude);
    }

    /**
     * Optional
     * @param horizontalAccuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link SendLocation}
     */
    public SendLocation horizontalAccuracy(double horizontalAccuracy) {
        return add("horizontal_accuracy", horizontalAccuracy);
    }

    /**
     * Optional
     * @param livePeriod Period in seconds during which the location will be updated (should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @see <a href="https://telegram.org/blog/live-locations">Live locations</a>
     * @return {@link SendLocation}
     */
    public SendLocation livePeriod(int livePeriod){
        return add("live_period", livePeriod);
    }

    /**
     * Optional
     * @param heading For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     * @return {@link SendLocation}
     */
    public SendLocation heading(int heading){
        return add("heading", heading);
    }

    /**
     * Optional
     * @param proximityAlertRadius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters.
     *                               Must be between 1 and 100000 if specified.
     * @return {@link SendLocation}
     */
    public SendLocation proximityAlertRadius(int proximityAlertRadius){
        return add("proximity_alert_radius", proximityAlertRadius);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendLocation}
     */
    public SendLocation disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link SendLocation}
     */
    public SendLocation protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link SendLocation}
     */
    public SendLocation replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendLocation}
     */
    public SendLocation replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendLocation}
     */
    public SendLocation businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link SendLocation}
     */
    public SendLocation messageEffectId(String messageEffectId){
        return add("message_effect_id ", messageEffectId);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link SendLocation}
     */
    public SendLocation directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    /**
     * Optional
     * @param suggestedPostParameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link SendLocation}
     */
    public SendLocation suggestedPostParameters(SuggestedPostParameters suggestedPostParameters){
        return add("suggested_post_parameters", suggestedPostParameters);
    }
}
