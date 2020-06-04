package com.test.optional;

import com.test.lambda.Employee;

import java.util.Optional;

public class OptionalTest1 {
  public static void main(String[] args) {
   Employee e=null;
   if(e!=null) {
     System.out.println(e.getName());
   }
   else{
     System.out.println("null poi");
   }

    Optional<Employee> e1= Optional.empty();

      System.out.println(e1.filter(e2->{
        return e2.getName().equalsIgnoreCase("d");
      }));

  }
}

