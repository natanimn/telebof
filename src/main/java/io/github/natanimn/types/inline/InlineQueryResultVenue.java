package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultVenue implements Serializable, InlineQueryResult {
    private String id, type, thumbnail_url, title, address, foursquare_id, foursquare_type,
            google_place_id, google_place_type;
    private Integer thumbnail_width, thumbnail_height;
    private double latitude, longitude, horizontal_accuracy;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    public InlineQueryResultVenue(String id, double latitude, double longitude, String address) {
        this.type = "venue";
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }


    public InlineQueryResultVenue latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public InlineQueryResultVenue thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

    public InlineQueryResultVenue thumbnailHeight(int thumbnailHeight) {
        this.thumbnail_height = thumbnailHeight;
        return this;
    }

    public InlineQueryResultVenue title(String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultVenue foursquareId(String foursquareId) {
        this.foursquare_id = foursquareId;
        return this;
    }

    public InlineQueryResultVenue foursquareType(String foursquareType) {
        this.foursquare_type = foursquareType;
        return this;
    }

    public InlineQueryResultVenue googlePlaceId(String googlePlaceId) {
        this.google_place_id = googlePlaceId;
        return this;
    }

    public InlineQueryResultVenue googlePlaceType(String googlePlaceType) {
        this.google_place_type = googlePlaceType;
        return this;
    }

    public InlineQueryResultVenue inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return this;
    }

    public InlineQueryResultVenue replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    public InlineQueryResultVenue thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }



}
