package com.designpattern.state;

public class CloseState implements IGateState{
  public Gate gate;

  public CloseState(Gate gate) {
    this.gate = gate;
  }

  public Gate getGate() {
    return gate;
  }

  public CloseState setGate(Gate gate) {
    this.gate = gate;
    return this;
  }

  @Override
  public void openGate() {

  }

  @Override
  public void closeGate() {

  }

  @Override
  public void lockGate() {

  }

  @Override
  public void unlockGate() {

  }
}
