package com.designpattern.decorator;

public class Mozzarella extends ToppingDecorator {

  public Mozzarella(IPizza newPizza) {
    super(newPizza);

    System.out.println("Adding Dough");
    System.out.println("Adding Mozzarella");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Mozzarella";
  }

  public double getCost() {
    return tempPizza.getCost() + .50;
  }
}
