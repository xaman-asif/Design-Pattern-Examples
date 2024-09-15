package com.designpattern.mediator;

public class UserOne extends User {
  public UserOne(String name) {
    super(name);
  }

  @Override
  protected void userChecking() {
    for (User person: personList) {
      if (person.getClass().equals(UserTwo.class)) {
        System.out.println("From " + name + ":" + message);
      }
    }
  }
}
