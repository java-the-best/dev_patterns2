package com.github.state.state;

import com.github.state.state.state4.GumMachine4;

public class StateMain {

  public static void main() {
    GumMachine4 gumMachine = new GumMachine4();
    gumMachine.insertQuarter();
    gumMachine.insertQuarter();
    gumMachine.turnCrank();
  }
}
