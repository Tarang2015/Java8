package com.test.immutable;

public final class Employee {
  private final String name;
  private final int id;



  private final Address address;

  public Employee(String name, int id, Address address) {
    this.name = name;
    this.id = id;
this.address=address;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
  public Address getAddress() throws CloneNotSupportedException {
    return (Address) address.clone();
  }
}
