package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultLocation implements Serializable, InlineQueryResult {
    private String id, type, location, thumbnail_url;
    private Integer live_period, heading, proximity_alert_radius, thumbnail_width, thumbnail_height;
    private double latitude, longitude, horizontal_accuracy;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    public InlineQueryResultLocation(String id, double latitude, double longitude) {
        this.type = "location";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public InlineQueryResultLocation horizontalAccuracy(double horizontalAccuracy) {
        this.horizontal_accuracy = horizontalAccuracy;
        return this;
    }

    public InlineQueryResultLocation livePeriod(int livePeriod) {
        this.live_period = livePeriod;
        return this;
    }

    public InlineQueryResultLocation heading(int heading) {
        this.heading = heading;
        return this;
    }

    public InlineQueryResultLocation proximityAlertRadius(int proximityAlertRadius) {
        this.proximity_alert_radius = proximityAlertRadius;
        return this;
    }

    public InlineQueryResultLocation inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return this;
    }

    public InlineQueryResultLocation replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    public InlineQueryResultLocation thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    public InlineQueryResultLocation thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

    public InlineQueryResultLocation thumbnailHeight(int thumbnailHeight) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

}
