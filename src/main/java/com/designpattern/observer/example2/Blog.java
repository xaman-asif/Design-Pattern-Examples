package com.designpattern.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable{
  private String postTitle;
  private List<Subscriber> subscribers;

  public Blog() {
    subscribers = new ArrayList<>();
  }

  public Blog setPostTitle(String postTitle) {
    if (this.postTitle != postTitle) {
      this.postTitle = postTitle;
      notifySubscribers(subscribers);
    }
    return this;
  }

  public void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  public void unsubscribe(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void notifySubscribers(List<Subscriber> subscribers) {
    for (Subscriber subscriber: subscribers) {
      subscriber.getNotification(postTitle);
    }
  }
}
