package com.github.strategy.strategy3;

public class StrategMain3 {

}

interface Flyable {
  void fly();
}

abstract class Car {
  abstract void run();
  public void stop() {
    System.out.println("stop");
  }
}

class Toyota extends Car implements Flyable {

  @Override
  void run() {
    System.out.println("run toyota");
  }

  @Override
  public void fly() {
    System.out.println("fly");
  }
}

class Ferrary extends Car implements Flyable {

  @Override
  void run() {
    System.out.println("run ferrary");
  }

  @Override
  public void fly() {
    System.out.println("fly");
  }
}

class Tractor extends Car {

  @Override
  void run() {
    System.out.println("run tractor");
  }
}
