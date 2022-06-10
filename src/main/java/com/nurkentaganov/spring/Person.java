package com.nurkentaganov.spring;

import java.sql.SQLOutput;

public class Person {
     private Pet pet;
     private String surname;
     private int age;


     public void setSurname(String surname) {
          this.surname = surname;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getSurname() {
          return surname;
     }

     public int getAge() {
          return age;
     }

     public Person(Pet pet) {
          System.out.println("Person bean is created");
          this.pet = pet;
     }
     public void setPet(Pet pet) {
          System.out.println("Class peron: set pet");
          this.pet= pet;
     }


     public void callYouPet(){
          System.out.println("Hello My lovely Pet");
          pet.say();
     }
}
