package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GiveawayCompleted {
    public int winner_count;
    public Integer unclaimed_prize_count;
    public Message giveaway_message;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GiveawayCompleted that = (GiveawayCompleted) object;
        return winner_count == that.winner_count && Objects.equals(unclaimed_prize_count, that.unclaimed_prize_count)
                && Objects.equals(giveaway_message, that.giveaway_message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winner_count, unclaimed_prize_count, giveaway_message);
    }
}
