package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents a venue. By default, the venue will be sent by the user.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the venue.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultVenue implements Serializable, InlineQueryResult {
    private String id;
    private String type;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    private String title;
    private String address;
    @SerializedName("foursquare_id")
    private String foursquareId;
    @SerializedName("foursquare_type")
    private String foursquareType;
    @SerializedName("google_place_id")
    private String googlePlaceId;
    @SerializedName("google_place_type")
    private String googlePlaceType;
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
     * @param latitude Latitude of the venue location in degrees
     * @param longitude Longitude of the venue location in degrees
     * @param title Title of the venue
     * @param address Address of the venue
     */
    public InlineQueryResultVenue(String id, Double latitude, Double longitude, String title, String address) {
        this.type = "venue";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    /**
     * Optional
     * @param foursquareId Foursquare identifier of the venue if known
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    /**
     * Optional
     * @param foursquareType Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    /**
     * Optional
     * @param googlePlaceId Google Places identifier of the venue
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
        return this;
    }

    /**
     * Optional
     * @param googlePlaceType Google Places type of the venue.
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setGooglePlaceType(String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
        return this;
    }

    /**
     * Optional
     * @param thumbnailUrl Url of the thumbnail for the result
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail width
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail height
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }

    /**
     * Optional
     * @param inputMessageContent Content of the message to be sent instead of the venue
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setInputMessageContent(InputTextMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }
}