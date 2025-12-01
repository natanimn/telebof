package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a location on a map. By default, the location will be sent by the user.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the location.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultLocation implements InlineQueryResult {
    private String id;
    private String type;
    private String title;
    @SerializedName("live_period")
    private Integer livePeriod;
    private Integer heading;
    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;
    private Double latitude;
    private Double longitude;
    @SerializedName("horizontal_accuracy")
    private Float horizontalAccuracy;
    @SerializedName("input_message_content")
    private InputTextMessageContent inputMessageContent;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param latitude Location latitude in degrees
     * @param longitude Location longitude in degrees
     * @param title Location title
     */
    public InlineQueryResultLocation(String id, Double latitude, Double longitude, String title) {
        this.type = "location";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
    }

    /**
     * Optional
     * @param horizontalAccuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }

    /**
     * Optional
     * @param livePeriod Period in seconds during which the location can be updated, should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    /**
     * Optional
     * @param heading For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setHeading(Integer heading) {
        this.heading = heading;
        return this;
    }

    /**
     * Optional
     * @param proximityAlertRadius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters. Must be between 1 and 100000 if specified.
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
        return this;
    }

    /**
     * Optional
     * @param inputMessageContent Content of the message to be sent instead of the location
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setInputMessageContent(InputTextMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional
     * @param thumbnailUrl Url of the thumbnail for the result
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail width
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail height
     * @return {@link InlineQueryResultLocation}
     */
    public InlineQueryResultLocation setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}