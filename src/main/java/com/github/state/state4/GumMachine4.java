package com.github.state.state4;

import java.util.Random;

abstract class State {
  int count = 10;
  abstract public void insertQuarter(GumMachine4 gumMachine);
  abstract public void turnCrank(GumMachine4 gumMachine);
}

public class GumMachine4 {
  State state = new NoQurter();
  public void insertQuarter() {
    state.insertQuarter(this);
  }
  public void turnCrank() {
    state.turnCrank(this);
  }
}

class SoldOut extends State {

  @Override
  public void insertQuarter(GumMachine4 gumMachine) {
    System.out.println("no gums");
  }

  @Override
  public void turnCrank(GumMachine4 gumMachine) {
    System.out.println("no gums");
  }
}

class HasQuarter extends State {

  @Override
  public void insertQuarter(GumMachine4 gumMachine) {
    System.out.println("you have set quarter alredy");
  }

  @Override
  public void turnCrank(GumMachine4 gumMachine) {
    if (count <= 0) {
      gumMachine.state = new SoldOut();
    } else {
      System.out.println("selling...");
      count--;
      gumMachine.state = new NoQurter();
    }
  }
}

class NoQurter extends State {

  @Override
  public void insertQuarter(GumMachine4 gumMachine) {
    if (new Random().nextBoolean()) {
      System.out.println("you are winner");
      gumMachine.state = new Winner();
    } else {
      gumMachine.state = new HasQuarter();
    }
  }

  @Override
  public void turnCrank(GumMachine4 gumMachine) {
    System.out.println("on quarter");
  }
}

class Winner extends State {

  @Override
  public void insertQuarter(GumMachine4 gumMachine) {
    System.out.println("you are winner");
  }

  @Override
  public void turnCrank(GumMachine4 gumMachine) {
    System.out.println("get gum");
    gumMachine.state = new NoQurter();
  }
}
