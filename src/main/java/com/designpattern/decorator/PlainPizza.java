package com.designpattern.decorator;

public class PlainPizza implements IPizza {
  @Override
  public String getDescription() {
    return "Thin Dough";
  }

  @Override
  public double getCost() {
    return 4;
  }
}
