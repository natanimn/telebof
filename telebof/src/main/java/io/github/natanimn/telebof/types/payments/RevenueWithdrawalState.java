package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.RevenueWithdrawalStateType;

/**
 * This class describes the state of a revenue withdrawal operation
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class RevenueWithdrawalState {
    /**
     * Type of the state
     */
    private RevenueWithdrawalStateType type;

    /**
     * Date the withdrawal was completed in Unix time
     */
    private Integer date;

    /**
     * An HTTPS URL that can be used to see transaction details
     */
    private String url;

    public RevenueWithdrawalStateType getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}