package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
/**
 * GiftPremiumSubscription class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#giftPremiumSubscription
 */
public class GiftPremiumSubscription extends AbstractBaseRequest<GiftPremiumSubscription, Boolean> {
    /**
     * Required
     * @param user_id Unique identifier of the target user who will receive a Telegram Premium subscription
     * @param month_count Number of months the Telegram Premium subscription will be active for the user
     * @param star_count Number of Telegram Stars to pay for the Telegram Premium subscription
     * @param api api
     */
    public GiftPremiumSubscription(long user_id, Integer month_count, Integer star_count, Api api) {
        super(api, "giftPremiumSubscription", Boolean.class);
        add("user_id", user_id);
        add("month_count", month_count);
        add("star_count", star_count);
    }

    /**
     * Optional
     * @param text Text that will be shown along with the service message about the subscription; 0-128 characters
     * @return {@link GiftPremiumSubscription}
     */
    public GiftPremiumSubscription text(String text) {
        return add("text", text);
    }

    /**
     * Optional
     * @param text_parse_mode Mode for parsing entities in the text.
     *                        Entities other than {@link io.github.natanimn.telebof.enums.EntityType#BOLD}, {@link io.github.natanimn.telebof.enums.EntityType#ITALIC},
     *                        {@link io.github.natanimn.telebof.enums.EntityType#UNDERLINE}, {@link io.github.natanimn.telebof.enums.EntityType#STRIKETHROUGH},
     *                        {@link io.github.natanimn.telebof.enums.EntityType#SPOILER}, and {@link io.github.natanimn.telebof.enums.EntityType#CUSTOM_EMOJI} are ignored.
     * @return {@link GiftPremiumSubscription}
     */
    public GiftPremiumSubscription textParseMode(ParseMode text_parse_mode) {
        return add("text_parse_mode", text_parse_mode);
    }

    /**
     * Optional
     * @param text_entities A JSON-serialized list of special entities that appear in the gift text. It can be specified instead of {@link #textParseMode(ParseMode)}.
     *                      Entities other than {@link io.github.natanimn.telebof.enums.EntityType#BOLD}, {@link io.github.natanimn.telebof.enums.EntityType#ITALIC},
     *                      {@link io.github.natanimn.telebof.enums.EntityType#UNDERLINE}, {@link io.github.natanimn.telebof.enums.EntityType#STRIKETHROUGH},
     *                      {@link io.github.natanimn.telebof.enums.EntityType#SPOILER}, and {@link io.github.natanimn.telebof.enums.EntityType#CUSTOM_EMOJI} are ignored.
     * @return {@link GiftPremiumSubscription}
     */
    public GiftPremiumSubscription textEntities(MessageEntity[] text_entities) {
        return add("text_entities", text_entities);
    }
}
