package com.nurkentaganov.spring;


import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat constructor");
    }
    public void say(){
        System.out.println("Mow-mow");
    }
}
