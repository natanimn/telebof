package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This object represent a user's profile pictures.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}