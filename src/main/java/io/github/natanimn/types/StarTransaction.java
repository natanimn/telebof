package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class StarTransaction {
    public String id;
    public Integer amount, date;
    public TransactionPartner source, receiver;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        StarTransaction that = (StarTransaction) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(date, that.date) &&
                Objects.equals(source, that.source) &&
                Objects.equals(receiver, that.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, date, source, receiver);
    }
}
