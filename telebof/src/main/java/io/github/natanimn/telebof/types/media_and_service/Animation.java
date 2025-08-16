package io.github.natanimn.telebof.types.media_and_service;

/**
  * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
  * @author Natanim
  * @since 3 March 2025
  * @version 0.9
  */
public class Animation {
     /**
      * Identifier for this file, which can be used to download or reuse the file
      */
    public String file_id;

     /**
      * Unique identifier for this file, which is supposed to be the same over time and for different bots.
      * Can't be used to download or reuse the file.
      */
    public String file_unique_id;

     /**
      * Optional. Original animation filename as defined by the sender
      */
    public String file_name;

     /**
      * Optional. MIME type of the file as defined by the sender
      */
    public String mime_type;

     /**
      * Video width as defined by the sender
      */
    public Integer width;

     /**
      * Video height as defined by the sender
      */
    public Integer height;

     /**
      * Duration of the video in seconds as defined by the sender
      */
    public Integer duration;

     /**
      * Optional. File size in bytes.
      */
    public Long file_size;

     /**
      * Optional. Animation thumbnail as defined by the sender
      */
    public PhotoSize thumbnail;

}

