package com.designpattern.factory.example1;

public class Photo implements Media {
  @Override
  public String getType() {
    return "Photo";
  }
}
