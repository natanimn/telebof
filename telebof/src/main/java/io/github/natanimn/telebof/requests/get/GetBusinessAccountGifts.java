package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.OwnedGifts;

/**
 * GetBusinessAccountGifts class. Returns {@link OwnedGifts} on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#getBusinessAccountGifts
 */
public class GetBusinessAccountGifts extends AbstractBaseRequest<GetBusinessAccountGifts, OwnedGifts> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param api api
     */
    public GetBusinessAccountGifts(String business_connection_id, Api api) {
        super(api, "getBusinessAccountGifts", OwnedGifts.class);
        add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param exclude_unsaved Pass True to exclude gifts that aren't saved to the account's profile page
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnsaved(Boolean exclude_unsaved) {
        return add("exclude_unsaved", exclude_unsaved);
    }

    /**
     * Optional
     * @param exclude_saved Pass True to exclude gifts that are saved to the account's profile page
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeSaved(Boolean exclude_saved) {
        return add("exclude_saved", exclude_saved);
    }

    /**
     * Optional
     * @param exclude_unlimited Pass True to exclude gifts that can be purchased an unlimited number of times
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnlimited(Boolean exclude_unlimited) {
        return add("exclude_unlimited", exclude_unlimited);
    }

    /**
     * Optional
     * @param exclude_limited Pass True to exclude gifts that can be purchased a limited number of times
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeLimited(Boolean exclude_limited) {
        return add("exclude_limited", exclude_limited);
    }

    /**
     * Optional
     * @param exclude_unique Pass True to exclude unique gifts
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnique(Boolean exclude_unique) {
        return add("exclude_unique", exclude_unique);
    }

    /**
     * Optional
     * @param sort_by_price Pass True to sort results by gift price instead of send date
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts sortByPrice(Boolean sort_by_price) {
        return add("sort_by_price", sort_by_price);
    }

    /**
     * Optional
     * @param offset Offset of the first entry to return as received from the previous request
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts offset(String offset) {
        return add("offset", offset);
    }

    /**
     * Optional
     * @param limit The maximum number of gifts to be returned; 1-100
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts limit(Integer limit) {
        return add("limit", limit);
    }
}