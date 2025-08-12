package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 * This object describes the source of a chat boost.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatBoostSource {
    /**
     * Source of the boost, one of “premium”, "gift_code", "giveaway"
     */
    public String source;

    /**
     * Identifier of a message in the chat with the giveaway; the message could have been deleted already.
     * May be 0 if the message isn't sent yet.
     */
    public Integer giveaway_message_id;

    /**
     * The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    public Integer prize_star_count;

    /**
     * User
     */
    public User user;

    /**
     * True, if the giveaway was completed, but there was no user to win the prize
     */
    public Boolean is_unclaimed;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostSource that = (ChatBoostSource) object;
        return Objects.equals(source, that.source) && Objects.equals(giveaway_message_id, that.giveaway_message_id)
                && Objects.equals(user, that.user) && Objects.equals(is_unclaimed, that.is_unclaimed) &&
                Objects.equals(prize_star_count, that.prize_star_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, giveaway_message_id, user, is_unclaimed, prize_star_count);
    }
}
