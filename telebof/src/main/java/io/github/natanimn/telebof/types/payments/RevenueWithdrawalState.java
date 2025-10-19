package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.RevenueWithdrawalStateType;

/**
 * This class describes the state of a revenue withdrawal operation
 * @param type Type of the state
 * @param date Date the withdrawal was completed in Unix time
 * @param url An HTTPS URL that can be used to see transaction details
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record RevenueWithdrawalState(
        RevenueWithdrawalStateType type,
        Integer date,
        String url
) {}