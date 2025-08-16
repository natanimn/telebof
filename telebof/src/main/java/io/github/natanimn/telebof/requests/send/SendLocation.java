package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.keyboard.ReplyParameters;

/**
 * SendLocation class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendLocation extends AbstractBaseRequest<SendLocation, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param latitude latitude
     * @param longitude longitude
     * @param requestSender request sender
     */
    public SendLocation(Object chat_id, double latitude, double longitude, RequestSender requestSender) {
        super(chat_id, requestSender, "sendLocation", Message.class);
        add("longitude", longitude);
        add("latitude", latitude);
    }

    /**
     * Optional
     * @param horizontal_accuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link SendLocation}
     */
    public SendLocation horizontalAccuracy(double horizontal_accuracy) {
        return add("horizontal_accuracy", horizontal_accuracy);
    }

    /**
     * Optional
     * @param live_period Period in seconds during which the location will be updated (should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @see <a href="https://telegram.org/blog/live-locations">Live locations</a>
     * @return {@link SendLocation}
     */
    public SendLocation livePeriod(int live_period){
        return add("live_period", live_period);
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
     * @param proximity_alert_radius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters.
     *                               Must be between 1 and 100000 if specified.
     * @return {@link SendLocation}
     */
    public SendLocation proximityAlertRadius(int proximity_alert_radius){
        return add("proximity_alert_radius", proximity_alert_radius);
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
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link SendLocation}
     */
    public SendLocation protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link SendLocation}
     */
    public SendLocation replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendLocation}
     */
    public SendLocation replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendLocation}
     */
    public SendLocation businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param message_effect_id Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link SendLocation}
     */
    public SendLocation messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }
}
