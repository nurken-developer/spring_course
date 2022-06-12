package com.nurkentaganov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component("personBean")
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

     @Autowired
     public Person(Pet pet) {
          System.out.println("Person constructor is created");
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
