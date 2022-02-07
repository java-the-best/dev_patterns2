package com.github.strategy.strategy2;

public class StrategMain2 {

}

abstract class Car {
  abstract void run();
  public void stop() {
    System.out.println("stop");
  }
  public void fly() {
    System.out.println("fly");
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
