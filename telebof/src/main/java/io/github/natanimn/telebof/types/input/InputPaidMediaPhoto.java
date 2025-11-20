package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a photo.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputPaidMediaPhoto(
        String media,
        List<File> files
) implements InputPaidMedia {

    @Override
    public String type() {
        return "photo";
    }

    @Override
    public boolean hasFile() {
        return files != null && !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    public static class InputPaidMediaPhotoBuilder{
        public String media;
        public File mediaX;

        /**
         * Creates a new InputPaidMediaPhotoBuilder
         * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
         */
        public InputPaidMediaPhotoBuilder(String media) {
            this.media = media;
        }

        /**
         * Creates a new InputPaidMediaPhotoBuilder
         * @param media File to send. Pass an object of File to upload from your local machine.
         */
        public InputPaidMediaPhotoBuilder(File media){
            this.mediaX = media;
        }

        public InputPaidMediaPhoto build(){
            if (media != null)
                return new InputPaidMediaPhoto(media, new ArrayList<>());
            else {
                List<File> files = new ArrayList<>();
                files.add(mediaX);
                return new InputPaidMediaPhoto("attach://" + mediaX.getName(), files);
            }
        }
    }
}