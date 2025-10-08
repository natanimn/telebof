package io.github.natanimn.telebof.types.gift_and_giveaway;

import java.util.List;

/**
 * This class represent a list of gifts.
 * @param gifts Array of {@link Gift}
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */
public record Gifts(
        List<Gift> gifts
) {}