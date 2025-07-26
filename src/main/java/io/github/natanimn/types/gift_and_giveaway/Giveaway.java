package io.github.natanimn.types.gift_and_giveaway;

import io.github.natanimn.types.chat_and_user.Chat;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class Giveaway implements Serializable {
    public List<Chat> chats;
    public int winners_selection_date;
    public int winner_count;
    public Boolean only_new_members, has_public_winners;
    public String prize_description;
    public List<String> country_codes;
    public Integer premium_subscription_month_count, prize_star_count;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Giveaway giveaway = (Giveaway) object;
        return winners_selection_date == giveaway.winners_selection_date && winner_count == giveaway.winner_count &&
                Objects.equals(chats, giveaway.chats) && Objects.equals(only_new_members, giveaway.only_new_members) &&
                Objects.equals(has_public_winners, giveaway.has_public_winners) &&
                Objects.equals(prize_description, giveaway.prize_description) &&
                Objects.equals(country_codes, giveaway.country_codes) &&
                Objects.equals(premium_subscription_month_count, giveaway.premium_subscription_month_count) &&
                Objects.equals(prize_star_count, giveaway.prize_star_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chats, winners_selection_date, winner_count, only_new_members, has_public_winners,
                prize_description, country_codes, premium_subscription_month_count, prize_star_count);
    }
}
