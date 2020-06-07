package com.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
  int id;
  String name;
  float price;
  public Product(int id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
public class ReduceExample {
  public static void main(String[] args) {
    List<Product> productsList = new ArrayList<>();
    //Adding Products
    productsList.add(new Product(1,"HP Laptop",25000f));
    productsList.add(new Product(2,"Dell Laptop",30000f));
    productsList.add(new Product(3,"Lenevo Laptop",29000f));
    productsList.add(new Product(4,"Sony Laptop",28000f));
    productsList.add(new Product(5,"Apple Laptop",90000f));
    productsList.add(new Product(6,"Apple Laptop",80000f));
    Stream<Product> pr=productsList.stream();

    Float totalPrice =pr
        .map(Product::getPrice)
        .reduce(0.0f,(sum,price)->sum+price);
    //.reduce(0.0f,Float::sum);
    System.out.println(totalPrice);

    Stream<Product> pr1=productsList.stream();
   Product p= pr1.max((p1,p2)->p1.price>p2.price?1:-1).get();
   System.out.println(p.price);

    Stream<Product> pr2=productsList.stream();
    Double avg= pr2.mapToDouble(Product::getPrice)
       .average().getAsDouble();
    System.out.println(avg);


    Stream<Product> pr3=productsList.stream();
    Map<String,Long> map=pr3.collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
    System.out.println(map);

  }
}
