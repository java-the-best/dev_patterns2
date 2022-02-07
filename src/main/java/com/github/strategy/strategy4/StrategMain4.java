package com.github.strategy.strategy4;

public class StrategMain4 {

  public static void main() {
    Car toyota = new Toyota(new FlyCar());
    Car tractor = new Tractor(new NoFly());
    toyota.fly();
    tractor.fly();
  }
}

interface Flyable {
  void fly();
}

class FlyCar implements Flyable {

  @Override
  public void fly() {
    System.out.println("fly");
  }
}

class NoFly implements Flyable {

  @Override
  public void fly() {
    System.out.println("no fly");
  }
}

abstract class Car {
  Flyable flyable;
  public Car(Flyable flyable) {
    this.flyable = flyable;
  }
  abstract void run();
  public void stop() {
    System.out.println("stop");
  }
  public void fly() {
    flyable.fly();
  }
}

class Toyota extends Car {
  public Toyota(Flyable flyable) {
    super(flyable);
  }
  @Override
  void run() {
    System.out.println("run toyota");
  }
}

class Ferrary extends Car {
  public Ferrary(Flyable flyable) {
    super(flyable);
  }
  @Override
  void run() {
    System.out.println("run ferrary");
  }
}

class Tractor extends Car {
  public Tractor(Flyable flyable) {
    super(flyable);
  }
  @Override
  void run() {
    System.out.println("run tractor");
  }
}
