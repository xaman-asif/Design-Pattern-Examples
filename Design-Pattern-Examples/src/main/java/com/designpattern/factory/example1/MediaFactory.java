package com.designpattern.factory.example1;

public class MediaFactory {
  public static Media factory (String mediaType) {
    if (mediaType.equalsIgnoreCase("Audio")) {
      return new Audio();
    } else if (mediaType.equalsIgnoreCase("Video")) {
      return new Video();
    } else if (mediaType.equalsIgnoreCase("Photo")) {
      return new Photo();
    }
    return null;
  }
}
