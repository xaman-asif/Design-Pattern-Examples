package com.designpattern.facade;

public class Body {
  public Body() {

  }
  public void addBody(BodyType bodyType) {
    System.out.println(bodyType.name() + " Body Added");
  }
}
