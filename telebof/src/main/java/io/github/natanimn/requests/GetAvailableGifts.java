package io.github.natanimn.requests;

import io.github.natanimn.types.gift_and_giveaway.Gifts;

/**
 * @author Natanim
 * @since July 25, 2025
 * @version 0.6
 */
public class GetAvailableGifts extends AbstractBaseRequest<GetAvailableGifts, Gifts> {
    public GetAvailableGifts(RequestSender rs){
        super(rs, "getAvailableGifts");
    }
}
