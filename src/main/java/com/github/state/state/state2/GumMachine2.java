package com.github.state.state.state2;

enum GumMachineState {
  SOLD_OUT, NO_QUARTER, HAS_QUARTER
  ,WINNER;
}

public class GumMachine2 {
  int count = 10;
  GumMachineState state = GumMachineState.NO_QUARTER;
  public void inwertQuarter() {
    if (state.equals(GumMachineState.HAS_QUARTER)) {
      System.out.println("you can't insert another quarter");
    } else if (state.equals(GumMachineState.NO_QUARTER)) {
      state = GumMachineState.HAS_QUARTER;
    } else if (state.equals(GumMachineState.SOLD_OUT)) {
      System.out.println("no gums");
    }
    else if (state.equals(GumMachineState.WINNER)) {
      System.out.println("you are winner");
    }
  }
  public void turnCrank() {
    if (state.equals(GumMachineState.HAS_QUARTER)) {
      if (count <= 0) {
        state = GumMachineState.SOLD_OUT;
      } else {
        System.out.println("selling...");
        state = GumMachineState.NO_QUARTER;
        count--;
      }
    } else if (state.equals(GumMachineState.NO_QUARTER)) {
      System.out.println("yuo didn't insert quarter");
    }
    else if (state.equals(GumMachineState.WINNER)) {
      System.out.println("give gum");
      count--;
      state = GumMachineState.NO_QUARTER;
    }
  }
}
