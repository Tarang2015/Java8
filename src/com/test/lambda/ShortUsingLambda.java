package com.test.lambda;

import java.util.*;

public class ShortUsingLambda {
  public static void main(String[] args) {
    Map<Integer,String> map=new HashMap<>();
    map.put(1,"Tribhuwan");
    map.put(2,"Ramesh");
    map.forEach((key,value)->{
      System.out.println(key +" :" + value);
    });
    List<Employee> l= new ArrayList<>();
    l.add(new Employee("tr",34));
    l.add(new Employee("br",23));
    l.add(new Employee("se",56));
    System.out.println(l);

    Collections.sort(l, new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.getAge()-o2.getAge();
      }
    });
    System.out.println(l);
    Collections.sort(l, Comparator.comparing(Employee::getName));
    System.out.println(l);

    Collections.sort(l,(e1,e2)-> e2.getAge()-e1.getAge());
    System.out.println(l);
  }
}
