package com.designpattern.bridge;

public abstract class AbstractOsBridge {
  protected SchedulingAlgorithm schedulingAlgorithm;

  public AbstractOsBridge(SchedulingAlgorithm schedulingAlgorithm) {
    this.schedulingAlgorithm = schedulingAlgorithm;
  }

  public abstract void executeAlgorithm();
}
