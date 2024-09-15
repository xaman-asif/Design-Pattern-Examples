package com.designpattern.bridge;

public class LinuxKernelApi extends AbstractOsBridge{
  public LinuxKernelApi(SchedulingAlgorithm schedulingAlgorithm) {
    super(schedulingAlgorithm);
  }

  @Override
  public void executeAlgorithm() {
    schedulingAlgorithm.applyAlgorithm();
    System.out.println("in Linux Kernel...");
  }
}
