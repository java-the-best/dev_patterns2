package com.github.state.state3;

abstract class State {
  int count = 10;
  abstract public void insertQuarter(GumMachine3 gumMachine);
  abstract public void turnCrank(GumMachine3 gumMachine);
}

public class GumMachine3 {
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
  public void insertQuarter(GumMachine3 gumMachine) {
    System.out.println("no gums");
  }

  @Override
  public void turnCrank(GumMachine3 gumMachine) {
    System.out.println("no gums");
  }
}

class HasQuarter extends State {

  @Override
  public void insertQuarter(GumMachine3 gumMachine) {
    System.out.println("you have set quarter alredy");
  }

  @Override
  public void turnCrank(GumMachine3 gumMachine) {
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
  public void insertQuarter(GumMachine3 gumMachine) {
    gumMachine.state = new HasQuarter();
  }

  @Override
  public void turnCrank(GumMachine3 gumMachine) {
    System.out.println("on quarter");
  }
}
