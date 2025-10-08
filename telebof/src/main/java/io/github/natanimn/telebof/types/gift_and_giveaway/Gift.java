package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a gift that can be sent by the bot.
 * @param id Unique identifier of the gift
 * @param sticker The sticker that represents the gift
 * @param starCount The number of Telegram Stars that must be paid to send the sticker
 * @param upgradeStarCount The number of Telegram Stars that must be paid to upgrade the gift to a unique one
 * @param totalCount The total number of the gifts of this type that can be sent; for limited gifts only
 * @param remainingCount The number of remaining gifts of this type that can be sent; for limited gifts only
 * @param publisherChat Optional. Information about the chat that published the gift
 * @author Natnim
 * @since July 25, 2025
 * @version 1.2.4
 */
public record Gift(
        String id,
        Sticker sticker,
        @SerializedName("star_count") Integer starCount,
        @SerializedName("upgrade_star_count") Integer upgradeStarCount,
        @SerializedName("total_count") Integer totalCount,
        @SerializedName("remaining_count") Integer remainingCount,
        @SerializedName("publisher_chat") Chat publisherChat
) {}