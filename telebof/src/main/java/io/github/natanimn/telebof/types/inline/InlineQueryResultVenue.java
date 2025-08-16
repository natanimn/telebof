package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Represents a venue. By default, the venue will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the venue.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultVenue implements Serializable, InlineQueryResult {
    private String id;
    private String type;
    private String thumbnail_url;
    private String title;
    private String address;
    private String foursquare_id;
    private String foursquare_type;
    private String google_place_id;
    private String google_place_type;
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
     * @param latitude Latitude of the venue location in degrees
     * @param longitude Longitude of the venue location in degrees
     * @param title Title of the venue
     * @param address Address of the venue
     */
    public InlineQueryResultVenue(String id, double latitude, double longitude, String title, String address) {
        this.type = "venue";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    /**
     * Optional
     * @param foursquare_id Foursquare identifier of the venue if known
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue foursquareId(String foursquare_id) {
        this.foursquare_id = foursquare_id;
        return this;
    }

    /**
     * Optional
     * @param foursquare_type Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue foursquareType(String foursquare_type) {
        this.foursquare_type = foursquare_type;
        return this;
    }

    /**
     * Optional
     * @param google_place_id Google Places identifier of the venue
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue googlePlaceId(String google_place_id) {
        this.google_place_id = google_place_id;
        return this;
    }

    /**
     * Optional
     * @param google_place_type Google Places type of the venue.
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue googlePlaceType(String google_place_type) {
        this.google_place_type = google_place_type;
        return this;
    }
    
    /**
     * Optional
     * @param thumbnail_url Url of the thumbnail for the result
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue thumbnailUrl(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_width Thumbnail width
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue thumbnailWidth(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_height Thumbnail height
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue thumbnailHeight(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

    /**
     * Optional
     * @param input_message_content Content of the message to be sent instead of the venue
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue inputMessageContent(InputTextMessageContent input_message_content) {
        this.input_message_content = input_message_content;
        return this;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultVenue}
     */
    public InlineQueryResultVenue replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

}
