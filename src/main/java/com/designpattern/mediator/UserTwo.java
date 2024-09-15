package com.designpattern.mediator;

public class UserTwo extends User{
  public UserTwo(String name) {
    super(name);
  }

  @Override
  protected void userChecking() {
    for (User person: personList) {
      if (person.getClass().equals(UserOne.class)) {
        System.out.println("From " + name + ":" + message);
      }
    }
  }
}
