package com.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
  protected String name;
  public String message;
  protected final List<User> personList = new ArrayList<>();

  public User(String name) {
    this.name = name;
  }

  public void sendMessage(User user)
  {
    if (user != null) {
      personList.add(user);
    }

    userChecking();
  }

  protected abstract void userChecking();

  public User setMessage(String message) {
    this.message = message;
    return this;
  }
}
