package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * EditMessageLiveLocation class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class EditMessageLiveLocation extends AbstractBaseRequest<EditMessageLiveLocation, Object> {
    /**
     * Required
     * @param chat_id chat id
     * @param latitude latitude
     * @param longitude longitude
     * @param message_id message id
     * @param api api
     * @see BotContext#editMessageLiveLocation(Object, double, double, int)
     */
    public EditMessageLiveLocation(Object chat_id, double latitude, double longitude, int message_id, Api api) {
        super(chat_id, api, "editMessageLiveLocation", Message.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("message_id", message_id);
    }

    /**
     * Required
     * @param inline_message_id inline message id
     * @param latitude latitude
     * @param longitude longitude
     * @param api api
     */
    public EditMessageLiveLocation(String inline_message_id, double latitude, double longitude, Api api) {
        super(api, "editMessageLiveLocation", Boolean.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("inline_message_id", inline_message_id);
    }

    /**
     * Optional
     * @param horizontal_accuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation horizontalAccuracy(double horizontal_accuracy){
        return add("horizontal_accuracy", horizontal_accuracy);
    }

    /**
     * Optional
     * @param heading Direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation heading(int heading){
        return add("heading", heading);
    }

    /**
     * Optional
     * @param proximity_alert_radius The maximum distance for proximity alerts about approaching another chat member, in meters.
     *                               Must be between 1 and 100000 if specified.
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation proximityAlertRadius(int proximity_alert_radius){
        return add("proximity_alert_radius", proximity_alert_radius);
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for a new inline keyboard.
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param live_period New period in seconds during which the location can be updated, starting from the message send date.
     *                    If 0x7FFFFFFF is specified, then the location can be updated forever.
     *                    Otherwise, the new value must not exceed the current live_period by more than a day, and the live location expiration date must remain within the next 90 days.
     *                    If not specified, then live_period remains unchanged
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation livePeriod(int live_period){
        return add("live_period", live_period);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageLiveLocation}
     */
    public EditMessageLiveLocation businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
