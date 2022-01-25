package com.github.builder.n1;

public class Person {

  private String firstName;
  private String lastName;
  private String middleName;
  private String salutation;
  private String suffix;
  private String streetAddress;
  private String city;
  private String state;
  private boolean isFemale;
  private boolean isEmployed;
  private boolean isHomeOwner;

  private Person() {
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getSalutation() {
    return salutation;
  }

  public String getSuffix() {
    return suffix;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public boolean isFemale() {
    return isFemale;
  }

  public boolean isEmployed() {
    return isEmployed;
  }

  public boolean isHomeOwner() {
    return isHomeOwner;
  }

  public static Person.Builder newBuilder() {
    return new Person().new Builder();
  }

  public class Builder {

    private Builder() {
    }

    public Person.Builder setLastName(String lastName) {
      Person.this.lastName = lastName;
      return this;
    }

    public Person.Builder setFirstName(String firstName) {
      Person.this.firstName = firstName;
      return this;
    }

    public Person.Builder setMiddleName(String middleName) {
      Person.this.middleName = middleName;
      return this;
    }

    public Person.Builder setSalutation(String salutation) {
      Person.this.salutation = salutation;
      return this;
    }

    public Person.Builder setSuffix(String suffix) {
      Person.this.suffix = suffix;
      return this;
    }

    public Person.Builder setStreetAddress(String streetAddress) {
      Person.this.streetAddress = streetAddress;
      return this;
    }

    public Person.Builder setCity(String city) {
      Person.this.city = city;
      return this;
    }

    public Person.Builder setState(String state) {
      Person.this.state = state;
      return this;
    }

    public Person.Builder setFemale(boolean isFemale) {
      Person.this.isFemale = isFemale;
      return this;
    }

    public Person.Builder setEmployed(boolean isEmployed) {
      Person.this.isEmployed = isEmployed;
      return this;
    }

    public Person.Builder setHomeOwner(boolean isHomeOwner) {
      Person.this.isHomeOwner = isHomeOwner;
      return this;
    }

    public Person build() {
      return Person.this;
    }
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", salutation='" + salutation + '\'' +
        ", suffix='" + suffix + '\'' +
        ", streetAddress='" + streetAddress + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", isFemale=" + isFemale +
        ", isEmployed=" + isEmployed +
        ", isHomeOwner=" + isHomeOwner +
        '}';
  }
}
