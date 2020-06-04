package com.test.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest2 {
  public static void main(String[] args) {
    Person p =new Person("tr","tr@gmail.com");
    Person p1 =new Person("br","br@gmail.com");
    List<Person> p2=new ArrayList<>();
    p2.add(p);
    p2.add(p1);
    Optional<List<Person>> pp = Optional.ofNullable(p2);
    pp.orElse(Collections.emptyList()).stream()
        .map(Person::getEmail).map(t->t.toUpperCase())
        .collect(Collectors.toList())
    .forEach(System.out::println);


    System.out.println(pp);
  }
}
