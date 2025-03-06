package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class RevenueWithdrawalState {
    public String type, url;
    public Integer date;

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
