package com.designpattern.decorator;

public class PizzaMaker {
  public static void main(String[] args) {
    IPizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

    System.out.println("Ingridients: " + basicPizza.getDescription());
    System.out.println("Price: " + basicPizza.getCost());
  }
}
