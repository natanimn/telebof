package io.github.natanimn.telebof.types.payments;

import java.util.List;

/**
 * Contains a list of Telegram Star transactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class StarTransactions {
    /**
     * The list of transactions
     */
    private List<StarTransaction> transactions;

    public List<StarTransaction> getTransactions() {
        return transactions;
    }
}