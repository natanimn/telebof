package io.github.natanimn.telebof.types.payments;

import lombok.Getter;

import java.util.List;

/**
 * Contains a list of Telegram Star transactions.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class StarTransactions {
    /**
     * The list of transactions
     */
    private List<StarTransaction> transactions;

}