package com.designpattern.bridge;

public class LinuxRoundRobin implements RoundRobin {

  @Override
  public void applyAlgorithm() {
    System.out.println("Round Robin Thread Scheduling using Linux Kernel API");
  }
}
