package io.github.natanimn.types.media_and_service;

import io.github.natanimn.types.chat_and_user.User;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ProximityAlertTriggered implements Serializable {
    public User traveler, watcher;
    public Integer distance;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProximityAlertTriggered that = (ProximityAlertTriggered) object;
        return Objects.equals(traveler, that.traveler) && Objects.equals(watcher, that.watcher) &&
                Objects.equals(distance, that.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traveler, watcher, distance);
    }


    @Override
    public String toString() {
        return "ProximityAlertTriggered{" +
                "traveler=" + traveler +
                ", watcher=" + watcher +
                ", distance=" + distance +
                '}';
    }
}
