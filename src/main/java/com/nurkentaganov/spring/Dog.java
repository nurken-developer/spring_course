package com.nurkentaganov.spring;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void say(){
        System.out.println("Bow-bow");
    }


    public void init() {
        System.out.println("init method is created");
    }
    public  void destroy(){
        System.out.println("Destroy method is created");
    }
}
