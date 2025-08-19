package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;

/**
 * SetBusinessAccountGiftSettings class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountGiftSettings
 */
public class SetBusinessAccountGiftSettings extends AbstractBaseRequest<SetBusinessAccountGiftSettings, Boolean> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param show_gift_button show gift button
     * @param accepted_gift_types accepted gift type
     * @param api api
     */
    public SetBusinessAccountGiftSettings(String business_connection_id, boolean show_gift_button,
                                          AcceptedGiftTypes accepted_gift_types, Api api){
        super(api, "setBusinessAccountGiftSettings", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("show_gift_button", show_gift_button);
        add("accepted_gift_types", accepted_gift_types);

    }
}
