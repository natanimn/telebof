package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;

/**
 * SetBusinessAccountGiftSettings class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountGiftSettings
 */
public class SetBusinessAccountGiftSettings extends AbstractBaseRequest<SetBusinessAccountGiftSettings, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param showGiftButton show gift button
     * @param acceptedGiftTypes accepted gift type
     * @param api api
     */
    public SetBusinessAccountGiftSettings(String businessConnectionId, boolean showGiftButton,
                                          AcceptedGiftTypes acceptedGiftTypes, Api api){
        super(api, "setBusinessAccountGiftSettings", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("show_gift_button", showGiftButton);
        add("accepted_gift_types", acceptedGiftTypes);

    }
}
