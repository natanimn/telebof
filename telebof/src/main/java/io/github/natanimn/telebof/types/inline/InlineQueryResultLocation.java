package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;


/**
 * Represents a location on a map. By default, the location will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the location.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultLocation implements InlineQueryResult {
    private String id;
    private String type;
    private String location;
    private String thumbnail_url;
    private String title;
    private Integer live_period;
    private Integer heading;
    private Integer proximity_alert_radius;
    private Integer thumbnail_width;
    private Integer thumbnail_height;
    private Double latitude;
    private Double longitude;
    private Float horizontal_accuracy;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param latitude Location latitude in degrees
     * @param longitude Location longitude in degrees
     * @param title Location title
     */
    public InlineQueryResultLocation(String id, double latitude, double longitude, String title) {
        this.type = "location";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
    }

    /**
     * Optional
     * @param horizontal_accuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation horizontalAccuracy(Float horizontal_accuracy) {
        this.horizontal_accuracy = horizontal_accuracy;
        return this;
    }

    /**
     * Optional
     * @param live_period Period in seconds during which the location can be updated, should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation livePeriod(int live_period) {
        this.live_period = live_period;
        return this;
    }

    /**
     * Optional
     * @param heading For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation heading(int heading) {
        this.heading = heading;
        return this;
    }

    /**
     * Optional
     * @param proximity_alert_radius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters. Must be between 1 and 100000 if specified.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation proximityAlertRadius(int proximity_alert_radius) {
        this.proximity_alert_radius = proximity_alert_radius;
        return this;
    }

    /**
     * Optional
     * @param input_message_content Content of the message to be sent instead of the location
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation inputMessageContent(InputTextMessageContent input_message_content) {
        this.input_message_content = input_message_content;
        return this;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_url Url of the thumbnail for the result
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation thumbnailUrl(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_width Thumbnail width
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation thumbnailWidth(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_height Thumbnail height
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation thumbnailHeight(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

}
