package com.nurkentaganov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml", "applicationContext.xml");
 Dog dog = context.getBean("myPet",Dog.class);
        Dog yourdog = context.getBean("myPet",Dog.class);

    }
}
