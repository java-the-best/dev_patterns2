package com.github.singleton.singleton2;

public class Singleton {

  // какие-то поля и геттеры

  private Singleton() {
  }

  private volatile static Singleton instance;

  public synchronized static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
