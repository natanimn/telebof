package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object describes the rating of a user based on their Telegram Star spendings.
 * @author Natnim
 * @since 1.3.0
 * @version 1.3.0
 */
public class UserRating {
    /**
     * Current level of the user, indicating their reliability when purchasing digital goods and services.
     * A higher level suggests a more trustworthy customer; a negative level is likely reason for concern.
     */
    private Integer level;

    /**
     * Numerical value of the user's rating; the higher the rating, the better
     */
    private Integer rating;

    /**
     * The rating value required to get the current level
     */
    @SerializedName("current_level_rating")
    private Integer currentLevelRating;

    /**
     * Optional. The rating value required to get to the next level; omitted if the maximum level was reached
     */
    @SerializedName("next_level_rating")
    private Integer nextLevelRating;

    public Integer getLevel() {
        return level;
    }

    public Integer getRating() {
        return rating;
    }

    public Integer getCurrentLevelRating() {
        return currentLevelRating;
    }

    public Integer getNextLevelRating() {
        return nextLevelRating;
    }
}
