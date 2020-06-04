package com.test.immutable;

public class ImmutabilityTest {
  public static void main(String[] args) throws CloneNotSupportedException {

    Employee employee=new Employee("tr",1,new Address("abc","IN"));
    System.out.println(employee.getId());
    System.out.println(employee.getName());
    System.out.println(employee.getAddress().getStreet());
    Address address=employee.getAddress();
    address.setStreet("ncj");
    System.out.println(address.getStreet());



  }
}
