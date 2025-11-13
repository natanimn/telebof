package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a user boosting a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @param boostCount Number of boosts added by the user
 */
public record ChatBoostAdded(@SerializedName("boost_count") Integer boostCount) { }
