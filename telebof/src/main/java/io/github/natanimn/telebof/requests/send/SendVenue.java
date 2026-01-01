package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.BotLog;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * SendVenue class. Returns sent {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendVenue
 */
public class SendVenue extends SendBuilder<SendVenue, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param latitude latitude
     * @param longitude longitude
     * @param title title
     * @param address address
     * @param api api
     */
    public SendVenue(Object chatId, double latitude, double longitude, String title, String address, Api api) {
        super(chatId, api, "sendVenue", Message.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("title", title);
        add("address", address);
    }

    /**
     * Optional
     * @param foursquareId Foursquare identifier of the venue
     * @return {@link SendVenue}
     */
    public SendVenue foursquareId(String foursquareId){
        return add("foursquare_id", foursquareId);
    }

    /**
     * Optional
     * @param foursquareType Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     * @return {@link SendVenue}
     */
    public SendVenue foursquareType(String foursquareType){
        return add("foursquare_type", foursquareType);
    }

    /**
     * Optional
     * @param googlePlaceId Google Places identifier of the venue
     * @return {@link SendVenue}
     */
    public SendVenue googlePlaceId(String googlePlaceId){
        return add("google_place_id", googlePlaceId);
    }

    /**
     * Optional
     * @param googlePlaceType Google Places type of the venue.
     * @return {@link SendVenue}
     * @see <a href="https://developers.google.com/places/web-service/supported_types">Supported types</a>
     */
    public SendVenue googlePlaceType(String googlePlaceType){
        return add("google_place_type", googlePlaceType);
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendVenue parseMode(ParseMode parseMode) {
        BotLog.warn("`sendVenue` method doesn't support parse_mode");
        return this;
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendVenue disableWebPagePreview(boolean disableWebPagePreview) {
        BotLog.warn("`sendVenue` method doesn't support disable_web_page_preview");
        return this;
    }
}
