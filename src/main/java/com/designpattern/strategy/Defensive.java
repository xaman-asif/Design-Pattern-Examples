package com.designpattern.strategy;

public class Defensive implements IFighter {
  @Override
  public void fight() {
    System.out.println("Fighter is now in defensive mood");
  }
}
