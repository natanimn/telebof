package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes a unique gift that was upgraded from a regular gift.
 * @param baseName Human-readable name of the regular gift from which this unique gift was upgraded
 * @param name Unique name of the gift. This name can be used in https://t.me/nft/... links and story areas
 * @param number Unique number of the upgraded gift among gifts upgraded from the same regular gift
 * @param model Model of the gift
 * @param symbol Symbol of the gift
 * @param backdrop Backdrop of the gift
 * @param publisherChat Optional. Information about the chat that published the gift
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record UniqueGift(
        @SerializedName("base_name") String baseName,
        String name,
        Integer number,
        UniqueGiftModel model,
        UniqueGiftSymbol symbol,
        UniqueGiftBackdrop backdrop,
        @SerializedName("publisher_chat") Chat publisherChat
) {}