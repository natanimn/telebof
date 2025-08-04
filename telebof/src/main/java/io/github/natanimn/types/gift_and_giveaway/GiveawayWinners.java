package io.github.natanimn.types.gift_and_giveaway;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.chat_and_user.Chat;

import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GiveawayWinners {
    public Chat chat;
    public int giveaway_message_id;
    public int winners_selection_date;
    public int winner_count;
    public List<User> winners;
    public Integer additional_chat_count, premium_subscription_month_count, unclaimed_prize_count, prize_star_count ;
    public Boolean only_new_members, was_refunded;
    public String prize_description;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GiveawayWinners that = (GiveawayWinners) object;
        return giveaway_message_id == that.giveaway_message_id && winners_selection_date == that.winners_selection_date
                && winner_count == that.winner_count && Objects.equals(chat, that.chat) &&
                Objects.equals(winners, that.winners) && Objects.equals(additional_chat_count, that.additional_chat_count) &&
                Objects.equals(premium_subscription_month_count, that.premium_subscription_month_count) &&
                Objects.equals(unclaimed_prize_count, that.unclaimed_prize_count) &&
                Objects.equals(only_new_members, that.only_new_members) && Objects.equals(was_refunded, that.was_refunded) &&
                Objects.equals(prize_description, that.prize_description) &&
                Objects.equals(prize_star_count, that.prize_star_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, giveaway_message_id, winners_selection_date, winner_count, winners,
                additional_chat_count, premium_subscription_month_count, unclaimed_prize_count, only_new_members,
                was_refunded, prize_description, prize_star_count);
    }
}
