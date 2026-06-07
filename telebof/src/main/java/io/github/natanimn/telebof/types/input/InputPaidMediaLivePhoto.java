package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a live photo.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class InputPaidMediaLivePhoto implements InputPaidMedia{
    private String type = "live_photo";
    private String media;
    private String photo;
    transient private final List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media Video of the live photo to send.
     * @param photo The static photo to send.
     */
    public InputPaidMediaLivePhoto(File media, File photo){
        this.media = "attach://"+media.getName();
        this.photo = "attach://"+photo.getName();
        files.add(media);
        files.add(photo);
    }

    /**
     * Required
     * @param media Video of the live photo to send. Pass a file_id to send a file that exists on the Telegram servers
     * @param photo The static photo to send.
     */
    public InputPaidMediaLivePhoto(String media, File photo){
        this.media = media;
        this.photo = "attach://"+photo.getName();
        files.add(photo);
    }

    /**
     * Required
     * @param media Video of the live photo to send.
     * @param photo	The static photo to send. Pass a file_id to send a file that exists on the Telegram servers
     */
    public InputPaidMediaLivePhoto(File media, String photo){
        this.media = "attach://"+media.getName();
        this.photo = photo;
        files.add(media);
    }

    /**
     * Required
     * @param media Video of the live photo to send. Pass a file_id to send a file that exists on the Telegram servers
     * @param photo The static photo to send. Pass a file_id to send a file that exists on the Telegram servers
     */
    public InputPaidMediaLivePhoto(String media, String photo){
        this.media = media;
        this.photo = photo;
    }

    @Override
    public boolean hasFile(){
        return !files.isEmpty();
    }

    @Override
    public List<File> getFiles(){
        return files;
    }
}
