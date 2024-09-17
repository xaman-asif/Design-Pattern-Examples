package com.designpattern.state;

public class Gate {
  private int opened = 1;
  private int closed = 2;
  private int locked = 3;
  private int unlocked = 4;

  public int currentState = opened;

  public void openGate() {
    if (currentState == opened) {
      System.out.println("The gate is already open...");
    } else if (currentState == closed) {
      currentState = opened;
      System.out.println("The gate is now opened from closed state");
    } else if (currentState == locked) {
      System.out.println("Please unlock the gate and open it");
    } else if (currentState == unlocked) {
      currentState = opened;
      System.out.println("The gate is now unlocked and opended");
    }
  }

  public void CloseGate()
  {
    if (currentState == opened)
    {
      currentState = closed;
      System.out.println("The gate has been closed successfully........");

    }
    else if (currentState == closed)
    {
      System.out.println("The gate is already closed.You can not close it again!!");
    }
    else if (currentState == locked)
    {
      System.out.println("The gate is locked. So you can not close this gate!!");
    }
    else if (currentState == unlocked)
    {
      System.out.println("The gate is unlocked, so it is already closed!!!!!!!");
    }
  }

  public void LockGate()
  {
    if (currentState == opened)
    {
      System.out.println("Please Close the Gate first and then lock it..");
    }
    else if (currentState == closed)
    {
      currentState = locked;
      System.out.println("The Gate has been locked successfully..");
    }
    else if (currentState == locked)
    {
      System.out.println("The gate is already locked, can not lock again");
    }
    else if (currentState == unlocked)
    {
      currentState = locked;
      System.out.println("The gate went to  Locked state from Unlocked state...");
    }
  }

  public void UnLockGate()
  {
    if (currentState == opened)
    {
      System.out.println("The gate is open, can not be unlocked.....");
    }
    else if (currentState == closed)
    {
      System.out.println("The gate is close, can not be unlocked....");
    }
    else if (currentState == locked)
    {
      currentState = closed;
      System.out.println("The gate is unlocked, but it is closed...");
    }
    else if (currentState == unlocked)
    {
      System.out.println("The gate is unlocked already...Can not unlock again");
    }
  }
}
