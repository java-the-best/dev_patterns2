package com.github.singleton.singleton;

public class Singleton {

  // какие-то поля и геттеры

  private Singleton() {
  }

  private static Singleton instance;

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
