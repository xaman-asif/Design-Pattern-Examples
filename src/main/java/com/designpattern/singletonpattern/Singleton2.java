//Using Lock Approach

package com.designpattern.singletonpattern;

public class Singleton2 {

  private static Singleton2 uniqueInstance;
  private static Object _lock = new Object();

  private Singleton2() {};

  public static Singleton2 createInstance() {
    synchronized (_lock) {
      if (uniqueInstance == null) {
        return new Singleton2();
      }
    }

    return uniqueInstance;
  }
}
