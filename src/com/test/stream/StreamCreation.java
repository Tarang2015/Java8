package com.test.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
  public static void main(String[] args) {

    Stream<String> stream=Stream.of("A","B","C");
    stream.forEach(System.out::println);
    System.out.println("===============");
    Stream<Integer> stream1=Stream.of(new Integer[]{10,2,4,6,70,0});
    stream1.forEach(System.out::println);

    System.out.println("===============");
   /* Stream<Date> stream2 = Stream.generate(() -> { return new Date(); });
    stream2.forEach(p -> System.out.println(p));*/
    System.out.println("===============");
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i< 10; i++){
      list.add(i);

    }
    Stream<Integer> integerStream=list.stream();
    integerStream.filter(n->n%2==0).collect(Collectors.toList()).forEach(p->System.out.println(p));
    System.out.println("===============");
    Stream<Integer> integerStream1=list.stream();
    Long count= integerStream1.filter(n->n%2==0).count();
    System.out.println(count);

    System.out.println("------------");

    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");
    Stream<String> names=memberNames.stream();
    names.filter(s->s.startsWith("A"))
        .map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    System.out.println("------------");
    Stream<String> names1=memberNames.stream();
    names1.sorted()
        .map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    System.out.println("------------");
    Stream<String> names2=memberNames.stream();
    names2.sorted(Comparator.reverseOrder()).map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
}
