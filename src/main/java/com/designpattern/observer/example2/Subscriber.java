package com.designpattern.observer.example2;

public interface Subscriber {
  void getNotification(String postTitle);

  String setName(String name);

  String getName();
}
