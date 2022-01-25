package com.github.builder;

import com.github.builder.n1.Person;

public class BuilderMain {

  public static void main() {
    Person person = Person.newBuilder()
        .setFirstName("Василий")
        .setLastName("Иванов")
        .setCity("Москва")
        .build();
    System.out.println(person);
  }
}
