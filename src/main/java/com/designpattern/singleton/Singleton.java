//Double Checked Lock Approach

package com.designpattern.singleton;

public class Singleton {
  private volatile static Singleton uniqueInstance;

  private static final Object _lock = new Object();

  private Singleton() {
  }

  public static Singleton createInstance() {
    if (uniqueInstance == null) {
      synchronized (_lock) {
        uniqueInstance = new Singleton();
      }
    }
    return uniqueInstance;
  }
}
