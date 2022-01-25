package com.github.singleton.singleton3;

public class Singleton {

  // какие-то поля и геттеры

  private Singleton() {
  }

  private volatile static Singleton instance;

  public synchronized static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
