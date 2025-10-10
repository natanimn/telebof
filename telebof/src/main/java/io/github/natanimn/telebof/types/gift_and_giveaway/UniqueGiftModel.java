package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes the model of a unique gift.
 * @param name Name of the model
 * @param sticker The sticker that represents the unique gift
 * @param rarityPerMille The number of unique gifts that receive this model for every 1000 gifts upgraded
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record UniqueGiftModel(
        String name,
        Sticker sticker,
        @SerializedName("rarity_per_mille") Integer rarityPerMille
) {}