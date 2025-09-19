package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represent a user's profile pictures.
 * @param totalCount Total number of profile pictures the target user has
 * @param photos Requested profile pictures (in up to 4 sizes each)
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record UserProfilePhotos(
        @SerializedName("total_count") Integer totalCount,
        List<PhotoSize> photos
) {}