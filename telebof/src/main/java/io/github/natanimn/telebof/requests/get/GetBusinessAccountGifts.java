package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.OwnedGifts;

/**
 * GetBusinessAccountGifts class. Returns {@link OwnedGifts} on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#getBusinessAccountGifts
 */
public class GetBusinessAccountGifts extends AbstractBaseRequest<GetBusinessAccountGifts, OwnedGifts> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param api api
     */
    public GetBusinessAccountGifts(String businessConnectionId, Api api) {
        super(api, "getBusinessAccountGifts", OwnedGifts.class);
        add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param excludeUnsaved Pass True to exclude gifts that aren't saved to the account's profile page
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnsaved(boolean excludeUnsaved) {
        return add("exclude_unsaved", excludeUnsaved);
    }

    /**
     * Optional
     * @param excludeSaved Pass True to exclude gifts that are saved to the account's profile page
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeSaved(boolean excludeSaved) {
        return add("exclude_saved", excludeSaved);
    }

    /**
     * Optional
     * @param excludeUnlimited Pass True to exclude gifts that can be purchased an unlimited number of times
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnlimited(boolean excludeUnlimited) {
        return add("exclude_unlimited", excludeUnlimited);
    }

    /**
     * Optional
     * @param excludeLimitedUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can be upgraded to unique
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeLimitedUpgradable(Boolean excludeLimitedUpgradable){
        return add("exclude_limited_upgradable", excludeLimitedUpgradable);
    }

    /**
     * Optional
     * @param excludeLimitedNonUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can't be upgraded to unique
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeLimitedNonUpgradable(Boolean excludeLimitedNonUpgradable){
        return add("exclude_limited_non_upgradable", excludeLimitedNonUpgradable);
    }

    /**
     * Optional
     * @param excludeFromBlockchain Pass True to exclude gifts that were assigned from the TON blockchain and can't be resold or transferred in Telegram
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeFromBlockchain(Boolean excludeFromBlockchain){
        return add("exclude_from_blockchain", excludeFromBlockchain);
    }

    /**
     * Optional
     * @param excludeUnique Pass True to exclude unique gifts
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts excludeUnique(boolean excludeUnique) {
        return add("exclude_unique", excludeUnique);
    }

    /**
     * Optional
     * @param sortByPrice Pass True to sort results by gift price instead of send date
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts sortByPrice(boolean sortByPrice) {
        return add("sort_by_price", sortByPrice);
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