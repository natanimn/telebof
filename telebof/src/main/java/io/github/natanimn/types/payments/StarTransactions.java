package io.github.natanimn.types.payments;

import java.util.List;
import java.util.Objects;

/**
 * Contains a list of Telegram Star transactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class StarTransactions {
    /* The list of transactions */
    public List<StarTransaction> transactions;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        StarTransactions that = (StarTransactions) object;
        return Objects.equals(transactions, that.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactions);
    }
}
