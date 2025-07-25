package io.github.natanimn.types;

/**
 * This class represents a gift that can be sent by the bot.
 * @author Natnim
 * @since July 25, 2025
 * @version 0.6
 */

public class Gift {
    /* Unique identifier of the gift */
    public String id;

    /* The sticker that represents the gift */
    public Sticker sticker;

    /* The number of Telegram Stars that must be paid to send the sticker */
    public Integer star_count;

    /* The number of Telegram Stars that must be paid to upgrade the gift to a unique one */
    public Integer upgrade_star_count;

    /* The total number of the gifts of this type that can be sent; for limited gifts only */
    public Integer total_count;

    /* The number of remaining gifts of this type that can be sent; for limited gifts only */
    public Integer remaining_count;

}
