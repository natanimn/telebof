package io.github.natanimn.telebof.types.payments;

import java.util.List;

/**
 * Contains a list of Telegram Star transactions.
 * @param transactions The list of transactions
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record StarTransactions(
        List<StarTransaction> transactions
) {}