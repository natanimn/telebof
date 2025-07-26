package io.github.natanimn.types.payments;

import io.github.natanimn.enums.RevenueWithdrawalStateType;

import java.util.Objects;

/**
 * This class describes the state of a revenue withdrawal operation
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class RevenueWithdrawalState {
    /**
     * Type of the state
     */
    public RevenueWithdrawalStateType type;

    /**
     * Date the withdrawal was completed in Unix time
     */
    public Integer date;

    /**
     * An HTTPS URL that can be used to see transaction details
     */
    public String url;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        RevenueWithdrawalState that = (RevenueWithdrawalState) object;
        return Objects.equals(type, that.type) && Objects.equals(url, that.url) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url, date);
    }
}
