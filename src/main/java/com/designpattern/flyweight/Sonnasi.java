package com.designpattern.flyweight;

public class Sonnasi implements ISoldier {
  public int healthStatus;
  public static int objectCount = 0;
  @Override
  public void move(int x1, int y1, int x2, int y2) {
    System.out.printf("Sonnasi soldier is moving from (%d, %d) to (%d, %d)", x1, y1, x2, y2);
  }

  public Sonnasi(int healthStatus) {
    this.healthStatus = healthStatus;
    objectCount++;
  }

  public int getHealthStatus() {
    return healthStatus;
  }

  public Sonnasi setHealthStatus(int healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

  public static int getObjectCount() {
    return objectCount;
  }

  public static void setObjectCount(int objectCount) {
    Sonnasi.objectCount = objectCount;
  }
}
