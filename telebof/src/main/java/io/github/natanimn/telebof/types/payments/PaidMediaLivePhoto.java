package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.media_and_service.LivePhoto;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * The paid media is live photo
 * @author Natanim
 * @since 2.0.0
 */
@Getter
public class PaidMediaLivePhoto {
    /**
     * Type of the paid media, always “live_photo”
     */
    private String type;

    /**
     * The Photo
     */
    @SerializedName("live_photo")
    private LivePhoto livePhoto;
}
