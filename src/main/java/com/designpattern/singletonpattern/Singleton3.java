//Eagerly Created Approach

package com.designpattern.singletonpattern;

public class Singleton3 {

  private static final Singleton3 uniqueInstance = new Singleton3();

  private Singleton3() {
    if (uniqueInstance != null) {
      throw new IllegalStateException();
    }
  };

  public static Singleton3 createInstance() {
    return uniqueInstance;
  }
}
