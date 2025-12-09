package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represent a user's profile pictures.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class UserProfilePhotos {
    /**
     * Total number of profile pictures the target user has
     */
    @SerializedName("total_count")
    private Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    private List<PhotoSize> photos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public List<PhotoSize> getPhotos() {
        return photos;
    }
}