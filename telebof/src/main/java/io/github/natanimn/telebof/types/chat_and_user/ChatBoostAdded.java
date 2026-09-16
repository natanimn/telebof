package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a service message about a user boosting a chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatBoostAdded {
    /**
     * Number of boosts added by the user
     */
    @SerializedName("boost_count")
    private Integer boostCount;

}