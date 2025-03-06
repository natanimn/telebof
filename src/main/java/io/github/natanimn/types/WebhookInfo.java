package io.github.natanimn.types;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class WebhookInfo implements Serializable {
    public String url, ip_address, last_error_message;
    public Integer pending_update_count, last_synchronization_error_date, max_connections;
    public Boolean has_custom_certificate;
    public List<String> allowed_updates;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        WebhookInfo that = (WebhookInfo) object;
        return Objects.equals(url, that.url) && Objects.equals(ip_address, that.ip_address) &&
                Objects.equals(last_error_message, that.last_error_message) &&
                Objects.equals(pending_update_count, that.pending_update_count) &&
                Objects.equals(last_synchronization_error_date, that.last_synchronization_error_date) &&
                Objects.equals(max_connections, that.max_connections) &&
                Objects.equals(has_custom_certificate, that.has_custom_certificate) &&
                Objects.equals(allowed_updates, that.allowed_updates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, ip_address, last_error_message, pending_update_count, last_synchronization_error_date, max_connections, has_custom_certificate, allowed_updates);
    }

    @Override
    public String toString() {
        return "WebhookInfo{" +
                "url='" + url + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", last_error_message='" + last_error_message + '\'' +
                ", pending_update_count=" + pending_update_count +
                ", last_synchronization_error_date=" + last_synchronization_error_date +
                ", max_connections=" + max_connections +
                ", has_custom_certificate=" + has_custom_certificate +
                ", allowed_updates=" + allowed_updates +
                '}';
    }
}

