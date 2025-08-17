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
 * @version 0.9
 * @see BotContext#sendVenue
 */
public class SendVenue extends SendBuilder<SendVenue, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param latitude latitude
     * @param longitude longitude
     * @param title title
     * @param address address
     * @param api api
     */
    public SendVenue(Object chat_id, double latitude, double longitude, String title, String address, Api api) {
        super(chat_id, api, "sendVenue", Message.class);
        add("latitude", latitude);
        add("longitude", longitude);
        add("title", title);
        add("address", address);
    }

    /**
     * Optional
     * @param foursquare_id Foursquare identifier of the venue
     * @return {@link SendVenue}
     */
    public SendVenue foursquareId(String foursquare_id){
        return add("foursquare_id", foursquare_id);
    }

    /**
     * Optional
     * @param foursquare_type Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     * @return {@link SendVenue}
     */
    public SendVenue foursquareType(String foursquare_type){
        return add("foursquare_type", foursquare_type);
    }

    /**
     * Optional
     * @param google_place_id Google Places identifier of the venue
     * @return {@link SendVenue}
     */
    public SendVenue googlePlaceId(String google_place_id){
        return add("google_place_id", google_place_id);
    }

    /**
     * Optional
     * @param google_place_type Google Places type of the venue.
     * @return {@link SendVenue}
     * @see <a href="https://developers.google.com/places/web-service/supported_types">Supported types</a>
     */
    public SendVenue googlePlaceType(String google_place_type){
        return add("google_place_type", google_place_type);
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendVenue parseMode(ParseMode parse_mode) {
        BotLog.warn("`sendVenue` method doesn't support parse_mode");
        return this;
    }

    /**
     * Not Implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendVenue disableWebPagePreview(boolean disable_web_page_preview) {
        BotLog.warn("`sendVenue` method doesn't support disable_web_page_preview");
        return this;
    }
}
