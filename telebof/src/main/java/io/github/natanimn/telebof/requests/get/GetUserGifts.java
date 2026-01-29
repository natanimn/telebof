package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.OwnedGifts;

/**
 * GetUserGifts class. Returns {@link OwnedGifts} on success.
 * @author Natanim
 * @since 1.3.0
 * @version 1.3.0
 */
public class GetUserGifts extends AbstractBaseRequest<GetUserGifts, OwnedGifts> {
    /**
     * Required
     * @param userId user id
     * @param api api
     */
    public GetUserGifts(long userId, Api api){
        super(api, "getUserGifts", OwnedGifts.class);
        add("user_id", userId);
    }

    /**
     * Optional
     * @param excludeUnlimited Pass True to exclude gifts that can be purchased an unlimited number of times
     * @return {@link GetUserGifts}
     */
    public GetUserGifts excludeUnlimited(Boolean excludeUnlimited){
        return add("exclude_unlimited", excludeUnlimited);
    }

    /**
     * Optional
     * @param excludeLimitedUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can be upgraded to unique
     * @return {@link GetUserGifts}
     */
    public GetUserGifts excludeLimitedUpgradable(Boolean excludeLimitedUpgradable){
        return add("exclude_limited_upgradable", excludeLimitedUpgradable);
    }

    /**
     * Optional
     * @param excludeLimitedNonUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can't be upgraded to unique
     * @return {@link GetUserGifts}
     */
    public GetUserGifts excludeLimitedNonUpgradable(Boolean excludeLimitedNonUpgradable){
        return add("exclude_limited_non_upgradable", excludeLimitedNonUpgradable);
    }

    /**
     * Optional
     * @param excludeFromBlockchain Pass True to exclude gifts that were assigned from the TON blockchain and can't be resold or transferred in Telegram
     * @return {@link GetUserGifts}
     */
    public GetUserGifts excludeFromBlockchain(Boolean excludeFromBlockchain){
        return add("exclude_from_blockchain", excludeFromBlockchain);
    }

    /**
     * Optional
     * @param excludeUnique Pass True to exclude unique gifts
     * @return {@link GetUserGifts}
     */
    public GetUserGifts excludeUnique(Boolean excludeUnique){
        return add("exclude_unique", excludeUnique);
    }

    /**
     * Optional
     * @param sortByPrice Pass True to sort results by gift price instead of send date. Sorting is applied before pagination.
     * @return {@link GetUserGifts}
     */
    public GetUserGifts sortByPrice(Boolean sortByPrice){
        return add("sort_by_price", sortByPrice);
    }

    /**
     * Optional
     * @param offset Offset of the first entry to return as received from the previous request; use an empty string to get the first chunk of results
     * @return {@link GetUserGifts}
     */
    public GetUserGifts offset(String offset){
        return add("offset", offset);
    }

    /**
     * Optional
     * @param limit The maximum number of gifts to be returned; 1-100. Defaults to 100
     * @return {@link GetUserGifts}
     */
    public GetUserGifts limit(int limit){
        return add("limit", limit);
    }
}
