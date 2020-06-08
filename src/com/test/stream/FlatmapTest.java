package com.test.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;


class Flight{
  private final List<Leg> legs;

  public Flight(List<Leg> legs) {
    this.legs = legs;
    System.out.println("Flight with legs: " + legs);
  }

  public List<Leg> getLegs() {
    return legs;
  }
}
class Leg{
  String origin, destination;

  public Leg(String origin, String destination) {
    this.origin = origin;
    this.destination = destination;
  }

  @Override
  public String toString() {
    return "Leg(" + origin + "->" + destination + ')';
  }
}
public class FlatmapTest {
  public static void main(String[] args) {
    Leg l=new Leg("A","B");
    Leg l1=new Leg("C","D");
    Leg l2=new Leg("E","F");
    List<Leg>  list=new ArrayList<>();
    list.add(l);
    list.add(l1);
    list.add(l2);
    Flight f=new Flight(list);
    Stream<Flight> f1=Stream.of(f);
    Set<String> legs =f1.map(Flight::getLegs).flatMap(Collection::stream).flatMap(FlatmapTest::getLegAirports).collect(toSet());
System.out.println(legs);


  }
  private static Stream<String> getLegAirports(Leg leg) {
    return Stream.of(leg.origin, leg.destination);
  }
}
