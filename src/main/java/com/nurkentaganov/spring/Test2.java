package com.nurkentaganov.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = applicationContext.getBean("myPet", Pet.class);
        Pet cat = applicationContext.getBean("myCat",Pet.class);
        cat.say();


        applicationContext.close();
    }
}
