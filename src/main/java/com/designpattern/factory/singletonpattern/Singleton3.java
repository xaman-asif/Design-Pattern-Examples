//Eagerly Created Approach

package com.designpattern.factory.singletonpattern;

public class Singleton3 {

  private static final Singleton3 uniqueInstance = new Singleton3();

  private Singleton3() {};

  public static Singleton3 createInstance() {
    return uniqueInstance;
  }
}
