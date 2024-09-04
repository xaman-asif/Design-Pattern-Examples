package com.designpattern.decorator;

public class TomatoSauce extends ToppingDecorator {

  public TomatoSauce(IPizza newPizza) {
    super(newPizza);

    System.out.println("Adding Sauce");
    System.out.println("Adding Mozzarella");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Tomato Sauce";
  }

  public double getCost() {
    return tempPizza.getCost() + .35;
  }
}
