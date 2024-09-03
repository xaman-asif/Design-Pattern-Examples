package com.designpattern.strategy;

public class Aggressive implements IFighter{
  @Override
  public void fight() {
    System.out.println("Fighter is now in aggressive mood");
  }
}
