package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.RevenueWithdrawalStateType;
import lombok.Getter;

/**
 * This class describes the state of a revenue withdrawal operation
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}