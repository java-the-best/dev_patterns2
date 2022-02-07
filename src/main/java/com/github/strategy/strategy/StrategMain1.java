package com.github.strategy.strategy;

public class StrategMain1 {

}

abstract class Car {
  abstract void run();
  public void stop() {
    System.out.println("stop");
  }
}

class Toyota extends Car {

  @Override
  void run() {
    System.out.println("run toyota");
  }
}

class Ferrary extends Car {

  @Override
  void run() {
    System.out.println("run ferrary");
  }
}

class Tractor extends Car {

  @Override
  void run() {
    System.out.println("run tractor");
  }
}
