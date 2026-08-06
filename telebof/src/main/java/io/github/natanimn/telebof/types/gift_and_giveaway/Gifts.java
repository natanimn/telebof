package io.github.natanimn.telebof.types.gift_and_giveaway;

import lombok.Getter;

import java.util.List;

/**
 * This class represent a list of gifts.
 * @author Natanim
 * @since July 25, 2025
 */
@Getter
public class Gifts {
    /**
     * Array of {@link Gift}
     */
    private List<Gift> gifts;

}