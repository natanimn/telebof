package io.github.natanimn.types.gift_and_giveaway;

import io.github.natanimn.types.updates.Message;

import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class GiveawayCompleted {
    public int winner_count;
    public Integer unclaimed_prize_count;
    public Message giveaway_message;
    public Boolean is_star_giveaway;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GiveawayCompleted that = (GiveawayCompleted) object;
        return winner_count == that.winner_count && Objects.equals(unclaimed_prize_count, that.unclaimed_prize_count)
                && Objects.equals(giveaway_message, that.giveaway_message) &&
                Objects.equals(is_star_giveaway, that.is_star_giveaway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winner_count, unclaimed_prize_count, giveaway_message, is_star_giveaway);
    }
}
